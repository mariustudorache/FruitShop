#FruitShop
Microservice of a greengrocer made with Spring Boot, Maven and OpenAPI



#### Technologies

Apache Maven
OpenAPI
Java openjdk 11


#### How to compile the microservice locally

To build the project the following commands were used:

> mvn clean install

This command runs:
1. Clear the project target.
2. It will collect the necessary libraries for the microservice.
3. Compile the project with the properties in the `src/main/resources/application.properties` folder

---

#### How to run the microservice locally
Following the previous steps, it would be enough to execute the command in the root folder of the project:

> mvn spring-boot:run

---

#### Available services
Once the microservice is launched, the API can be accessed by accessing the following URL:
> **local**: http://localhost:8080/swagger-ui/index.html

---
