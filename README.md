# Entries Project

## Description
Entries Project is a server-side application developed with Spring Boot and designed for managing data in a PostgreSQL database. The project includes a set of REST APIs for interacting with data and features flexible configuration for email sending and database interaction.

## Key Features

### Data Management:
- CRUD operations for entities (create, read, update, and delete data).
- The project structure uses Data Transfer Objects (DTOs) for data transfer.

### Email Notifications:
- Integration with an SMTP server for sending email notifications.
- Fully customizable email configuration.

### Database Configuration:
- Uses PostgreSQL for data storage.
- Flexible database connection settings in the `application.properties` file.

### Exception Handling:
- Custom error handlers for better user experience.
- Error and warning logging.

### Layered Architecture Implementation:
- **Entities**: Define the database structure.
- **Repositories**: For database interaction.
- **Services**: Application logic.
- **Controllers**: REST APIs for client interaction.

### Docker Support:
- Includes a Dockerfile to simplify application deployment.

## Technology Stack
- **Language**: Java
- **Framework**: Spring Boot
- **Database**: PostgreSQL
- **Development Tools**:
  - Hibernate for ORM.
  - Docker for containerization.
  - Build tools: Maven

## Configuration
The `application.properties` file contains the settings for the application:

### SMTP Server:
```properties
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=<your email>
spring.mail.password=<password>
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true

PostgreSQL Database:
spring.datasource.url=jdbc:postgresql://104.248.46.170:5432/postgres
spring.datasource.username=<postgres>
spring.datasource.password=<12345>
Hibernate:
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.show-sql=true
Installation and Run

Clone the Repository:
[GitHub Репозиторий](https://github.com/Myrzakanova/entriesproject.git)


Running the Application:
Using Maven:

./mvnw spring-boot:run
Or Using Docker:

Build the Docker image:
docker build -t entriesproject .
Run the Docker container:
docker run -p 8080:8080 entriesproject


