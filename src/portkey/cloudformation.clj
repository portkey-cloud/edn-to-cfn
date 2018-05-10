(ns portkey.cloudformation
  "Main spec for AWS CloudFormation"
  (:refer-clojure :exclude [ref])
  (:require [clojure.spec.alpha :as s]))

(def logical-id-pattern #"[A-Za-z0-9]+")

(defrecord Ref [name])

(defn ref [name]
  (->Ref name))

(defn ref? [x]
  (instance? Ref x))

(defmacro ref-or-spec [pred]
  `(s/or :ref portkey.cloudformation/ref?
         :value ~pred))

(defn logical-id? [x]
  (boolean
   (and (string? x)
        (re-matches logical-id-pattern x))))

(s/def ::id logical-id?)
(s/def ::type qualified-keyword?)

(defmulti resource-type-spec ::type)
;;(defmethod resource-type-spec :default [r] (::fn/type r))

(s/def ::resource
  (s/multi-spec resource-type-spec ::type))

(s/def ::resource-like
  (s/or :single-resource ::resource
        :more-resources (s/coll-of ::resource)))

(s/def ::resources
  (s/coll-of ::resource-like))

(s/def ::template-format-version string?)

(def template-defaults
  {::template-format-version "2010-09-09"})

(s/def ::template
  (s/keys :req [::resources
                ::template-format-version]) )
