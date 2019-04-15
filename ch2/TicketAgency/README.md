This project illustrates those concepts:
  - Creating an EJB project:
    - Creating a _singleton_ session bean (*TheatreBox*) to handle data access (read, write) with concurrency management through @Lock.
    - Creating a _stateless_ session bean (*TheatreInfo*) to have information about the data using the injected singleton bean.
    - Creating a _statefull_ session bean (*TheatreBooker*) to create business logic around the singleton bean which is injected with @EJB.
  - Creating a remote client that would consume the service.
  - Creating a parent project for both the EJB project and the client project using <module></module> in the pom.xml of the parent.

Make sure to issue :
  - mvn clean install from the root directory of the folder in order for the client to find the ejb's artifact.
  - mvn wildfly:deploy in the ejb directory to deploy to wildfly
  - mvn package exec:exec to execute the client
