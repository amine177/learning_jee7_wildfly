This project illustrates those concepts:
  - Creating an EJB project:
    - Creating a _singleton_ session bean (*TheatreBox*) to handle data access (read, write) with concurrency management through @Lock.
    - Creating a _stateless_ session bean (*TheatreInfo*) to have information about the data using the injected singleton bean.
    - Creating a _statefull_ session bean (*TheatreBooker*) to create business logic around the singleton bean which is injected with @EJB.
  - Creating a remote client that would consume the service.
  - Creating a parent project for both the EJB project and the client project using <module></module> in the pom.xml of the parent.
