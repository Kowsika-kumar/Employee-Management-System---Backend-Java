👨‍💼 Employee Management System – Backend (Spring Boot)

The Employee Management System (EMS) Backend is a RESTful Spring Boot application designed to manage employee records efficiently.
It supports CRUD operations, follows clean layered architecture, and uses DTO & Mapper patterns for scalable backend development.

✨ Features

Create a new employee

Retrieve employee details by ID

Retrieve all employees

Update employee information

Delete employee records

DTO & Mapper pattern implementation

Custom exception handling

RESTful API design

🛠 Tech Stack
Category	Technology
Language	Java
Framework	Spring Boot
ORM	Spring Data JPA
Database	MySQL / H2
Build Tool	Maven
API Testing	Postman
IDE	IntelliJ IDEA
📂 Project Structure
ems-backend
│
├── .mvn/wrapper
├── src
│   └── main
│       ├── java/net/javaguides/ems
│       │   ├── controller
│       │   │   └── EmployeeController.java
│       │   ├── dto
│       │   │   └── EmployeeDto.java
│       │   ├── entity
│       │   │   └── Employee.java
│       │   ├── exception
│       │   │   └── ResourceNotFoundException.java
│       │   ├── mapper
│       │   │   └── EmployeeMapper.java
│       │   ├── repository
│       │   │   └── EmployeeRepository.java
│       │   └── service
│       │       └── EmsBackendApplication.java
│       └── resources
│           └── application.properties
│
├── .gitignore
├── mvnw
├── mvnw.cmd
└── pom.xml

🧩 Architecture Overview
Client (Postman / Frontend)
        ↓
Controller (REST APIs)
        ↓
Service (Business Logic)
        ↓
Repository (JPA)
        ↓
Database

🌐 REST API Endpoints
🔹 Create Employee

POST

/api/employees


Request Body

{
  "firstName": "Kowsika",
  "lastName": "Kumar",
  "email": "kowsika@gmail.com"
}

🔹 Get Employee by ID

GET

/api/employees/{id}

🔹 Get All Employees

GET

/api/employees

🔹 Update Employee

PUT

/api/employees/{id}

🔹 Delete Employee

DELETE

/api/employees/{id}

⚠️ Exception Handling

ResourceNotFoundException is thrown when an employee ID does not exist.

Ensures clean error responses and prevents application crashes.

Example:

Employee not found with id : 5

🗄 Database Configuration
MySQL Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/ems
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

H2 (Optional – In Memory)
spring.datasource.url=jdbc:h2:mem:emsdb
spring.h2.console.enabled=true
spring.jpa.hibernate.ddl-auto=update

▶️ How to Run the Application
1️⃣ Clone the Repository
git clone https://github.com/Kowsika-kumar/Employee-Management-System---Backend-Java.git

2️⃣ Navigate to Backend
cd Employee-Management-System---Backend-Java/ems-backend

3️⃣ Run the Application
mvn spring-boot:run


OR
Run EmsBackendApplication.java from IntelliJ IDEA.

🧪 Testing

Use Postman

Set headers:

Content-Type: application/json


Test all CRUD APIs

🚀 Future Enhancements

Add pagination & sorting

Global exception handling (@ControllerAdvice)

Input validation (@Valid)

Swagger / OpenAPI documentation

Authentication & Authorization (JWT)

Frontend integration (React)

👩‍💻 Author

Kowsika K
Electronics & Communication Engineering
Skills: Java, Spring Boot, MySQL, HTML, CSS, JavaScript, React

⭐ Why This Project?

This project demonstrates:

Enterprise-level backend architecture

REST API best practices

DTO & Mapper usage
