(ns kev.sol.core
  (:require
   [com.wsscode.async.async-cljs :as ac]
   [promesa.core :as p]
[cljs.tools.reader.edn :as edn]
   [kev.sol.core-events :as core-events]
   [re-frame.core :as rf]
   [re-frame.loggers :refer [console]]
   ["@solana/wallet-adapter-react" :refer [WalletProvider useWallet]]
   ["@solana/wallet-adapter-material-ui" :refer
    [WalletDialogProvider WalletMultiButton WalletDisconnectButton]]
   ["@solana/web3.js" :as web3]
   [re-frame.db :as re.db]
   ["@solana/wallet-adapter-wallets" :refer
    [PhantomWalletAdapter,
     LedgerWalletAdapter,
     SlopeWalletAdapter,
     SolflareWalletAdapter,
     SolletExtensionWalletAdapter,
     SolletWalletAdapter,
     TorusWalletAdapter]]
   ["@mui/material" :as mui]
   ["@mui/icons-material" :as mui.icons]
   [kev.sol.web3.lib :as kweb3]
   [reagent.core :as r]
   [reagent.ratom :as ratom]
   ["react" :as react]
   [reagent.dom :as rdom]))

(defn deep-merge [& ms]
  (apply merge-with #(if (and (map? %1)
                              (map? %2))
                 (merge %1 %2)
                 %2)
         ms))

(rf/reg-event-fx
 :test/click
 (fn [{:keys [db]} _evt]
   {:db (update db :test/numclicks (fnil inc 0))}))

(rf/reg-sub
 :test/clicks
 (fn [db _v]
   (:test/numclicks db)))

(rf/reg-event-fx
 :core/update-data
 [rf/debug]
 (fn [{:keys [db]} [_ data]]
   {:db (deep-merge db data)}))

(rf/reg-event-fx
 :wallet/data-update
 [rf/debug]
 (fn [{:keys [db]} [_ data]]
   {:db (update db :wallet/data #(deep-merge % data))}))

(rf/reg-sub
 :wallet/data
 (fn [db _]
   (:wallet/data db)))

(defn key-seq [xs]
  (map-indexed (fn [i x]
                 (with-meta x {:key i}))
               xs))

(defn wallet-adapter-adapter [& children]
  (let [wallet (useWallet)
        _ (react/useEffect
           #(rf/dispatch [:core/update-data {:wallet/data {:wa-wallet wallet}}])
           (clj->js [wallet]))]
    [:div
     (key-seq children)]))

(defn wallet-interop [& children]
  (let [wallets [(new PhantomWalletAdapter)]]
    [:> WalletProvider
     {:wallets wallets
      :auto-connect false}
     [:> WalletDialogProvider
      [:f> wallet-adapter-adapter
       (key-seq children)]]]))

(defn label [& xs]
  [:> mui/Paper
   {:sx {:textAlign "center"
         :m 1
         :typography "body2"
         :padding "0.4em"
         :display "inline-flex"}}
   (->> xs
        (map (fn [x]
               (if (string? x)
                 [:> mui/Typography {:variant "body1"} x]
                 x)))
        key-seq)])

(rf/reg-event-db
 :core/unsubscribe
 [rf/debug]
 (fn [db [_ id]]
   (let [{{{:keys [stop start-output]} id} :subs} db]
     (when stop
       (stop start-output))
     (update db :subs #(dissoc % id)))))

(rf/reg-event-db
 :core/subscribe
 [rf/debug]
 (fn [db [_ {:keys [id start _stop] :as sub} :as _evt]]
   (if-not (-> db :subs (get id))
     (assoc-in db [:subs id]
               (assoc sub
                      :start-output (start)))
     db)))

(rf/reg-sub-raw
 :account-info
 (fn [app-db [_ {:keys [conn pubkey]}]]
   (when-not (empty? pubkey)
     (rf/dispatch [:core/subscribe
                   {:id [:account-info pubkey]
                    :start (fn []
                             (prn "starting sub with- " pubkey)
                             (ac/go
                               (let [info (ac/<!p (.getAccountInfo conn (web3/PublicKey. pubkey)))]
                                 (rf/dispatch [:core/update-data
                                               {:account-info {pubkey (js->clj info)}}])))
                           ;; return sub-id to be used to deactivate
                             (.onAccountChange conn
                                               (web3/PublicKey. pubkey)
                                               (fn [info ctx]
                                                 (rf/dispatch [:core/update-data
                                                               {:account-info {pubkey (js->clj info)}}]))))
                    :stop (fn [sub-id]
                            (.removeAccountChangeListener conn sub-id))}]))
   (ratom/make-reaction
    (fn [] (-> @app-db :account-info (get pubkey)))
    :on-dispose (fn [] (rf/dispatch [:core/unsubscribe
                                     [:account-info pubkey]])))))

(defn account-info
  "pubkey to be string of public key.
  Name is a string, used as alias"
  [pubkey name]
  (let [conn @(rf/subscribe [:core/db [:wallet/data :conn]])
        accnt-info (when (seq pubkey)
                     @(rf/subscribe [:account-info {:conn conn
                                                    :pubkey pubkey}]))]
    [:> mui/Stack
     {:direction "row"}
     (when name [label name])
     (for [[k v] (-> (js->clj accnt-info)
                     (dissoc "owner" "data")
                     (assoc "pubkey" pubkey)
                     (->> (sort-by first)))]
       ^{:key k} [label (str k " - " v)])]))

(defn initialize! []

  (console :log "initialize called")

  (rf/dispatch-sync [:core/update-data {:wallet/data
                                        {
                                         ;; unneeded once local-store set?
                                         #_#_
                                         :conn (new web3/Connection
                                                    (web3/clusterApiUrl "devnet")
                                                    "confirmed")
                                         :test-keypair (.generate web3/Keypair)}}])

  (rf/dispatch-sync [:defaults/load])
  )


(def cluster->endpoint
  (into {}
        (map (fn [cluster]
           [cluster
            (kweb3/clusterApiUrl cluster)]))
        ["devnet" "testnet" "mainnet-beta"]))

(defn event-value
  [^js/Event e]
  (let [^js/HTMLInputElement el (.-target e)]
    (.-value el)))

(defn form-values [form-el]
  (into {}
        (keep (fn [el]
                (when (seq (.-id el))
                  [(keyword (.-id el)) (.-value el)])))
        (.-elements form-el)))

(defn update-conn [db conn-config]
  (console :log "updating conn" (pr-str conn-config))
  (cond-> db
    conn-config
    (assoc-in [:wallet/data :conn]
              (kweb3/Connection_constructor
               (:endpoint conn-config)
               (clj->js (:config conn-config))))

    true
    (assoc-in [:wallet/data :conn-config]
              conn-config)))

(rf/reg-event-fx
 :defaults/load
 [(rf/inject-cofx :core/local-store ::defaults)]
 (fn [{db :db
       {:keys [conn-config]} :local-store} _]
   {:db (-> db
            (update-conn conn-config))}))

(rf/reg-event-fx
 :defaults/store
 [(rf/inject-cofx :core/local-store ::defaults)]
 (fn [{:keys [db local-store]} [_ updates]]
   (let [updates' (update updates
                          :conn-config #(as-> % $
                                          (cond-> $
                                            (empty? (:cluster $)) (assoc :cluster "devnet"))
                                          (assoc $ :endpoint
                                                 (cluster->endpoint (:cluster $)))))
         {:keys [conn-config]
          :as new-locals} (deep-merge local-store updates')]
     {:db (-> db
              (update-conn conn-config))
      :core/local-store {::defaults new-locals}})))

(defn cluster-config []
  (let [{:keys [cluster config]} @(rf/subscribe [:core/db [:wallet/data :conn-config]])]
    [:> mui/Box
     {:component "form"
      :sx {:display "inline"}
      :on-submit (fn [evt]
                   (.preventDefault evt)
                   (let [form-vals (-> evt
                                       .-target
                                       form-values
                                       (update :config edn/read-string))]
                     (rf/dispatch [:defaults/store {:conn-config form-vals}])))}
     [:> mui/TextField
      {:id "cluster"
       :sx {:mx 1
            :width (str (count cluster) "ch")}
       :label "cluster"
       :variant "standard"
       :size "small"
       :default-value cluster}]
     [:> mui/TextField
      {:id "config"
       :sx {:mx 1
            :width (str (max (count (pr-str config))
                             6)
                        "ch")}
       :variant "standard"
       :size "small"
       :default-value (pr-str config)
       :label "config"}]

     [:> mui/Fab
      {:component "button"
       :type "submit"}
      [:> mui.icons/Refresh]]]))

(comment

  (console :log
           (kweb3/Keypair_generate))
  (def x  (kweb3/Keypair_generate))
  (js->clj x)
  (kweb3/Keypair)

  (kweb3/PublicKey_constructor)

  )
(defn accounts []
  (let [stake-accounts (@rf/subscribe [:core/db [:wallet/data :stake-accounts]])]
    [:> mui/Box
     [:> mui/Fab
      {:component "button"
       :on-click (fn [e])}]]))


(defn stuffs []
  (let [{:keys [conn wa-wallet test-keypair]} @(rf/subscribe [:wallet/data])]
    (console :log "rerender")
    [:> mui/Box
     {:sx {:minWidth 275
           :m 1}}
     [:> mui/Box
      [:> WalletMultiButton
       {:sx {:m 1}}]
      (when wa-wallet [:> WalletDisconnectButton])
      [label
       [:> mui/Typography {:variant "subtitle2"} "endpoint:"]
       [:span {:style {:width "1ch"}}]
       (aget conn "_rpcEndpoint")]
      [cluster-config]

      [:div]
      [account-info (str (.-publicKey test-keypair)) "test"]
      [:div]
      [account-info (when wa-wallet (str (.-publicKey wa-wallet))) "me"]

      [:div]
      [:> mui/Button
       {:variant "contained"
        :sx {:m 1}
        :on-click #(ac/go
                     (let [txn (-> (kweb3/Transaction_constructor)
                                   (kweb3/Transaction_add
                                    (kweb3/SystemProgram_transfer (clj->js {:fromPubkey (.-publicKey wa-wallet)
                                                                            :toPubkey (.-publicKey test-keypair)
                                                                            :lamports 10000}))))
                           sig (ac/<?maybe (.sendTransaction wa-wallet txn conn))
                           conf (ac/<!p (kweb3/Connection_confirmTransaction conn sig "processed"))]
                       conf))
        :color "secondary"}
       "transfer"]
      ]]))

(defn restartable
  "restartable component"
  [child-var]
  (let [clicks @(rf/subscribe [:test/clicks])]
    [:<>
     ^{:key clicks} [@child-var]

     ^{:key (str "refresh" clicks)}
     [:> mui/Fab
      {:on-click #(rf/dispatch [:test/click])}
      [:> mui.icons/Refresh]]]))

(resolve 'stuffs)
(comment

  (do
    (re/clear-subscription-cache!)

    #_
      (rdom/unmount-component-at-node
       (.getElementById js/document "app"))
    (rdom/render
     [:f> wallet-interop
      [restartable
       #'stuffs]]
     (.getElementById js/document "app"))
    )

  (-> @re.db/app-db :subs)

  (let [{:keys [conn test-keypair wa-wallet]} (:wallet/data @re.db/app-db)]
    ;(console :log conn)
    (aget conn "_rpcEndpoint")

    #_
      (doseq [i (range 300)]
        (-> (.removeAccountChangeListener conn i)
            (p/catch (fn [e] (log "got error"))))))

  (let [{:keys [conn test-keypair wa-wallet]} (:wallet/data @re.db/app-db)]
    (-> (kweb3/Connection_getMinimumBalanceForRentExemption conn)
        (p/handle (fn [x] (console :log :votes x)))))

  (kweb3/StakeProgram)


  ;; get airdrop
  (ac/go
    (let [sig (ac/<!p (.requestAirdrop
                       conn
                       (.-publicKey wallet)
                       web3/LAMPORTS_PER_SOL))]
      (console :log sig)))

  (ac/go
    (let [accnt (ac/<?maybe (.getBalance conn (.-publicKey wallet) nil))
          acc2 (ac/<?maybe (.getBalance conn (.-publicKey test-keypair) nil))]
      (console :log accnt acc2)))



  )


(defn ^:export init []
  (rf/clear-subscription-cache!)
  (re-frame.loggers/set-loggers!
   {:debug (fn [& args] (apply js/console.debug (map clj->js args)))
    :log   (fn [& args] (apply js/console.log (map clj->js args)))
    :warn   (fn [& args] (apply js/console.warn (map clj->js args)))
    :error   (fn [& args] (apply js/console.error (map clj->js args)))
    :group   (fn [& args] (apply js/console.group (map clj->js args)))
    :groupEnd   (fn [& args] (apply js/console.groupEnd (map clj->js args)))})

  (initialize!)

  (rdom/render
   [:f> wallet-interop ;; need the :f> bc it's a react function
    [restartable
     [stuffs]]]
   (.getElementById js/document "app")))
