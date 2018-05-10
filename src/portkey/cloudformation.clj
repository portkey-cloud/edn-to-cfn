(ns portkey.cloudformation
  "Main spec for AWS CloudFormation"
  (:require [clojure.spec.alpha :as s]))

(s/def ::resources (s/map-of string? ;; FIXME: and check name is valid AWS identifier
                             ::resource))

(s/def ::type qualified-keyword?)

(defmulti resource-type-spec ::type)
;;(defmethod resource-type-spec :default [r] (::fn/type r))

(s/def ::resource (s/multi-spec resource-type-spec ::type))

