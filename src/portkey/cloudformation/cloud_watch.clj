(ns portkey.cloudformation.cloud-watch
  "AUTOGENERATED clojure.spec definitions"
  (:require [clojure.spec.alpha]
            [portkey.cloudformation]))

(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.cloud-watch/alarm
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.cloud-watch/period
    :portkey.cloudformation.cloud-watch/threshold
    :portkey.cloudformation.cloud-watch/comparison-operator
    :portkey.cloudformation.cloud-watch/namespace
    :portkey.cloudformation.cloud-watch/metric-name
    :portkey.cloudformation.cloud-watch/evaluation-periods]
   :opt
   [:portkey.cloudformation.cloud-watch/unit
    :portkey.cloudformation.cloud-watch/treat-missing-data
    :portkey.cloudformation.cloud-watch/ok-actions
    :portkey.cloudformation.cloud-watch/insufficient-data-actions
    :portkey.cloudformation.cloud-watch/dimensions
    :portkey.cloudformation.cloud-watch/alarm-actions
    :portkey.cloudformation.cloud-watch/evaluate-low-sample-count-percentile
    :portkey.cloudformation.cloud-watch/alarm-description
    :portkey.cloudformation.cloud-watch/alarm-name
    :portkey.cloudformation.cloud-watch/extended-statistic
    :portkey.cloudformation.cloud-watch/statistic
    :portkey.cloudformation.cloud-watch/actions-enabled]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-watch/unit
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-watch/treat-missing-data
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-watch/period
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-watch/threshold
  clojure.core/double?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-watch/comparison-operator
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-watch/namespace
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-watch/evaluate-low-sample-count-percentile
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-watch/alarm-description
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-watch/alarm-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-watch/extended-statistic
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-watch/metric-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-watch/evaluation-periods
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-watch/statistic
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-watch/actions-enabled
  clojure.core/boolean?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.cloud-watch/dashboard
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.cloud-watch/dashboard-body]
   :opt
   [:portkey.cloudformation.cloud-watch/dashboard-name]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-watch/dashboard-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-watch/dashboard-body
  clojure.core/string?))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-watch/name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-watch/value
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-watch/dimension
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.cloud-watch/name
    :portkey.cloudformation.cloud-watch/value]
   :opt
   [])))
