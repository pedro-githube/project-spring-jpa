# JPA Project 

# About the project

https://project-spring-jpa.herokuapp.com

JPA Project is a web services project that was developed during the Object Oriented Programming Java course on Udemy.

The objective of the application was to develop a CRUD using the Spring Boot framework, knowing and practicing the spring ecosystem,
the logical layer structures (resource, service, repository). 

- Used JPA repository (object-oriented and relational conversion mapping tool).
- Good exception handling practices.

## Domain Model
![2022-03-16 (14)](https://user-images.githubusercontent.com/91923421/158721026-c6c85c55-61d2-4145-96b6-09fec268f08c.png)

# Technologies
## Backend
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- Swagger
## Database
- Database: H2-console / PostegreSQL 
## Deploy
- Backend : Heroku

# How execute the project 

## Backend
Requirements: 
- Java JDK 11
- For execute in the localhost you need to change application-properties ```spring.profiles.active=test``` and the TestConfig class ```@Profile("test")```

```bash
# clone repository
git clone https://github.com/pedro-githube/project-spring-jpa.git

# enter the backend project folder
cd backend

# execute project
./mvnw spring-boot:run
```
# Database access

H2-console: http://localhost:8080/h2-console/

# Documentation

**Recently discovered a nice dependency for API documentation and so I updated the project to access**

- Heroku - Swagger : https://project-spring-jpa.herokuapp.com/swagger-ui/index.html#
- Localhost - Swagger : http://localhost:8080/swagger-ui/index.html#/

# Author

Pedro Henrique Bispo Bitteta

https://www.linkedin.com/in/pedro-henrique-39015a216/
