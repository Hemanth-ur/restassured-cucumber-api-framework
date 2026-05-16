# REST Assured Cucumber API Framework

## Project Overview

This project is a hybrid API Automation Framework developed using:

- Java
- REST Assured
- Cucumber BDD
- Maven
- JUnit
- POJO Serialization
- Hooks
- Maven Cucumber Reporting Plugin

The framework is designed using reusable and scalable automation architecture principles.

---

# Framework Features

✅ REST Assured API Automation

✅ Cucumber BDD Integration

✅ Maven Build Management

✅ Dynamic API Resource Handling using Enum

✅ Reusable Request Specifications

✅ JSON & HTML Reporting

✅ Hooks Implementation

✅ POJO Serialization

✅ Scenario Tagging

✅ Reusable Utility Methods

---

# Tech Stack

| Technology | Usage |
|---|---|
| Java | Programming Language |
| REST Assured | API Automation |
| Cucumber | BDD Framework |
| JUnit | Test Runner |
| Maven | Build Management |
| Jackson Databind | Serialization |
| Masterthought Reports | HTML Reporting |

---

# Project Structure

```text
src
 ├── test
 │    ├── java
 │    │    ├── resources
 │    │    │    ├── APIResources.java
 │    │    │    ├── TestDataBuild.java
 │    │    │    └── Utils.java
 │    │    │
 │    │    ├── runners
 │    │    │    └── TestRunner.java
 │    │    │
 │    │    └── stepDefinitions
 │    │         ├── Hooks.java
 │    │         └── StepDefinitions.java
 │    │
 │    └── resources
 │         ├── features
 │         │    └── placeValidations.feature
 │         │
 │         └── global.properties
 │
 ├── pom.xml
 └── target
```

---

# Implemented API Scenarios

## Add Place API

- Create new place
- Validate status code
- Validate response body
- Verify created place using GET API

## Update Place API

- Update existing place address
- Validate updated response
- Verify updated address using GET API

## Delete Place API

- Delete created place
- Validate delete response

---

# Framework Design Highlights

## Dynamic API Resource Handling

Implemented using Enum:

```java
APIResources resourceAPI = APIResources.valueOf(resource);
```

This avoids hardcoded endpoints and improves framework scalability.

---

## Reusable Request Specification

Centralized RequestSpecification includes:

- Base URI
- Query Parameters
- Content Type
- Logging

This prevents code duplication.

---

## Hooks Implementation

Hooks are used to create prerequisite test data before scenario execution.

Example:

```java
@Before("@DeletePlace")
```

This ensures test independence and reusable setup.

---

## POJO Serialization

Request payloads are created using POJO classes instead of hardcoded JSON.

Example:

```java
UpdatePlace u = new UpdatePlace();
```

---

# Maven Commands

## Clean Project

```bash
mvn clean
```

## Run Tests

```bash
mvn test
```

## Run Tests + Generate Reports

```bash
mvn clean verify
```

---

# Cucumber HTML Reports

Reports are generated using:

```xml
maven-cucumber-reporting
```

Generated report location:

```text
target/cucumber-html-reports
```

Open:in browser to view execution report

```text
overview-features.html
```

---

# Tags Usage

Examples:
```gherkin
@AddPlace
@UpdatePlaceAddress
@DeletePlace
@Regression
```

Run specific tags from TestRunner:
```java
tags = "@AddPlace"
```

Run multiple tags:
```java
tags = "@UpdatePlaceAddress or @DeletePlace"
```

---

# Future Improvements

- Jenkins CI Integration
- Extent Reports
- Environment Profiles
- Data Driven Testing
- API Schema Validation
- Logging Framework Integration
- Parallel Execution
- Docker Integration
---

# Author
Hemanth U R

GitHub Repository:
https://github.com/Hemanth-ur/restassured-cucumber-api-framework

