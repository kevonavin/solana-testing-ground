(ns kev.sol.web3.convert
  (:require
   ["flow-parser" :as flow-parser]
   [clojure.string :as str]
   [promesa.core :as p]
   ["@solana/web3.js" :as web3]
   [re-frame.loggers :refer [console]]))


(defn esc-quote [s]
  (when s
    (str/replace s "\"" "\\\"")))

(defn clj->typedoc [t]
  (case (:type t)
    :generic (str "`" (:thing t) "`" "<"
                  (str/join "," (map clj->typedoc (:params t)))
                  ">")
    :union (str/join "|" (map clj->typedoc (:vals t)))
    :string-literal (esc-quote (str "\"" (:value t) "\""))
    :tuple (str "("
                (str/join "," (map clj->typedoc (:vals t)))
                ")")
    (str "`" (name (:type t)) "`")))

(defn make-fn [{:keys [name comments static? method? class]
                {:keys [type rest params return]} :value}]
  (let [classes (when class [class])
        constructor? (= "constructor" name)]
    (cond
      (not (or (nil? name) (nil? class) static? method?))
      `(~'defn ~(symbol (str/join "_-" (conj classes name)))
        ~(or comments "")
        [~'this]
        (aget ~'this ~name))
      (= type :function)
      `(~'defn ~(symbol (str/join "_" (conj classes name)))
               ~(str/join "\n"
                          (concat
                           [comments]
                           (for [{:keys [name value]} params]
                             (str name " - "
                                  (clj->typedoc value)))
                           (when rest
                             [(str "& rest - "
                                   (clj->typedoc (:value rest)))])
                           ["\n"
                            (str "@return -" (clj->typedoc return))]))
               ~(if (or constructor? static?)
                  `[~'& ~'args]
                  `[~'this ~'& ~'args])
               ~(cond
                  constructor?
                  `(let [~'f (js/Function.prototype.bind.apply
                              (~'.. web3  ~@(map #(symbol (str "-" %)) classes))
                              (clj->js (cons nil ~'args)))]
                     (new ~'f))

                  static?
                  `(~'apply
                    (~'.bind
                     (~'.. web3  ~@(map #(symbol (str "-" %)) (conj (vec classes) name)))
                     ~(if classes
                        `(~'.. web3  ~@(map #(symbol (str "-" %)) classes))
                        `web3))
                    ~'args)

                  (seq classes)
                  `(~'apply
                    (~'.bind
                     (aget ~'this ~name)
                     ~'this)
                    ~'args)

                  :else
                  `((aget `web3 ~class ~name)
                    ~(throw (new js/Error "unimplemented")))))
      :else `(comment "can only make function currently!!"))))

(defn type-alias-def [name thing]
  `(def ~(symbol name)
     ~(case (:type thing)
        :object
        (into {}
          (map (fn [{:keys [name value class comments method?]}]
                 [name
                  (if method?
                    (str "method - `" class "_" name "`")
                  (str comments " "
                            (clj->typedoc value)))]))
          (:value thing))
        (clj->typedoc thing))))

;; problems
;; vars are just :type of not function it seems?
;; missing params
(defn type->clj [o & [{:keys [class] :as ctx}]]
  (case (:type o)
    "ObjectTypeAnnotation" (let [props (into []
                                          (map #(type->clj % ctx))
                                          (-> o :properties))]
                             {:type :object
                              :value props})
    "FunctionTypeAnnotation" {:type :function
                              :params (mapv type->clj (:params o))
                              :rest (when-let [rest (:rest o)]
                                      (type->clj rest))
                              :return (type->clj (:returnType o)) }
    "FunctionTypeParam"  {:type :param
                          :name (-> o :name :name)
                          :value (type->clj (:typeAnnotation o))}
    "GenericTypeAnnotation" {:type :generic
                             :name (-> o :id :name)
                             :thing (-> o :id :name)
                             :params (mapv type->clj (-> o :typeParameters :params))}
    "UnionTypeAnnotation" {:type :union
                           :vals (mapv type->clj (:types o))}
    "TupleTypeAnnotation" {:type :tuple
                           :vals (mapv type->clj (:types o))}
    "AnyTypeAnnotation"   {:type :any}
    "NumberTypeAnnotation" {:type :number}
    "StringTypeAnnotation" {:type :string}
    "BooleanTypeAnnotation" {:type :bool}
    "StringLiteralTypeAnnotation" {:type :string-literal
                                   :value (:value o)
                                   :raw o}
    "ObjectTypeProperty" (as-> {:comments (esc-quote
                                           (or (-> o :key :leadingComments first :value)
                                               (-> o :leadingComments first :value)))
                                :type :object-property
                                :static? (:static o)
                                :method? (:method o)
                                :name (-> o :key :name)
                                :class class
                                :value (type->clj (:value o))} $
                           (assoc $ :code (make-fn $)))
    o))

(defn decl->clj [decl]
  (case (:type decl)
    "ObjectTypeAnnotation" {:object
                            (type->clj decl)}
    ;; TODO show type info?
    "TypeAlias" (let [name (-> decl :id :name)
                      thing (type->clj (:right decl) {:class name})]
                  {:type-alias name
                   :thing thing
                   :code (type-alias-def name thing)
                   #_#_'x (console :log (assoc decl
                                           :thing thing))})
    "DeclareFunction" (let [name (-> decl :id :name)
                            thing (type->clj (-> decl :id :typeAnnotation :typeAnnotation))]
                        (assoc decl
                               :name name
                               :thing thing
                               :code (make-fn {:name name
                                               :comments (:comments decl)
                                               :static? true
                                               :value thing})))
    "DeclareVariable" {:var (-> decl :id :name)}
    "DeclareClass" (let [name (-> decl :id :name)
                         thing (type->clj (:body decl) {:class name})]
                     (when (= name "Keypair")
                       (console :log decl))
                     {:class name
                      :code (type-alias-def name thing)
                      :value thing})
    decl))

(defn flow->clj [o]
  (case (:type o)
    "Program"       (reduce #(merge %1 %2)
                            {}
                            (map flow->clj (:body o)))
    "DeclareModule" {(-> o :id :value)
                     (flow->clj (:body o))}
    "BlockStatement" (into []
                       (comp (map flow->clj))
                       (:body o))
    "DeclareExportDeclaration" (merge {:comments (some-> o
                                                         :leadingComments
                                                         first
                                                         :value)}
                                      (decl->clj (:declaration o)))
    "DeclareInterface" (let [name (-> o :id :name)
                             thing (type->clj (:body o) {:class name})]
                         {:interface name
                          :code (type-alias-def name thing)
                          :value thing})
    nil))

(defn def-parsed-flow []
  (-> (js/fetch "https://unpkg.com/@solana/web3.js@latest/module.flow.js")
      (p/promise)
      (p/then (fn [r]
                (.text r)))
      (p/then (fn [flow-stuff]
                (let [parsed
                      (flow-parser/parse flow-stuff
                                         (clj->js {:enums true
                                                   :esproposal_class_instance_fields true
                                                   :esproposal_class_static_fields true
                                                   :esproposal_decorators true}))]
                  (console :log parsed)
                  (def parsed-flow
                    (js->clj parsed :keywordize-keys true)))))))

(comment

  (console :log parsed-flow)
  (require '[clojure.walk :as walk])
  (clojure.walk/postwalk
   (fn [x]
     (when (= x "Ed25519Keypair")
       (console :log "found!")))
   parsed-flow)


  (def-parsed-flow)
  (console :log (apply str (repeat 20 "\n")))


  )
