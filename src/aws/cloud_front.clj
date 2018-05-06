(ns aws.cloud-front
  "AUTOGENERATED clojure.spec definitions"
  (:require [clojure.spec.alpha]))

(clojure.spec.alpha/def
 :aws.cloud-front/distribution
 (clojure.spec.alpha/keys
  :req
  [:aws.cloud-front/distribution-config]
  :opt
  [:aws.cloud-front/tags]))
(clojure.spec.alpha/def
 :aws.cloud-front/cloud-front-origin-access-identity
 (clojure.spec.alpha/keys
  :req
  [:aws.cloud-front/cloud-front-origin-access-identity-config]
  :opt
  []))
(clojure.spec.alpha/def
 :aws.cloud-front/streaming-distribution
 (clojure.spec.alpha/keys
  :req
  [:aws.cloud-front/streaming-distribution-config
   :aws.cloud-front/tags]
  :opt
  []))
(do
 (clojure.spec.alpha/def
  :aws.cloud-front/query-string
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.cloud-front/forwarded-values
  (clojure.spec.alpha/keys
   :req
   [:aws.cloud-front/query-string]
   :opt
   [:aws.cloud-front/cookies
    :aws.cloud-front/headers
    :aws.cloud-front/query-string-cache-keys])))
(do
 (clojure.spec.alpha/def
  :aws.cloud-front/default-root-object
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.cloud-front/comment clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cloud-front/web-acl-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cloud-front/enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.cloud-front/price-class
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cloud-front/ipv6-enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.cloud-front/http-version
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cloud-front/distribution-config
  (clojure.spec.alpha/keys
   :req
   [:aws.cloud-front/enabled]
   :opt
   [:aws.cloud-front/default-root-object
    :aws.cloud-front/restrictions
    :aws.cloud-front/comment
    :aws.cloud-front/web-acl-id
    :aws.cloud-front/logging
    :aws.cloud-front/cache-behaviors
    :aws.cloud-front/custom-error-responses
    :aws.cloud-front/aliases
    :aws.cloud-front/price-class
    :aws.cloud-front/ipv6-enabled
    :aws.cloud-front/origins
    :aws.cloud-front/http-version
    :aws.cloud-front/default-cache-behavior
    :aws.cloud-front/viewer-certificate])))
(do
 (clojure.spec.alpha/def
  :aws.cloud-front/origin-access-identity
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cloud-front/s3-origin-config
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.cloud-front/origin-access-identity])))
(do
 (clojure.spec.alpha/def
  :aws.cloud-front/restriction-type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cloud-front/geo-restriction
  (clojure.spec.alpha/keys
   :req
   [:aws.cloud-front/restriction-type]
   :opt
   [:aws.cloud-front/locations])))
(do
 (clojure.spec.alpha/def
  :aws.cloud-front/response-code
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.cloud-front/error-caching-min-ttl
  clojure.core/double?)
 (clojure.spec.alpha/def
  :aws.cloud-front/error-code
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.cloud-front/response-page-path
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cloud-front/custom-error-response
  (clojure.spec.alpha/keys
   :req
   [:aws.cloud-front/error-code]
   :opt
   [:aws.cloud-front/response-code
    :aws.cloud-front/error-caching-min-ttl
    :aws.cloud-front/response-page-path])))
(do
 (clojure.spec.alpha/def
  :aws.cloud-front/enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.cloud-front/trusted-signers
  (clojure.spec.alpha/keys
   :req
   [:aws.cloud-front/enabled]
   :opt
   [:aws.cloud-front/aws-account-numbers])))
(do
 (clojure.spec.alpha/def
  :aws.cloud-front/origin-read-timeout
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.cloud-front/https-port
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.cloud-front/origin-keepalive-timeout
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.cloud-front/http-port
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.cloud-front/origin-protocol-policy
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cloud-front/custom-origin-config
  (clojure.spec.alpha/keys
   :req
   [:aws.cloud-front/origin-protocol-policy]
   :opt
   [:aws.cloud-front/origin-read-timeout
    :aws.cloud-front/https-port
    :aws.cloud-front/origin-keepalive-timeout
    :aws.cloud-front/origin-ssl-protocols
    :aws.cloud-front/http-port])))
(do
 (clojure.spec.alpha/def :aws.cloud-front/comment clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cloud-front/price-class
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cloud-front/enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.cloud-front/streaming-distribution-config
  (clojure.spec.alpha/keys
   :req
   [:aws.cloud-front/comment
    :aws.cloud-front/s3-origin
    :aws.cloud-front/enabled
    :aws.cloud-front/trusted-signers]
   :opt
   [:aws.cloud-front/logging
    :aws.cloud-front/price-class
    :aws.cloud-front/aliases])))
(do
 (clojure.spec.alpha/def :aws.cloud-front/bucket clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cloud-front/enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def :aws.cloud-front/prefix clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cloud-front/logging
  (clojure.spec.alpha/keys
   :req
   [:aws.cloud-front/bucket
    :aws.cloud-front/enabled
    :aws.cloud-front/prefix]
   :opt
   [])))
(do
 (clojure.spec.alpha/def :aws.cloud-front/comment clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cloud-front/cloud-front-origin-access-identity-config
  (clojure.spec.alpha/keys :req [:aws.cloud-front/comment] :opt [])))
(do
 (clojure.spec.alpha/def
  :aws.cloud-front/domain-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cloud-front/origin-access-identity
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cloud-front/s3-origin
  (clojure.spec.alpha/keys
   :req
   [:aws.cloud-front/domain-name
    :aws.cloud-front/origin-access-identity]
   :opt
   [])))
(do
 (clojure.spec.alpha/def
  :aws.cloud-front/include-cookies
  clojure.core/boolean?)
 (clojure.spec.alpha/def :aws.cloud-front/bucket clojure.core/string?)
 (clojure.spec.alpha/def :aws.cloud-front/prefix clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cloud-front/logging
  (clojure.spec.alpha/keys
   :req
   [:aws.cloud-front/bucket]
   :opt
   [:aws.cloud-front/include-cookies :aws.cloud-front/prefix])))
(do
 (clojure.spec.alpha/def
  :aws.cloud-front/event-type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cloud-front/lambda-function-arn
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cloud-front/lambda-function-association
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.cloud-front/event-type :aws.cloud-front/lambda-function-arn])))
(do
 (clojure.spec.alpha/def
  :aws.cloud-front/smooth-streaming
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.cloud-front/compress
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.cloud-front/target-origin-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cloud-front/viewer-protocol-policy
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.cloud-front/min-ttl clojure.core/double?)
 (clojure.spec.alpha/def :aws.cloud-front/max-ttl clojure.core/double?)
 (clojure.spec.alpha/def
  :aws.cloud-front/default-ttl
  clojure.core/double?)
 (clojure.spec.alpha/def
  :aws.cloud-front/default-cache-behavior
  (clojure.spec.alpha/keys
   :req
   [:aws.cloud-front/forwarded-values
    :aws.cloud-front/target-origin-id
    :aws.cloud-front/viewer-protocol-policy]
   :opt
   [:aws.cloud-front/smooth-streaming
    :aws.cloud-front/compress
    :aws.cloud-front/lambda-function-associations
    :aws.cloud-front/min-ttl
    :aws.cloud-front/cached-methods
    :aws.cloud-front/max-ttl
    :aws.cloud-front/allowed-methods
    :aws.cloud-front/default-ttl
    :aws.cloud-front/trusted-signers])))
(do
 (clojure.spec.alpha/def
  :aws.cloud-front/smooth-streaming
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.cloud-front/compress
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.cloud-front/target-origin-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cloud-front/viewer-protocol-policy
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.cloud-front/min-ttl clojure.core/double?)
 (clojure.spec.alpha/def
  :aws.cloud-front/path-pattern
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.cloud-front/max-ttl clojure.core/double?)
 (clojure.spec.alpha/def
  :aws.cloud-front/default-ttl
  clojure.core/double?)
 (clojure.spec.alpha/def
  :aws.cloud-front/cache-behavior
  (clojure.spec.alpha/keys
   :req
   [:aws.cloud-front/forwarded-values
    :aws.cloud-front/target-origin-id
    :aws.cloud-front/viewer-protocol-policy
    :aws.cloud-front/path-pattern]
   :opt
   [:aws.cloud-front/smooth-streaming
    :aws.cloud-front/compress
    :aws.cloud-front/lambda-function-associations
    :aws.cloud-front/min-ttl
    :aws.cloud-front/cached-methods
    :aws.cloud-front/max-ttl
    :aws.cloud-front/allowed-methods
    :aws.cloud-front/default-ttl
    :aws.cloud-front/trusted-signers])))
(do
 (clojure.spec.alpha/def
  :aws.cloud-front/restrictions
  (clojure.spec.alpha/keys
   :req
   [:aws.cloud-front/geo-restriction]
   :opt
   [])))
(do
 (clojure.spec.alpha/def :aws.cloud-front/forward clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cloud-front/cookies
  (clojure.spec.alpha/keys
   :req
   [:aws.cloud-front/forward]
   :opt
   [:aws.cloud-front/whitelisted-names])))
(do
 (clojure.spec.alpha/def
  :aws.cloud-front/iam-certificate-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cloud-front/ssl-support-method
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cloud-front/minimum-protocol-version
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cloud-front/cloud-front-default-certificate
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.cloud-front/acm-certificate-arn
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cloud-front/viewer-certificate
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.cloud-front/iam-certificate-id
    :aws.cloud-front/ssl-support-method
    :aws.cloud-front/minimum-protocol-version
    :aws.cloud-front/cloud-front-default-certificate
    :aws.cloud-front/acm-certificate-arn])))
(do
 (clojure.spec.alpha/def
  :aws.cloud-front/domain-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cloud-front/origin-path
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.cloud-front/id clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cloud-front/origin
  (clojure.spec.alpha/keys
   :req
   [:aws.cloud-front/domain-name :aws.cloud-front/id]
   :opt
   [:aws.cloud-front/origin-custom-headers
    :aws.cloud-front/s3-origin-config
    :aws.cloud-front/origin-path
    :aws.cloud-front/custom-origin-config])))
(do
 (clojure.spec.alpha/def
  :aws.cloud-front/header-value
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cloud-front/header-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cloud-front/origin-custom-header
  (clojure.spec.alpha/keys
   :req
   [:aws.cloud-front/header-value :aws.cloud-front/header-name]
   :opt
   [])))
