(ns portkey.cloudformation.api-gateway
  "AUTOGENERATED clojure.spec definitions"
  (:require [clojure.spec.alpha]
            [portkey.cloudformation]))

(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.api-gateway/request-validator
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.api-gateway/rest-api-id]
   :opt
   [:portkey.cloudformation.api-gateway/name
    :portkey.cloudformation.api-gateway/validate-request-body
    :portkey.cloudformation.api-gateway/validate-request-parameters]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/rest-api-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/validate-request-body
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/validate-request-parameters
  clojure.core/boolean?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.api-gateway/model
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.api-gateway/rest-api-id]
   :opt
   [:portkey.cloudformation.api-gateway/content-type
    :portkey.cloudformation.api-gateway/description
    :portkey.cloudformation.api-gateway/name
    :portkey.cloudformation.api-gateway/schema]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/content-type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/description
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/rest-api-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/schema
  clojure.core/any?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.api-gateway/account
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.api-gateway/cloud-watch-role-arn]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/cloud-watch-role-arn
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.api-gateway/documentation-part
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.api-gateway/location
    :portkey.cloudformation.api-gateway/properties
    :portkey.cloudformation.api-gateway/rest-api-id]
   :opt
   []))
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/properties
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/rest-api-id
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.api-gateway/method
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.api-gateway/resource-id
    :portkey.cloudformation.api-gateway/http-method
    :portkey.cloudformation.api-gateway/rest-api-id]
   :opt
   [:portkey.cloudformation.api-gateway/api-key-required
    :portkey.cloudformation.api-gateway/operation-name
    :portkey.cloudformation.api-gateway/request-models
    :portkey.cloudformation.api-gateway/request-parameters
    :portkey.cloudformation.api-gateway/authorizer-id
    :portkey.cloudformation.api-gateway/authorization-type
    :portkey.cloudformation.api-gateway/request-validator-id
    :portkey.cloudformation.api-gateway/method-responses
    :portkey.cloudformation.api-gateway/integration]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/api-key-required
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/operation-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/authorizer-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/resource-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/authorization-type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/http-method
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/request-validator-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/rest-api-id
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.api-gateway/client-certificate
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.api-gateway/description]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/description
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.api-gateway/deployment
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.api-gateway/rest-api-id]
   :opt
   [:portkey.cloudformation.api-gateway/description
    :portkey.cloudformation.api-gateway/stage-description
    :portkey.cloudformation.api-gateway/stage-name]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/description
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/rest-api-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/stage-name
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.api-gateway/base-path-mapping
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.api-gateway/domain-name]
   :opt
   [:portkey.cloudformation.api-gateway/base-path
    :portkey.cloudformation.api-gateway/rest-api-id
    :portkey.cloudformation.api-gateway/stage]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/base-path
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/domain-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/rest-api-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/stage
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.api-gateway/usage-plan-key
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.api-gateway/key-id
    :portkey.cloudformation.api-gateway/key-type
    :portkey.cloudformation.api-gateway/usage-plan-id]
   :opt
   []))
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/key-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/key-type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/usage-plan-id
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.api-gateway/resource
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.api-gateway/parent-id
    :portkey.cloudformation.api-gateway/path-part
    :portkey.cloudformation.api-gateway/rest-api-id]
   :opt
   []))
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/parent-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/path-part
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/rest-api-id
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.api-gateway/usage-plan
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.api-gateway/api-stages
    :portkey.cloudformation.api-gateway/description
    :portkey.cloudformation.api-gateway/quota
    :portkey.cloudformation.api-gateway/throttle
    :portkey.cloudformation.api-gateway/usage-plan-name]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/description
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/usage-plan-name
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.api-gateway/authorizer
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.api-gateway/rest-api-id]
   :opt
   [:portkey.cloudformation.api-gateway/type
    :portkey.cloudformation.api-gateway/identity-validation-expression
    :portkey.cloudformation.api-gateway/authorizer-credentials
    :portkey.cloudformation.api-gateway/identity-source
    :portkey.cloudformation.api-gateway/provider-ar-ns
    :portkey.cloudformation.api-gateway/authorizer-result-ttl-in-seconds
    :portkey.cloudformation.api-gateway/auth-type
    :portkey.cloudformation.api-gateway/name
    :portkey.cloudformation.api-gateway/authorizer-uri]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/identity-validation-expression
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/authorizer-credentials
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/identity-source
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/authorizer-result-ttl-in-seconds
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/auth-type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/authorizer-uri
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/rest-api-id
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.api-gateway/stage
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.api-gateway/rest-api-id]
   :opt
   [:portkey.cloudformation.api-gateway/variables
    :portkey.cloudformation.api-gateway/client-certificate-id
    :portkey.cloudformation.api-gateway/cache-cluster-size
    :portkey.cloudformation.api-gateway/cache-cluster-enabled
    :portkey.cloudformation.api-gateway/description
    :portkey.cloudformation.api-gateway/deployment-id
    :portkey.cloudformation.api-gateway/method-settings
    :portkey.cloudformation.api-gateway/stage-name
    :portkey.cloudformation.api-gateway/documentation-version]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/client-certificate-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/cache-cluster-size
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/cache-cluster-enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/description
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/deployment-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/stage-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/documentation-version
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/rest-api-id
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.api-gateway/rest-api
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.api-gateway/body
    :portkey.cloudformation.api-gateway/parameters
    :portkey.cloudformation.api-gateway/clone-from
    :portkey.cloudformation.api-gateway/body-s3-location
    :portkey.cloudformation.api-gateway/api-key-source-type
    :portkey.cloudformation.api-gateway/description
    :portkey.cloudformation.api-gateway/binary-media-types
    :portkey.cloudformation.api-gateway/fail-on-warnings
    :portkey.cloudformation.api-gateway/name
    :portkey.cloudformation.api-gateway/minimum-compression-size
    :portkey.cloudformation.api-gateway/endpoint-configuration]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/body
  clojure.core/any?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/clone-from
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/api-key-source-type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/description
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/fail-on-warnings
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/minimum-compression-size
  clojure.core/integer?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.api-gateway/documentation-version
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.api-gateway/documentation-version
    :portkey.cloudformation.api-gateway/rest-api-id]
   :opt
   [:portkey.cloudformation.api-gateway/description]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/description
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/documentation-version
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/rest-api-id
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.api-gateway/api-key
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.api-gateway/customer-id
    :portkey.cloudformation.api-gateway/description
    :portkey.cloudformation.api-gateway/enabled
    :portkey.cloudformation.api-gateway/generate-distinct-id
    :portkey.cloudformation.api-gateway/name
    :portkey.cloudformation.api-gateway/stage-keys]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/customer-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/description
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/generate-distinct-id
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/name
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.api-gateway/gateway-response
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.api-gateway/response-type
    :portkey.cloudformation.api-gateway/rest-api-id]
   :opt
   [:portkey.cloudformation.api-gateway/response-parameters
    :portkey.cloudformation.api-gateway/response-templates
    :portkey.cloudformation.api-gateway/status-code]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/response-type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/rest-api-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/status-code
  clojure.core/string?))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.api-gateway/domain-name
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.api-gateway/domain-name]
   :opt
   [:portkey.cloudformation.api-gateway/certificate-arn
    :portkey.cloudformation.api-gateway/endpoint-configuration
    :portkey.cloudformation.api-gateway/regional-certificate-arn]))
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/certificate-arn
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/domain-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/regional-certificate-arn
  clojure.core/string?))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/method
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/path
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/status-code
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/location
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.api-gateway/method
    :portkey.cloudformation.api-gateway/name
    :portkey.cloudformation.api-gateway/path
    :portkey.cloudformation.api-gateway/status-code
    :portkey.cloudformation.api-gateway/type])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/api-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/stage
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/api-stage
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.api-gateway/api-id
    :portkey.cloudformation.api-gateway/stage])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/rest-api-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/stage-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/stage-key
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.api-gateway/rest-api-id
    :portkey.cloudformation.api-gateway/stage-name])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/endpoint-configuration
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.api-gateway/types])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/burst-limit
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/rate-limit
  clojure.core/double?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/throttle-settings
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.api-gateway/burst-limit
    :portkey.cloudformation.api-gateway/rate-limit])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/status-code
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/method-response
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.api-gateway/status-code]
   :opt
   [:portkey.cloudformation.api-gateway/response-models
    :portkey.cloudformation.api-gateway/response-parameters])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/limit
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/offset
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/period
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/quota-settings
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.api-gateway/limit
    :portkey.cloudformation.api-gateway/offset
    :portkey.cloudformation.api-gateway/period])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/endpoint-configuration
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.api-gateway/types])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/uri
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/cache-namespace
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/content-handling
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/passthrough-behavior
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/credentials
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/integration-http-method
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/integration
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.api-gateway/request-templates
    :portkey.cloudformation.api-gateway/uri
    :portkey.cloudformation.api-gateway/cache-namespace
    :portkey.cloudformation.api-gateway/type
    :portkey.cloudformation.api-gateway/request-parameters
    :portkey.cloudformation.api-gateway/content-handling
    :portkey.cloudformation.api-gateway/passthrough-behavior
    :portkey.cloudformation.api-gateway/cache-key-parameters
    :portkey.cloudformation.api-gateway/integration-responses
    :portkey.cloudformation.api-gateway/credentials
    :portkey.cloudformation.api-gateway/integration-http-method])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/caching-enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/cache-ttl-in-seconds
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/metrics-enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/throttling-burst-limit
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/data-trace-enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/resource-path
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/http-method
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/cache-data-encrypted
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/throttling-rate-limit
  clojure.core/double?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/logging-level
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/method-setting
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.api-gateway/caching-enabled
    :portkey.cloudformation.api-gateway/cache-ttl-in-seconds
    :portkey.cloudformation.api-gateway/metrics-enabled
    :portkey.cloudformation.api-gateway/throttling-burst-limit
    :portkey.cloudformation.api-gateway/data-trace-enabled
    :portkey.cloudformation.api-gateway/resource-path
    :portkey.cloudformation.api-gateway/http-method
    :portkey.cloudformation.api-gateway/cache-data-encrypted
    :portkey.cloudformation.api-gateway/throttling-rate-limit
    :portkey.cloudformation.api-gateway/logging-level])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/caching-enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/cache-ttl-in-seconds
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/metrics-enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/throttling-burst-limit
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/data-trace-enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/resource-path
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/http-method
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/cache-data-encrypted
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/throttling-rate-limit
  clojure.core/double?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/logging-level
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/method-setting
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.api-gateway/caching-enabled
    :portkey.cloudformation.api-gateway/cache-ttl-in-seconds
    :portkey.cloudformation.api-gateway/metrics-enabled
    :portkey.cloudformation.api-gateway/throttling-burst-limit
    :portkey.cloudformation.api-gateway/data-trace-enabled
    :portkey.cloudformation.api-gateway/resource-path
    :portkey.cloudformation.api-gateway/http-method
    :portkey.cloudformation.api-gateway/cache-data-encrypted
    :portkey.cloudformation.api-gateway/throttling-rate-limit
    :portkey.cloudformation.api-gateway/logging-level])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/content-handling
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/selection-pattern
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/status-code
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/integration-response
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.api-gateway/status-code]
   :opt
   [:portkey.cloudformation.api-gateway/content-handling
    :portkey.cloudformation.api-gateway/response-parameters
    :portkey.cloudformation.api-gateway/response-templates
    :portkey.cloudformation.api-gateway/selection-pattern])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/bucket
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/e-tag
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/key
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/version
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/s3-location
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.api-gateway/bucket
    :portkey.cloudformation.api-gateway/e-tag
    :portkey.cloudformation.api-gateway/key
    :portkey.cloudformation.api-gateway/version])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/caching-enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/cache-ttl-in-seconds
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/client-certificate-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/metrics-enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/throttling-burst-limit
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/cache-cluster-size
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/cache-cluster-enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/description
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/data-trace-enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/cache-data-encrypted
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/throttling-rate-limit
  clojure.core/double?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/logging-level
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/documentation-version
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.api-gateway/stage-description
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.api-gateway/caching-enabled
    :portkey.cloudformation.api-gateway/variables
    :portkey.cloudformation.api-gateway/cache-ttl-in-seconds
    :portkey.cloudformation.api-gateway/client-certificate-id
    :portkey.cloudformation.api-gateway/metrics-enabled
    :portkey.cloudformation.api-gateway/throttling-burst-limit
    :portkey.cloudformation.api-gateway/cache-cluster-size
    :portkey.cloudformation.api-gateway/cache-cluster-enabled
    :portkey.cloudformation.api-gateway/description
    :portkey.cloudformation.api-gateway/data-trace-enabled
    :portkey.cloudformation.api-gateway/cache-data-encrypted
    :portkey.cloudformation.api-gateway/method-settings
    :portkey.cloudformation.api-gateway/throttling-rate-limit
    :portkey.cloudformation.api-gateway/logging-level
    :portkey.cloudformation.api-gateway/documentation-version])))
