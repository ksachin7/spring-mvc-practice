# Spring MVC Practices

### Spring MVC (XML Configuration)

This configuration approach utilizes XML files to configure Spring MVC components such as controllers, view resolvers, and handler mappings. It's a traditional method where beans and their dependencies are defined in XML files, offering flexibility and separation of concerns. [Spring MVC XML config.](./spring-mvc-xml/)

#### In this project I practiced

- Setting up tomcat
- Spring MVC configuration using xml
- JSP, EL & Bootstrap
- Passing data to and from controller
- Initializing and logging with slf4j

### Spring MVC (Java Configuration)

 This modern approach uses Java-based configuration classes to set up Spring MVC components. It leverages annotations like `@Configuration` and `@EnableWebMvc` to configure the application context, controllers, view resolvers, and other settings. It offers more concise and readable configuration compared to XML. [Spring MVC Java config.](./spring-mvc/)

#### In this project I practiced

-
-
-

### Used versions

```xml
<properties>
    <java.version>17</java.version>
    <spring.version>6.1.7</spring.version>
    <servlet.version>6.0.0</servlet.version>
    <jsp.version>4.0.0-M2</jsp.version>
    <jstl.version>3.0.0</jstl.version>
    <thymeleaf.version>3.1.1.RELEASE</thymeleaf.version>
    <slf4j.version>2.1.0-alpha1</slf4j.version>
    <log4j.version>2.14.1</log4j.version>
    <logback.version>1.5.6</logback.version>
    <hibernate.version>6.5.1.Final</hibernate.version>
    <lombok.version>1.18.30</lombok.version>
  </properties>
```

### See note on

- **Spring MVC Working**: [Working of Spring MVC](./notes/working.mvc.md)
- **Run Configuration in IntelliJ IDEA**: [Run Configuration](./notes/tomcat.setup.md)

- Setting up and configuring Tomcat for different platforms and scenarios: [Tomcat Setup Ref.](https://www.baeldung.com/tomcat)
