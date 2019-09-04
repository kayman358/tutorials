
# Hexagonal-Architecture
In this example we are taking a look into a quick and practical example of Hexagonal Architecture in Java.

This architecture implements a system that separates the core logic of an application from the peripheral parts which are supporting the business logic. These peripheral parts includes Messaging, UI, External APIs, Database etc.

It makes additions and changes in software easy, testing of core business logic of an application is also easier as the overhead of external part of the application are not part of this testing.

This design pattern allows the business logic and peripheral part of the application communicate via ports (interfaces) and adapters.

Ports (waiting to accept communication) are present on the application core logic while adapters are on the peripheral side.
=======

The "REST with Spring" Classes
==============================

After 5 months of work, here's the Master Class of REST With Spring: <br/>
**[>> THE REST WITH SPRING MASTER CLASS](http://www.baeldung.com/rest-with-spring-course?utm_source=github&utm_medium=social&utm_content=tutorials&utm_campaign=rws#master-class)**

And here's the Master Class of Learn Spring Security: <br/>
**[>> LEARN SPRING SECURITY MASTER CLASS](http://www.baeldung.com/learn-spring-security-course?utm_source=github&utm_medium=social&utm_content=tutorials&utm_campaign=lss#master-class)**



Spring Tutorials
================

This project is **a collection of small and focused tutorials** each covering a single and well defined area of development. 
Most of the tutorial projects are focused on the `Spring Framework` (and `Spring Security`).  
In additional to Spring, the following technologies are in focus: `core Java`, `Jackson`, `HttpClient`, `Guava`. 

Building the project
====================
To do the full build, do: `mvn install -Pdefault -Dgib.enabled=false`


Working with the code in Eclipse
================================
Any IDE can be used to work with the projects, but if you're using Eclipse, consider the following. 

- import the included **formatter** in Eclipse: 
`https://github.com/eugenp/tutorials/tree/master/eclipse`


CI - Jenkins
================================
This tutorials project is being built **[>> HERE](https://rest-security.ci.cloudbees.com/job/tutorials-unit/)**

### Relevant Articles: 
================================

- [Apache Maven Standard Directory Layout](http://www.baeldung.com/maven-directory-structure)
- [Apache Maven Tutorial](http://www.baeldung.com/maven)
- [Designing a User Friendly Java Library](http://www.baeldung.com/design-a-user-friendly-java-library)

