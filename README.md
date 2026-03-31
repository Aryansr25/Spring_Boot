# Spring Boot: Core Concepts and Auto-Configuration

## Introduction
* Spring Boot is a module built on the Spring Framework to simplify application development.
* It enables the creation of stand-alone, production-grade applications with minimal setup.
* Focuses on Rapid Application Development (RAD) by reducing boilerplate configuration.

## Auto-Configuration Mechanism
Spring Boot operates on the "Convention over Configuration" principle.
* **Classpath Scanning:** The framework detects libraries (JARs) present in the project.
* **Starter Dependencies:** Adding a "Starter" (e.g., `spring-boot-starter-web`) triggers automated configuration for that specific module (Tomcat, Spring MVC, etc.).
* **Conditional Logic:** Uses `@ConditionalOnClass` or `@ConditionalOnProperty` annotations to activate configurations only when specific dependencies or settings are present.
* **Internal Registry:** All potential auto-configurations are listed in the `META-INF/spring.factories` file within the Spring Boot JAR.

## Key Components
* **Starters:** Bundled dependencies (e.g., `spring-boot-starter-data-jpa`, `spring-boot-starter-security`) that manage version compatibility.
* **Embedded Servers:** Includes Tomcat, Jetty, or Undertow within the application JAR, eliminating the need for external server installation.
* **Opinionated Defaults:** Provides pre-set configurations for common tasks to minimize manual decision-making.

## Advantages
* **Stand-alone Execution:** Applications run via `java -jar` using the embedded servlet container.
* **Elimination of XML:** Removes the requirement for complex XML configuration files.
* **Production-Ready Features:** Built-in support for metrics, health checks, and externalized configuration via Actuator.
* **Simplified Build:** Starters reduce dependency management overhead in `pom.xml`.
