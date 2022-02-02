(ns kev.sol.dev
  (:require
   [nrepl.cmdline]
   [clojure.pprint]
   [clojure.edn :as edn]
   [clojure.core.match :refer [match]]
   [clojure.walk]
   [shadow.cljs.devtools.api :as shadow.api]
   [shadow.cljs.devtools.server :as shadow.server]))

(defn cljs-eval [s]
  (->
   (shadow.api/cljs-eval :app
                         s
                         {:ns 'kev.sol.web3.convert})
   :results
   (doto tap>)
   first
   (as-> $
       (try
         (edn/read-string $)
         (catch Exception e
           (tap> e)
           [:unreadable
            $])))))


(.addMethod
 clojure.pprint/code-dispatch
 String
 (fn [s]
   (print "\"")
   (print s)
   (print "\" ")))

(defn generate-web3 []

  (cljs-eval "(def-parsed-flow)")

  (Thread/sleep 3000)

  (as-> "(-> parsed-flow
            (flow->clj)
            (get \"@solana/web3.js\"))" $
    (cljs-eval $)
    (doto $ tap>)
    (let [t (transient [])]
      (clojure.walk/prewalk
       (fn [x]
         (match x
                [:code c] (do (conj! t c)
                              x)
                _          x))
       $)
      (persistent! t))
    (->> $
         (map
          (fn [form]
            (with-out-str
              (if form
                (clojure.pprint/write form
                                      :dispatch clojure.pprint/code-dispatch)
                ";; nil parsed form")
              (println "\n"))))
         (apply str
                "(ns kev.sol.web3.lib)\n\n")
         (spit "src/kev/sol/web3/lib.cljs"))))

(comment

  (shadow.api/stop-worker :app)
  (shadow.api/watch :app)
  (shadow.api/compile :app)

  (shadow.server/start!)
  (shadow.server/stop!)
  (generate-web3)

  (tap>
   (cljs-eval "(->> parsed2 flow->clj)"))
  (tap> (cljs-eval "(as-> parsed2 $
                     ($ :body)
                     (get $ 0)
                     ($ :body)
                     ($ :body)
                     ;;(map (comp :type :declaration) $)
                     (filter #(-> % :declaration :type (= \"DeclareClass\")) $)
                     (map #(-> % :declaration) $))"))

  )

(defn -main [& args]
  (shadow.server/start!)
  (apply nrepl.cmdline/-main args))
