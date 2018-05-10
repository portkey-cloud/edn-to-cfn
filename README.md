# edn-to-cfn

[![CircleCI](https://circleci.com/gh/portkey-cloud/edn-to-cfn.svg?style=svg)](https://circleci.com/gh/portkey-cloud/edn-to-cfn)

This is a WIP tool to generate AWS CloudFormation templates form Clojure data.

*WARNING:* This is not usable yet!

Goals:

- Creating a spec for AWS CloudFormation as edn
- Good error messages (via spec and expound)

Antigoals:

- Templating tools (just use Clojure to create the datastructures)

## AWS CloudFormation specs

The library contains automatically generated specifications for AWS CloudFormation in
`aws.*` namespaces.

The goal is to fully spec all resources and their configuration.


# License

Copyright © 2018 Tatu Tarvainen

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.