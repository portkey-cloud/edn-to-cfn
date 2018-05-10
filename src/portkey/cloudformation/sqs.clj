(ns portkey.cloudformation.sqs
  "AUTOGENERATED clojure.spec definitions"
  (:require [clojure.spec.alpha]
            [portkey.cloudformation]))

(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.sqs/queue
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   []
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
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.sqs/fifo-queue
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.sqs/content-based-deduplication
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.sqs/redrive-policy
  clojure.core/any?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.sqs/queue-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.sqs/kms-data-key-reuse-period-seconds
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.sqs/message-retention-period
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.sqs/visibility-timeout
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.sqs/maximum-message-size
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.sqs/receive-message-wait-time-seconds
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.sqs/kms-master-key-id
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.sqs/queue-policy
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.sqs/policy-document
    :portkey.cloudformation.sqs/queues]
   :opt
   []))
 (clojure.spec.alpha/def
  :portkey.cloudformation.sqs/policy-document
  clojure.core/any?))
