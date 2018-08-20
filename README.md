# Sample Spring Cloud Config Server
 Externalizes configuration for distributed system defining a central place to manage external properties for applications across all environments. 
 <br/>
 The externalized properties are defined and loaded from the external git repository [sample-config-repo](https://github.com/alcastic/sample-config-repo)
 
# Run App

    $ ./gradlew bootRun
    
# Interesting endpoints:

* To monitor and interact with your application: http://localhost:8888/actuator
* In order to read properties set for an application: ``http://root:s3cr3t@localhost:8888/{CLIENT_APP_NAME}/{PROFILE}/master``
<br/>Sample: ``http://root:s3cr3t@localhost:8888/sample-config-client/development/master``