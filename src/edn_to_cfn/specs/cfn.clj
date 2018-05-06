(ns edn-to-cfn.specs.cfn
  (:require [clojure.spec.alpha :as s]))

(s/def :cfn/resources (s/map-of string? ;; FIXME: and check name is valid AWS identifier
                                :cfn/resource))

(s/def :cfn/type qualified-keyword?)

(defmulti resource-type-spec :cfn/type)
(defmethod resource-type-spec :default [r] (:cfn/type r))

(s/def :cfn/resource (s/multi-spec resource-type-spec :cfn/type))
