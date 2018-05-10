(ns portkey.cloudformation.cloud-front
  "AUTOGENERATED clojure.spec definitions"
  (:require [clojure.spec.alpha]
            [portkey.cloudformation]))

(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.cloud-front/distribution
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.cloud-front/distribution-config]
   :opt
   [:portkey.cloudformation.cloud-front/tags])))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.cloud-front/cloud-front-origin-access-identity
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.cloud-front/cloud-front-origin-access-identity-config]
   :opt
   [])))
(do
 (clojure.core/defmethod
  portkey.cloudformation/resource-type-spec
  :portkey.cloudformation.cloud-front/streaming-distribution
  [___15594__auto__]
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.cloud-front/streaming-distribution-config
    :portkey.cloudformation.cloud-front/tags]
   :opt
   [])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/query-string
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/forwarded-values
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.cloud-front/query-string]
   :opt
   [:portkey.cloudformation.cloud-front/cookies
    :portkey.cloudformation.cloud-front/headers
    :portkey.cloudformation.cloud-front/query-string-cache-keys])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/default-root-object
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/comment
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/web-acl-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/price-class
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/ipv6-enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/http-version
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/distribution-config
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.cloud-front/enabled]
   :opt
   [:portkey.cloudformation.cloud-front/default-root-object
    :portkey.cloudformation.cloud-front/restrictions
    :portkey.cloudformation.cloud-front/comment
    :portkey.cloudformation.cloud-front/web-acl-id
    :portkey.cloudformation.cloud-front/logging
    :portkey.cloudformation.cloud-front/cache-behaviors
    :portkey.cloudformation.cloud-front/custom-error-responses
    :portkey.cloudformation.cloud-front/aliases
    :portkey.cloudformation.cloud-front/price-class
    :portkey.cloudformation.cloud-front/ipv6-enabled
    :portkey.cloudformation.cloud-front/origins
    :portkey.cloudformation.cloud-front/http-version
    :portkey.cloudformation.cloud-front/default-cache-behavior
    :portkey.cloudformation.cloud-front/viewer-certificate])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/origin-access-identity
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/s3-origin-config
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.cloud-front/origin-access-identity])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/restriction-type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/geo-restriction
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.cloud-front/restriction-type]
   :opt
   [:portkey.cloudformation.cloud-front/locations])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/response-code
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/error-caching-min-ttl
  clojure.core/double?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/error-code
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/response-page-path
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/custom-error-response
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.cloud-front/error-code]
   :opt
   [:portkey.cloudformation.cloud-front/response-code
    :portkey.cloudformation.cloud-front/error-caching-min-ttl
    :portkey.cloudformation.cloud-front/response-page-path])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/trusted-signers
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.cloud-front/enabled]
   :opt
   [:portkey.cloudformation.cloud-front/aws-account-numbers])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/origin-read-timeout
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/https-port
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/origin-keepalive-timeout
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/http-port
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/origin-protocol-policy
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/custom-origin-config
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.cloud-front/origin-protocol-policy]
   :opt
   [:portkey.cloudformation.cloud-front/origin-read-timeout
    :portkey.cloudformation.cloud-front/https-port
    :portkey.cloudformation.cloud-front/origin-keepalive-timeout
    :portkey.cloudformation.cloud-front/origin-ssl-protocols
    :portkey.cloudformation.cloud-front/http-port])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/comment
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/price-class
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/streaming-distribution-config
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.cloud-front/comment
    :portkey.cloudformation.cloud-front/s3-origin
    :portkey.cloudformation.cloud-front/enabled
    :portkey.cloudformation.cloud-front/trusted-signers]
   :opt
   [:portkey.cloudformation.cloud-front/logging
    :portkey.cloudformation.cloud-front/price-class
    :portkey.cloudformation.cloud-front/aliases])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/bucket
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/prefix
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/logging
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.cloud-front/bucket
    :portkey.cloudformation.cloud-front/enabled
    :portkey.cloudformation.cloud-front/prefix]
   :opt
   [])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/comment
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/cloud-front-origin-access-identity-config
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.cloud-front/comment]
   :opt
   [])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/domain-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/origin-access-identity
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/s3-origin
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.cloud-front/domain-name
    :portkey.cloudformation.cloud-front/origin-access-identity]
   :opt
   [])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/include-cookies
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/bucket
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/prefix
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/logging
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.cloud-front/bucket]
   :opt
   [:portkey.cloudformation.cloud-front/include-cookies
    :portkey.cloudformation.cloud-front/prefix])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/event-type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/lambda-function-arn
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/lambda-function-association
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.cloud-front/event-type
    :portkey.cloudformation.cloud-front/lambda-function-arn])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/smooth-streaming
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/compress
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/target-origin-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/viewer-protocol-policy
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/min-ttl
  clojure.core/double?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/max-ttl
  clojure.core/double?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/default-ttl
  clojure.core/double?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/default-cache-behavior
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.cloud-front/forwarded-values
    :portkey.cloudformation.cloud-front/target-origin-id
    :portkey.cloudformation.cloud-front/viewer-protocol-policy]
   :opt
   [:portkey.cloudformation.cloud-front/smooth-streaming
    :portkey.cloudformation.cloud-front/compress
    :portkey.cloudformation.cloud-front/lambda-function-associations
    :portkey.cloudformation.cloud-front/min-ttl
    :portkey.cloudformation.cloud-front/cached-methods
    :portkey.cloudformation.cloud-front/max-ttl
    :portkey.cloudformation.cloud-front/allowed-methods
    :portkey.cloudformation.cloud-front/default-ttl
    :portkey.cloudformation.cloud-front/trusted-signers])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/smooth-streaming
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/compress
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/target-origin-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/viewer-protocol-policy
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/min-ttl
  clojure.core/double?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/path-pattern
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/max-ttl
  clojure.core/double?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/default-ttl
  clojure.core/double?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/cache-behavior
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.cloud-front/forwarded-values
    :portkey.cloudformation.cloud-front/target-origin-id
    :portkey.cloudformation.cloud-front/viewer-protocol-policy
    :portkey.cloudformation.cloud-front/path-pattern]
   :opt
   [:portkey.cloudformation.cloud-front/smooth-streaming
    :portkey.cloudformation.cloud-front/compress
    :portkey.cloudformation.cloud-front/lambda-function-associations
    :portkey.cloudformation.cloud-front/min-ttl
    :portkey.cloudformation.cloud-front/cached-methods
    :portkey.cloudformation.cloud-front/max-ttl
    :portkey.cloudformation.cloud-front/allowed-methods
    :portkey.cloudformation.cloud-front/default-ttl
    :portkey.cloudformation.cloud-front/trusted-signers])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/restrictions
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.cloud-front/geo-restriction]
   :opt
   [])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/forward
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/cookies
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.cloud-front/forward]
   :opt
   [:portkey.cloudformation.cloud-front/whitelisted-names])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/iam-certificate-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/ssl-support-method
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/minimum-protocol-version
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/cloud-front-default-certificate
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/acm-certificate-arn
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/viewer-certificate
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:portkey.cloudformation.cloud-front/iam-certificate-id
    :portkey.cloudformation.cloud-front/ssl-support-method
    :portkey.cloudformation.cloud-front/minimum-protocol-version
    :portkey.cloudformation.cloud-front/cloud-front-default-certificate
    :portkey.cloudformation.cloud-front/acm-certificate-arn])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/domain-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/origin-path
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/origin
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.cloud-front/domain-name
    :portkey.cloudformation.cloud-front/id]
   :opt
   [:portkey.cloudformation.cloud-front/origin-custom-headers
    :portkey.cloudformation.cloud-front/s3-origin-config
    :portkey.cloudformation.cloud-front/origin-path
    :portkey.cloudformation.cloud-front/custom-origin-config])))
(do
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/header-value
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/header-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :portkey.cloudformation.cloud-front/origin-custom-header
  (clojure.spec.alpha/keys
   :req
   [:portkey.cloudformation.cloud-front/header-value
    :portkey.cloudformation.cloud-front/header-name]
   :opt
   [])))
