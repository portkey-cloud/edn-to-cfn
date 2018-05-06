(ns edn-to-cfn.specs.cfn
  (:require [clojure.spec.alpha :as s]))

(s/def :cfn/resources (s/map-of string? ;; FIXME: and check name is valid AWS identifier
                                map?))
