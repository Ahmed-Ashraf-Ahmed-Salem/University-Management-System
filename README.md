# University Management System - Spring Boot

A complete **University Management System** built with **Spring Boot** following clean backend architecture and Object-Oriented Programming (OOP) principles.  
This project handles Students, Departments, Courses, Enrollments, and Grades — designed to demonstrate solid backend development practices.

---

## Features

✅ Manage Departments (Add, View)  
✅ Manage Students and assign them to Departments  
✅ Manage Courses and link them to Departments  
✅ Enroll Students in Courses  
✅ Record and track Grades for each enrollment  
✅ RESTful API endpoints  
✅ Integrated with MySQL Database  
✅ Clean separation of layers: Controller, Service, Repository  
✅ Uses Spring Data JPA and Hibernate relationships  
✅ Built with modern best practices (Lombok, JPA, DTO-friendly structure)  

---

## 🖥️ Tech Stack

- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **MySQL**
- **Lombok**

---

## 📖 Data Model & Relationships

- **Department**  
  ↳ Has many Students  
  ↳ Has many Courses  

- **Student**  
  ↳ Belongs to one Department  
  ↳ Can enroll in many Courses via **Enrollment**  

- **Course**  
  ↳ Belongs to one Department  
  ↳ Has many Students via **Enrollment**  

- **Enrollment**  
  ↳ Connects a Student to a Course  
  ↳ Stores the Grade for that course

---

## Project Structure

src/main/java/com/example/ums
├── controller       # REST controllers
├── dto              # Data Transfer Objects (DTOs)
├── entity           # JPA entities
├── repository       # JPA repositories
├── service          # Service interfaces & implementations
└── UMSApplication.java

---

## 🛠️ Installation & Run

1️⃣ Clone the repository:

```bash
git clone https://github.com/your-username/university-management-system.git
cd university-management-system

2️⃣ Create a MySQL database:

CREATE DATABASE university;

3️⃣ Configure application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/university
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

4️⃣ Run the application:

```bash
./mvnw spring-boot:run

---

## **API Endpoints Overview**

| Resource   | Method | Endpoint                    | Description                  |
| ---------- | ------ | --------------------------- | ---------------------------- |
| Department | GET    | `/department/{ID}`          | Get all departments          |
| Department | POST   | `/department/addDepartment` | Create new department        |
| Student    | GET    | `/student`                  | Get all students             |
| Student    | POST   | `/student/addStudent`       | Create new student           |
| Student    | POST   | `/student/addStudents`      | Create new students          |
| Student    | GET    | `/student/{ID}`             | Get a student                |
| Student    | DELETE | `/student/{ID}`             | Delete a student             |
| Course     | GET    | `/course`                   | Get all courses              |
| Course     | POST   | `/course/addCourse`         | Create new course            |
| Course     | POST   | `/course/addCourses`        | Create new courses           |
| Enrollment | GET    | `/enrollments`              | Get all enrollments          |
| Enrollment | POST   | `/enroll`                   | Enroll a student in a course |

---

## **Future Improvements**

- Add course scheduling and time management.
- Implement attendance tracking.
- Add authentication (JWT or Spring Security).
- Improve error handling and validation.
- API filtering, searching, and pagination.
- Export reports (CSV/PDF).
