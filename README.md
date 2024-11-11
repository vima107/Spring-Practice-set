# Spring-Practice-set

Spring Dependency Injection Practice
This project demonstrates the basic usage of Spring Dependency Injection (DI) to manage object creation and wiring in a Spring application. The setup uses annotations and prototype scope to create separate instances of trainer classes, each with a different name value injected.

Project Structure:
1.JavaTrainer: Represents a Java trainer with an injected name (Rudresh sir).
2.SqlTrainer: Represents an SQL trainer with an injected name (Bharath sir).
3.WebTrainer: Represents a Web trainer with an injected name (Siddu sir).
4.App: Main application to fetch the trainer beans from the Spring container and display their names.
5.configure.xml: Spring configuration file enabling component scanning.

Technologies Used:
1.Java
2.Spring Framework (Annotations, Dependency Injection, Prototype Scope)

Concepts Practiced:
1.Creating and managing Spring beans using annotations.
2.Using @Value for dependency injection.
3.Managing object scope with @Scope("prototype").
4.Component scanning with @Component.

