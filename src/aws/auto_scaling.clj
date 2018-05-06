(ns aws.auto-scaling
  "AUTOGENERATED clojure.spec definitions"
  (:require [clojure.spec.alpha]))

(clojure.spec.alpha/def
 :aws.auto-scaling/scheduled-action
 (clojure.spec.alpha/keys
  :req
  [:aws.auto-scaling/auto-scaling-group-name]
  :opt
  [:aws.auto-scaling/desired-capacity
   :aws.auto-scaling/end-time
   :aws.auto-scaling/max-size
   :aws.auto-scaling/min-size
   :aws.auto-scaling/recurrence
   :aws.auto-scaling/start-time]))
(clojure.spec.alpha/def
 :aws.auto-scaling/launch-configuration
 (clojure.spec.alpha/keys
  :req
  [:aws.auto-scaling/image-id :aws.auto-scaling/instance-type]
  :opt
  [:aws.auto-scaling/placement-tenancy
   :aws.auto-scaling/kernel-id
   :aws.auto-scaling/instance-id
   :aws.auto-scaling/associate-public-ip-address
   :aws.auto-scaling/instance-monitoring
   :aws.auto-scaling/security-groups
   :aws.auto-scaling/ebs-optimized
   :aws.auto-scaling/classic-link-vpc-id
   :aws.auto-scaling/key-name
   :aws.auto-scaling/spot-price
   :aws.auto-scaling/ram-disk-id
   :aws.auto-scaling/classic-link-vpc-security-groups
   :aws.auto-scaling/block-device-mappings
   :aws.auto-scaling/user-data
   :aws.auto-scaling/iam-instance-profile]))
(clojure.spec.alpha/def
 :aws.auto-scaling/scaling-policy
 (clojure.spec.alpha/keys
  :req
  [:aws.auto-scaling/auto-scaling-group-name]
  :opt
  [:aws.auto-scaling/min-adjustment-magnitude
   :aws.auto-scaling/scaling-adjustment
   :aws.auto-scaling/cooldown
   :aws.auto-scaling/estimated-instance-warmup
   :aws.auto-scaling/step-adjustments
   :aws.auto-scaling/adjustment-type
   :aws.auto-scaling/metric-aggregation-type
   :aws.auto-scaling/target-tracking-configuration
   :aws.auto-scaling/policy-type]))
(clojure.spec.alpha/def
 :aws.auto-scaling/lifecycle-hook
 (clojure.spec.alpha/keys
  :req
  [:aws.auto-scaling/auto-scaling-group-name
   :aws.auto-scaling/lifecycle-transition]
  :opt
  [:aws.auto-scaling/default-result
   :aws.auto-scaling/heartbeat-timeout
   :aws.auto-scaling/lifecycle-hook-name
   :aws.auto-scaling/notification-metadata
   :aws.auto-scaling/notification-target-arn
   :aws.auto-scaling/role-arn]))
(clojure.spec.alpha/def
 :aws.auto-scaling/auto-scaling-group
 (clojure.spec.alpha/keys
  :req
  [:aws.auto-scaling/min-size :aws.auto-scaling/max-size]
  :opt
  [:aws.auto-scaling/metrics-collection
   :aws.auto-scaling/auto-scaling-group-name
   :aws.auto-scaling/instance-id
   :aws.auto-scaling/load-balancer-names
   :aws.auto-scaling/notification-configurations
   :aws.auto-scaling/vpc-zone-identifier
   :aws.auto-scaling/tags
   :aws.auto-scaling/cooldown
   :aws.auto-scaling/lifecycle-hook-specification-list
   :aws.auto-scaling/launch-configuration-name
   :aws.auto-scaling/target-group-ar-ns
   :aws.auto-scaling/health-check-type
   :aws.auto-scaling/availability-zones
   :aws.auto-scaling/termination-policies
   :aws.auto-scaling/placement-group
   :aws.auto-scaling/desired-capacity
   :aws.auto-scaling/health-check-grace-period]))
(do
 (clojure.spec.alpha/def
  :aws.auto-scaling/metric-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.auto-scaling/namespace
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.auto-scaling/statistic
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.auto-scaling/unit clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.auto-scaling/customized-metric-specification
  (clojure.spec.alpha/keys
   :req
   [:aws.auto-scaling/metric-name
    :aws.auto-scaling/namespace
    :aws.auto-scaling/statistic]
   :opt
   [:aws.auto-scaling/dimensions :aws.auto-scaling/unit])))
(do
 (clojure.spec.alpha/def
  :aws.auto-scaling/default-result
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.auto-scaling/heartbeat-timeout
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.auto-scaling/lifecycle-hook-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.auto-scaling/lifecycle-transition
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.auto-scaling/notification-metadata
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.auto-scaling/notification-target-arn
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.auto-scaling/role-arn
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.auto-scaling/lifecycle-hook-specification
  (clojure.spec.alpha/keys
   :req
   [:aws.auto-scaling/lifecycle-hook-name
    :aws.auto-scaling/lifecycle-transition]
   :opt
   [:aws.auto-scaling/default-result
    :aws.auto-scaling/heartbeat-timeout
    :aws.auto-scaling/notification-metadata
    :aws.auto-scaling/notification-target-arn
    :aws.auto-scaling/role-arn])))
(do
 (clojure.spec.alpha/def :aws.auto-scaling/key clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.auto-scaling/propagate-at-launch
  clojure.core/boolean?)
 (clojure.spec.alpha/def :aws.auto-scaling/value clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.auto-scaling/tag-property
  (clojure.spec.alpha/keys
   :req
   [:aws.auto-scaling/key
    :aws.auto-scaling/propagate-at-launch
    :aws.auto-scaling/value]
   :opt
   [])))
(do
 (clojure.spec.alpha/def
  :aws.auto-scaling/delete-on-termination
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.auto-scaling/encrypted
  clojure.core/boolean?)
 (clojure.spec.alpha/def :aws.auto-scaling/iops clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.auto-scaling/snapshot-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.auto-scaling/volume-size
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.auto-scaling/volume-type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.auto-scaling/block-device
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.auto-scaling/delete-on-termination
    :aws.auto-scaling/encrypted
    :aws.auto-scaling/iops
    :aws.auto-scaling/snapshot-id
    :aws.auto-scaling/volume-size
    :aws.auto-scaling/volume-type])))
(do
 (clojure.spec.alpha/def
  :aws.auto-scaling/disable-scale-in
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.auto-scaling/target-value
  clojure.core/double?)
 (clojure.spec.alpha/def
  :aws.auto-scaling/target-tracking-configuration
  (clojure.spec.alpha/keys
   :req
   [:aws.auto-scaling/target-value]
   :opt
   [:aws.auto-scaling/customized-metric-specification
    :aws.auto-scaling/disable-scale-in
    :aws.auto-scaling/predefined-metric-specification])))
(do
 (clojure.spec.alpha/def
  :aws.auto-scaling/granularity
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.auto-scaling/metrics-collection
  (clojure.spec.alpha/keys
   :req
   [:aws.auto-scaling/granularity]
   :opt
   [:aws.auto-scaling/metrics])))
(do
 (clojure.spec.alpha/def
  :aws.auto-scaling/predefined-metric-type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.auto-scaling/resource-label
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.auto-scaling/predefined-metric-specification
  (clojure.spec.alpha/keys
   :req
   [:aws.auto-scaling/predefined-metric-type]
   :opt
   [:aws.auto-scaling/resource-label])))
(do
 (clojure.spec.alpha/def
  :aws.auto-scaling/topic-arn
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.auto-scaling/notification-configuration
  (clojure.spec.alpha/keys
   :req
   [:aws.auto-scaling/topic-arn]
   :opt
   [:aws.auto-scaling/notification-types])))
(do
 (clojure.spec.alpha/def
  :aws.auto-scaling/device-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.auto-scaling/no-device
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.auto-scaling/virtual-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.auto-scaling/block-device-mapping
  (clojure.spec.alpha/keys
   :req
   [:aws.auto-scaling/device-name]
   :opt
   [:aws.auto-scaling/ebs
    :aws.auto-scaling/no-device
    :aws.auto-scaling/virtual-name])))
(do
 (clojure.spec.alpha/def :aws.auto-scaling/name clojure.core/string?)
 (clojure.spec.alpha/def :aws.auto-scaling/value clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.auto-scaling/metric-dimension
  (clojure.spec.alpha/keys
   :req
   [:aws.auto-scaling/name :aws.auto-scaling/value]
   :opt
   [])))
(do
 (clojure.spec.alpha/def
  :aws.auto-scaling/metric-interval-lower-bound
  clojure.core/double?)
 (clojure.spec.alpha/def
  :aws.auto-scaling/metric-interval-upper-bound
  clojure.core/double?)
 (clojure.spec.alpha/def
  :aws.auto-scaling/scaling-adjustment
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.auto-scaling/step-adjustment
  (clojure.spec.alpha/keys
   :req
   [:aws.auto-scaling/scaling-adjustment]
   :opt
   [:aws.auto-scaling/metric-interval-lower-bound
    :aws.auto-scaling/metric-interval-upper-bound])))
