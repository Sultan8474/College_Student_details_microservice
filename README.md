# College Microservices Architecture

A distributed College Management System built using Spring Boot Microservices Architecture.

## 🚀 Project Overview

This project demonstrates a complete microservices-based backend system using:

- Spring Boot
- Eureka Discovery Server
- API Gateway
- REST APIs
- Maven
- MySQL / H2 Database

The system contains multiple independent services that communicate with each other through REST APIs.

---

# 🏗️ Microservices Included

## 1. Eureka Server
Service registry for all microservices.

Port:
```bash
8761
```

---

## 2. API Gateway
Single entry point for all services.

Port:
```bash
8080
```

---

## 3. Student Service
Handles student management operations.

Port:
```bash
8081
```

Features:
- Add Student
- Get Student
- Update Student
- Delete Student
- Fetch Teacher & College details

---

## 4. Teacher Service
Handles teacher management operations.

Port:
```bash
8082
```

Features:
- Add Teacher
- Get Teacher
- Update Teacher
- Delete Teacher
- Get Teachers by Course

---

## 5. College Service
Handles college management operations.

Port:
```bash
8083
```

Features:
- Add College
- Get College
- Update College
- Delete College

---

# 🔥 Architecture

Client Request
↓
API Gateway
↓
Microservices
↓
Database

All services are registered with Eureka Discovery Server.

---

# 🛠️ Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- Spring Cloud Gateway
- Eureka Server
- REST APIs
- Maven
- MySQL / H2
- Postman

---

# 📡 API Endpoints

## Student Service

| Method | Endpoint |
|--------|----------|
| GET | /student |
| GET | /student/{id} |
| POST | /student |
| PUT | /student/{id} |
| DELETE | /student/{id} |

---

## Teacher Service

| Method | Endpoint |
|--------|----------|
| GET | /teacher |
| GET | /teacher/{id} |
| GET | /teacher/course/{course} |
| POST | /teacher |
| PUT | /teacher/{id} |
| DELETE | /teacher/{id} |

---

## College Service

| Method | Endpoint |
|--------|----------|
| GET | /college |
| GET | /college/{id} |
| POST | /college |
| PUT | /college/{id} |
| DELETE | /college/{id} |

---

# ▶️ How To Run

## Step 1
Start Eureka Server

## Step 2
Start API Gateway

## Step 3
Start:
- Student Service
- Teacher Service
- College Service

---

# 🌐 Eureka Dashboard

```bash
http://localhost:8761
```

---

# 📬 API Gateway

```bash
http://localhost:8080
```

---

# 📷 Screenshots

Add:
- Eureka Dashboard Screenshot
- Postman API Testing
- Project Architecture

---

# 👨‍💻 Author

Sultan Khan

---

# ⭐ Features

- Distributed Microservices Architecture
- Service Discovery
- API Gateway Routing
- Inter-Service Communication
- CRUD Operations
- RESTful APIs
- Centralized Routing
