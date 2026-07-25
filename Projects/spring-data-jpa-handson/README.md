# Spring Data JPA Hands-On

This project demonstrates the basics of Spring Data JPA using a simple `Country` entity.

## Difference between JPA, Hibernate and Spring Data JPA

**1. JPA (Java Persistence API)**
*   **What it is:** A specification (a set of interfaces and rules) defined by Java for ORM (Object-Relational Mapping).
*   **Role:** It provides the standard guidelines for managing relational data in Java applications. It doesn't actually implement the database operations itself.
*   **Example:** Annotations like `@Entity`, `@Id`, `@Table` are all part of JPA (`jakarta.persistence.*`).

**2. Hibernate**
*   **What it is:** An implementation (provider) of the JPA specification.
*   **Role:** It contains the actual code that translates Java objects into SQL queries and executes them against the database. While you can use Hibernate without JPA, it's most commonly used as the JPA provider.
*   **Example:** Hibernate reads the `@Entity` annotation and generates the `CREATE TABLE` SQL.

**3. Spring Data JPA**
*   **What it is:** A framework built on top of JPA (which usually runs Hibernate under the hood).
*   **Role:** It acts as an abstraction layer that significantly reduces boilerplate code. Instead of writing `EntityManager` queries manually, you simply declare interfaces (like `JpaRepository`), and Spring Data JPA automatically generates the implementation and queries at runtime based on method names.
*   **Example:** Extending `JpaRepository<Country, String>` gives you `findAll()`, `findById()`, `save()`, and `delete()` out of the box without writing any SQL or Hibernate code.
