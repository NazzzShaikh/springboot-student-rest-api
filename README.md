# Spring Boot Student REST API

A simple **Student Management REST API** built using **Spring Boot**, **Spring Data JPA**, and **MySQL**.
This project demonstrates how to perform **CRUD (Create, Read, Update, Delete) operations** using RESTful web services.

---

## 🚀 Features

* Add a new student
* Get all students
* Get student by ID
* Update student details
* Delete student record
* RESTful API design
* MySQL database integration using JPA

---

## 🛠 Technologies Used

* Java 21
* Spring Boot
* Spring Data JPA
* MySQL
* Maven
* IntelliJ IDEA

---

## 📂 Project Structure

```
SBRestApi
│
├── src/main/java
│   ├── controller
│   │   └── StudentController.java
│   ├── entity
│   │   └── Student.java
│   ├── repository
│   │   └── StudentRepository.java
│   └── SBRestApiApplication.java
│
├── src/main/resources
│   └── application.properties
│
└── pom.xml
```

---

## 📌 API Endpoints

| Method | Endpoint               | Description       |
| ------ | ---------------------- | ----------------- |
| GET    | `/students`            | Get all students  |
| GET    | `/student/{id}`        | Get student by ID |
| POST   | `/student/add`         | Add new student   |
| PUT    | `/student/update/{id}` | Update student    |
| DELETE | `/student/Del/{id}`    | Delete student    |

---

## 📥 Example Request (POST)

```
POST /student/add
```

### JSON Body

```json
{
  "name": "Naznin",
  "branch": "Computer Engineering",
  "percentage": 85
}
```

---

## ⚙️ How to Run the Project

1. Clone the repository

```
git clone https://github.com/yourusername/springboot-student-rest-api.git
```

2. Open the project in **IntelliJ IDEA**

3. Configure **MySQL database** in `application.properties`

4. Run the application

5. Access APIs at

```
http://localhost:8080
```

---

## 👩‍💻 Author

Naznin Shaikh

Computer Engineering Student
