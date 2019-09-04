# Hexagonal-Architecture
In this example we are taking a look into a quick and practical example of Hexagonal Architecture in Java.

This architecture implements a system that separates the core logic of an application from the peripheral parts which are supporting the business logic. These peripheral parts includes Messaging, UI, External APIs, Database etc.

It makes additions and changes in software easy, testing of core business logic of an application is also easier as the overhead of external part of the application are not part of this testing.

This design pattern allows the business logic and peripheral part of the application communicate via ports (interfaces) and adapters.

Ports (waiting to accept communication) are present on the application core logic while adapters are on the peripheral side.
