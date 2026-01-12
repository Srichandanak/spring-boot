# spring-boot

In a Spring Boot application, we generally follow a layered architecture.

#Entity Class
A class is needed to define the entities.
This class represents a table in the database and contains fields, getters, setters, and JPA annotations.

#Repository
A repository is an interface that is used to interact with the database.
It extends JpaRepository (or similar) and provides CRUD operations without writing SQL.

#Service
A service class is used to define business logic and methods.
It contains the application logic and calls the repository to perform database operations.

#Controller
The controller is used to handle HTTP requests.
It receives requests from the client, calls the appropriate service methods, and returns the response.
