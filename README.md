# Sample Spring Cloud Config Server
 Externalizes configuration for distributed system defining a central place to manage external properties for applications across all environments. 

 The externalized properties are defined and loaded from the external git repository [sample-config-repo](https://github.com/alcastic/sample-config-repo)
 
 The project [sample-spring-cloud-config-client](git@github.com:alcastic/sample-spring-cloud-config-client.git) is a samople app that consume the configuration exposed by `sample-spring-cloud-config-client` 
# Run App

    $ ./gradlew bootRun
    
# Interesting endpoints:

* To monitor and interact with your application: http://localhost:8888/actuator
* In order to read properties set for an application: ``http://localhost:8888/{CLIENT_APP_NAME}/{PROFILE}/master``
<br/>Sample: `http://localhost:8888/sample-config-client/development/master`