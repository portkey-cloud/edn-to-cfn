(ns portkey.cloudformation.io-t
  "AUTOGENERATED clojure.spec definitions"
  (:require [clojure.spec.alpha]
            [portkey.cloudformation]))

(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.io-t/thing
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.io-t/attribute-payload
    :portkey.cloudformation.io-t/thing-name]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/thing-name
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.io-t/policy-principal-attachment
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.io-t/policy-name
    :portkey.cloudformation.io-t/principal]
   :opt
   []))
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/policy-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/principal
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.io-t/certificate
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.io-t/certificate-signing-request
    :portkey.cloudformation.io-t/status]
   :opt
   []))
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/certificate-signing-request
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/status
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.io-t/thing-principal-attachment
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.io-t/principal
    :portkey.cloudformation.io-t/thing-name]
   :opt
   []))
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/principal
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/thing-name
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.io-t/policy
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.io-t/policy-document]
   :opt
   [:portkey.cloudformation.io-t/policy-name]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/policy-document
  clojure.core/any?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/policy-name
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.io-t/topic-rule
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.io-t/topic-rule-payload]
   :opt
   [:portkey.cloudformation.io-t/rule-name]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/rule-name
  clojure.core/string?))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/endpoint
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/index
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/role-arn
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/elasticsearch-action
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.io-t/endpoint
    :portkey.cloudformation.io-t/id
    :portkey.cloudformation.io-t/index
    :portkey.cloudformation.io-t/role-arn
    :portkey.cloudformation.io-t/type]
   :opt
   [])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/function-arn
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/lambda-action
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.io-t/function-arn])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/bucket-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/key
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/role-arn
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/s3-action
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.io-t/bucket-name
    :portkey.cloudformation.io-t/key
    :portkey.cloudformation.io-t/role-arn]
   :opt
   [])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/table-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/put-item-input
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.io-t/table-name]
   :opt
   [])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/action
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.io-t/cloudwatch-metric
    :portkey.cloudformation.io-t/republish
    :portkey.cloudformation.io-t/firehose
    :portkey.cloudformation.io-t/cloudwatch-alarm
    :portkey.cloudformation.io-t/sqs
    :portkey.cloudformation.io-t/dynamo-d-bv2
    :portkey.cloudformation.io-t/sns
    :portkey.cloudformation.io-t/elasticsearch
    :portkey.cloudformation.io-t/lambda
    :portkey.cloudformation.io-t/kinesis
    :portkey.cloudformation.io-t/dynamo-db
    :portkey.cloudformation.io-t/s3])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/role-arn
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/topic
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/republish-action
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.io-t/role-arn
    :portkey.cloudformation.io-t/topic]
   :opt
   [])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/delivery-stream-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/role-arn
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/separator
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/firehose-action
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.io-t/delivery-stream-name
    :portkey.cloudformation.io-t/role-arn]
   :opt
   [:portkey.cloudformation.io-t/separator])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/role-arn
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/dynamo-d-bv2-action
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.io-t/put-item
    :portkey.cloudformation.io-t/role-arn])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/attribute-payload
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.io-t/attributes])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/alarm-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/role-arn
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/state-reason
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/state-value
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/cloudwatch-alarm-action
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.io-t/alarm-name
    :portkey.cloudformation.io-t/role-arn
    :portkey.cloudformation.io-t/state-reason
    :portkey.cloudformation.io-t/state-value]
   :opt
   [])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/partition-key
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/role-arn
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/stream-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/kinesis-action
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.io-t/role-arn
    :portkey.cloudformation.io-t/stream-name]
   :opt
   [:portkey.cloudformation.io-t/partition-key])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/queue-url
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/role-arn
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/use-base64
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/sqs-action
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.io-t/queue-url
    :portkey.cloudformation.io-t/role-arn]
   :opt
   [:portkey.cloudformation.io-t/use-base64])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/metric-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/metric-namespace
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/metric-timestamp
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/metric-unit
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/metric-value
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/role-arn
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/cloudwatch-metric-action
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.io-t/metric-name
    :portkey.cloudformation.io-t/metric-namespace
    :portkey.cloudformation.io-t/metric-unit
    :portkey.cloudformation.io-t/metric-value
    :portkey.cloudformation.io-t/role-arn]
   :opt
   [:portkey.cloudformation.io-t/metric-timestamp])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/message-format
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/role-arn
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/target-arn
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/sns-action
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.io-t/role-arn
    :portkey.cloudformation.io-t/target-arn]
   :opt
   [:portkey.cloudformation.io-t/message-format])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/aws-iot-sql-version
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/description
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/rule-disabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/sql
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/topic-rule-payload
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.io-t/actions
    :portkey.cloudformation.io-t/rule-disabled
    :portkey.cloudformation.io-t/sql]
   :opt
   [:portkey.cloudformation.io-t/aws-iot-sql-version
    :portkey.cloudformation.io-t/description])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/range-key-field
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/role-arn
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/hash-key-type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/range-key-value
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/hash-key-value
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/range-key-type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/hash-key-field
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/table-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/payload-field
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.io-t/dynamo-db-action
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.io-t/role-arn
    :portkey.cloudformation.io-t/hash-key-value
    :portkey.cloudformation.io-t/hash-key-field
    :portkey.cloudformation.io-t/table-name]
   :opt
   [:portkey.cloudformation.io-t/range-key-field
    :portkey.cloudformation.io-t/hash-key-type
    :portkey.cloudformation.io-t/range-key-value
    :portkey.cloudformation.io-t/range-key-type
    :portkey.cloudformation.io-t/payload-field])))