# Employee Management System

A web-based **Employee Management System** developed using **Java, Spring Boot, Spring Data JPA, Thymeleaf, HTML, CSS, JavaScript, and MySQL**.

The application helps manage employee information through a simple and user-friendly interface.

## Features

* Add new employees
* View all employees
* Search employees by name, department, or designation
* Edit employee details
* Delete employees
* Employee details include:

  * Employee ID
  * Name
  * Date of Joining
  * Department
  * Designation
  * Email
  * Salary
* Form validation
* Responsive and user-friendly interface

## Technologies Used

### Backend

* Java
* Spring Boot
* Spring MVC
* Spring Data JPA
* Maven

### Frontend

* HTML
* CSS
* JavaScript
* Thymeleaf

### Database

* MySQL

### Tools

* Visual Studio Code
* MySQL Workbench
* Git
* GitHub
* Postman

## Project Structure

```text
employee-management-system
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.employee_management_system
│   │   │       ├── controller
│   │   │       ├── employee
│   │   │       ├── service
│   │   │       └── EmployeeManagementSystemApplication.java
│   │   │
│   │   └── resources
│   │       ├── templates
│   │       │   ├── index.html
│   │       │   ├── employee-list.html
│   │       │   ├── add-employee.html
│   │       │   ├── edit-employee.html
│   │       │   └── employee.html
│   │       └── application.properties
│
├── .gitignore
├── pom.xml
├── mvnw
└── mvnw.cmd
```

## How to Run the Project

### 1. Clone the repository

```bash
git clone https://github.com/bandlasusmitha3/employee-management-system.git
```

### 2. Open the project

Open the project in **Visual Studio Code**, IntelliJ IDEA, or Spring Tool Suite.

### 3. Configure MySQL

Create a MySQL database and update the database configuration in:

```text
src/main/resources/application.properties
```

Add your own MySQL username and password.

### 4. Run the application

Using Maven Wrapper on Windows:

```bash
mvnw.cmd spring-boot:run
```

Or run:

```text
EmployeeManagementSystemApplication.java
```

### 5. Open the application

Open the application in your browser using the port configured in `application.properties`.

## Main Functionalities

### Employee List

Displays employee information in a table with options to edit or delete employee records.

### Add Employee

Allows users to add a new employee by entering employee details such as name, date of joining, department, designation, email, and salary.

### Edit Employee

Allows existing employee information to be updated.

### Delete Employee

Allows an employee record to be removed from the system.

## Future Enhancements

* User authentication and authorization
* Role-based access control
* Employee profile management
* Pagination
* Advanced search and filtering
* Dashboard with employee statistics
* REST API integration
* Deployment to a cloud platform

## Author

**Susmitha**

BCA Graduate | Java Developer

GitHub: https://github.com/bandlasusmitha3
