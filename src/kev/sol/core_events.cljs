(ns kev.sol.core-events
  (:require
   [re-frame.core :as rf]
   [re-frame.loggers :refer [console]]
   [cljs.tools.reader.edn :as edn]))

;; this is probably bad?
(rf/reg-sub
 :core/db
 (fn [db [_ get-in-keys]]
   (get-in db get-in-keys)))

;; ******************** local store stuff **************************

(rf/reg-cofx
 :core/local-store
 (fn [coeffects storage-key]
   (assoc coeffects
          :local-store
          (edn/read-string
           (js/localStorage.getItem (pr-str storage-key))))))

(rf/reg-fx
 :core/local-store
 (fn [store-map]
   (doseq [[k v] store-map]
     (js/localStorage.setItem (pr-str k) (pr-str v)))))

(rf/reg-event-fx
 :local-storage/set
 [(rf/inject-cofx :core/local-store "local-store set param")]
 (fn [{:keys [db local-store]} [_ to-store]]
   (let [new-store (merge local-store to-store)]
     {:db (assoc db :core/local-store new-store)
      :core/local-store new-store})))

(rf/reg-event-fx
 :local-storage/load
 [(rf/inject-cofx :core/local-store "local-store load param")]
 (fn [{:keys [local-store db]} _]
   {:db (assoc db :core/local-store local-store)}))
