(ns portkey.cloudformation.sqs
  "AUTOGENERATED clojure.spec definitions"
  (:require [clojure.spec.alpha]
            [portkey.cloudformation]))

(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.sqs/queue
  [___19567__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation/id :portkey.cloudformation/type]
   :opt
   [:portkey.cloudformation.sqs/delay-seconds
    :portkey.cloudformation.sqs/fifo-queue
    :portkey.cloudformation.sqs/content-based-deduplication
    :portkey.cloudformation.sqs/redrive-policy
    :portkey.cloudformation.sqs/queue-name
    :portkey.cloudformation.sqs/kms-data-key-reuse-period-seconds
    :portkey.cloudformation.sqs/message-retention-period
    :portkey.cloudformation.sqs/visibility-timeout
    :portkey.cloudformation.sqs/maximum-message-size
    :portkey.cloudformation.sqs/receive-message-wait-time-seconds
    :portkey.cloudformation.sqs/kms-master-key-id]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.sqs/delay-seconds
  (portkey.cloudformation/ref-or-spec clojure.core/integer?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.sqs/fifo-queue
  (portkey.cloudformation/ref-or-spec clojure.core/boolean?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.sqs/content-based-deduplication
  (portkey.cloudformation/ref-or-spec clojure.core/boolean?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.sqs/redrive-policy
  (portkey.cloudformation/ref-or-spec clojure.core/any?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.sqs/queue-name
  (portkey.cloudformation/ref-or-spec clojure.core/string?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.sqs/kms-data-key-reuse-period-seconds
  (portkey.cloudformation/ref-or-spec clojure.core/integer?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.sqs/message-retention-period
  (portkey.cloudformation/ref-or-spec clojure.core/integer?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.sqs/visibility-timeout
  (portkey.cloudformation/ref-or-spec clojure.core/integer?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.sqs/maximum-message-size
  (portkey.cloudformation/ref-or-spec clojure.core/integer?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.sqs/receive-message-wait-time-seconds
  (portkey.cloudformation/ref-or-spec clojure.core/integer?))
 (clojure.spec.alpha/def
  :portkey.cloudformation.sqs/kms-master-key-id
  (portkey.cloudformation/ref-or-spec clojure.core/string?)))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.sqs/queue-policy
  [___19567__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation/id
    :portkey.cloudformation/type
    :portkey.cloudformation.sqs/policy-document
    :portkey.cloudformation.sqs/queues]
   :opt
   []))
 (clojure.spec.alpha/def
  :portkey.cloudformation.sqs/policy-document
  (portkey.cloudformation/ref-or-spec clojure.core/any?)))
