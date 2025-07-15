# Employee Management System

This is a simple **Java-based Employee Management System** that performs basic CRUD operations using a **modular architecture** (Controller, Service, DAO, Model) and **MySQL** as the database. It is built using **JDBC (Java Database Connectivity)**.

---

## 🔧 Technologies Used

- Java (Core)
- JDBC
- MySQL
- MySQL Workbench
- IntelliJ IDEA / Eclipse
- Git & GitHub

---

## 📁 Project Structure
```
EmployeeManagementSystem/
│
├── controller/
│ └── Employee.java # Main class with user input
│
├── service/
│ └── EmployeeService.java # Business logic layer
│
├── DAO/
│ └── EmployeeDao.java # Database operations (JDBC)
│
├── model/
│ └── Employee1.java # Employee entity class
│
└── db.sql # MySQL table creation script

```
---

## 📋 Features

- Add a new employee
- Update existing employee details
- Delete an employee by ID
- Show all employees
