# edn-to-cfn

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