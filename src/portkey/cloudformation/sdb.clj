(ns portkey.cloudformation.sdb
  "AUTOGENERATED clojure.spec definitions"
  (:require [clojure.spec.alpha]
            [portkey.cloudformation]))

(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.sdb/domain
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.sdb/description]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.sdb/description
  clojure.core/string?))