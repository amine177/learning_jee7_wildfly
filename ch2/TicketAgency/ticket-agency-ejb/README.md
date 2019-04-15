The ejb module that would server a java client.

The main components are:
  - TheatreBooker ejb: a stateful ejb used to assign a session unique to every client for him to book a seat
  - TheatreInfo ejb: a stateless ejb used to get information about all the seats, being an informational utility stateful is sufficient.
  - TheatreBox ejb: a singleton ejb to provide data abstraction, creating a HashMap of seats and implementing safe concurrent access through locks
This module illustrates the use of CDI (with @EJB) to get an instance of a singleton ejb (TheatreBox)
