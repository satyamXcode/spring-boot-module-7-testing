# Module 7: Spring Boot Testing

A practical Spring Boot project demonstrating testing techniques for Java applications using JUnit, Mockito, Spring Boot Test, and integration testing.

## 📚 Topics Covered

- Unit testing in Spring Boot
- Testing service-layer business logic
- Testing repository-layer operations
- Integration testing
- JUnit 5
- Mockito
- Spring Boot testing support

## 🛠️ Tech Stack

- Java
- Spring Boot
- Maven
- JUnit 5
- Mockito
- Spring Boot Test

## 📂 Project Structure

```text
module_7/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/module_7/
│   │   │       ├── Employee.java
│   │   │       ├── EmployeeRepository.java
│   │   │       ├── EmployeeService.java
│   │   │       └── Module7Application.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/example/module_7/
│               ├── EmployeeRepositoryTest.java
│               ├── EmployeeServiceIntegrationTest.java
│               ├── EmployeeServiceTest.java
│               └── Module7ApplicationTests.java
├── pom.xml
└── README.md
```

## ▶️ How to Run the Project

### Prerequisites

- Java version compatible with the project
- Maven (or the included Maven Wrapper)
- IntelliJ IDEA or another Java IDE

### Run the application

Using the Maven Wrapper on Windows:

```bash
.\mvnw.cmd spring-boot:run
```

### Run all tests

```bash
.\mvnw.cmd test
```

## 🧪 Testing Classes

| Test Class | Purpose |
|---|---|
| `EmployeeRepositoryTest` | Tests repository behavior |
| `EmployeeServiceTest` | Tests service-layer logic |
| `EmployeeServiceIntegrationTest` | Tests integration between application components |
| `Module7ApplicationTests` | Tests Spring Boot application context loading |

The exact test coverage depends on the test methods implemented in each class.

## 🎯 Learning Objective

The goal of this project is to understand how to write, execute, and organize automated tests in Spring Boot applications, helping improve code reliability and maintainability.

## 👨‍💻 Author

**Satyam Jaiswal**

This repository is part of my Java Full Stack learning journey.