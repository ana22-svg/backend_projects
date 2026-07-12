```markdown
# Task Manager REST API

A backend REST API built using **Java** and **Spring Boot** for managing tasks.  
This project supports task creation, updating, deletion, searching, filtering, pagination, sorting, category mapping, validation, and global exception handling.

## About The Project

The goal of this project was to build a clean and structured backend application using Spring Boot.

It follows a layered architecture:

- **Controller Layer**: Handles HTTP requests and responses
- **Service Layer**: Contains business logic
- **Repository Layer**: Communicates with the database
- **Entity Layer**: Represents database tables
- **DTO Layer**: Handles request and response data
- **Mapper Layer**: Converts between entities and DTOs

## Features

- Create a new task
- Get all tasks
- Get a task by ID
- Update an existing task
- Delete a task
- Search tasks by title
- Filter tasks by completion status
- Pagination and sorting support
- Category support for tasks
- Request validation
- Global exception handling
- H2 in-memory database integration

## Tech Stack

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- H2 Database
- Maven
- Lombok
- Jakarta Validation

## Project Structure

```text
src/main/java/com/example/taskmanager
│
├── controller
│   ├── TaskController.java
│   └── CategoryController.java
│
├── service
│   ├── TaskService.java
│   └── CategoryService.java
│
├── repository
│   ├── TaskRepository.java
│   └── CategoryRepository.java
│
├── entity
│   ├── Task.java
│   └── Category.java
│
├── dtos
│   ├── TaskRequest.java
│   ├── TaskResponse.java
│   └── CategoryResponse.java
│
├── mapper
│   └── TaskMapper.java
│
├── exception
│   ├── TaskNotFoundException.java
│   └── GlobalExceptionHandler.java
│
└── TaskmanagerApplication.java
```

## API Endpoints

### Task APIs

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/v1/tasks` | Get all tasks with pagination and sorting |
| GET | `/api/v1/tasks/{id}` | Get task by ID |
| POST | `/api/v1/tasks` | Create a new task |
| PUT | `/api/v1/tasks/{id}` | Update a task |
| DELETE | `/api/v1/tasks/{id}` | Delete a task |
| GET | `/api/v1/tasks/search` | Search/filter tasks with pagination |
| GET | `/api/v1/tasks/completed/{status}` | Get tasks by completion status |
| GET | `/api/v1/tasks/search-by-title?title=value` | Search tasks by title |

### Category APIs

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/v1/categories/{id}` | Get category by ID |
| POST | `/api/v1/categories` | Create a new category |

## Sample Task Request

```json
{
  "title": "Complete Spring Boot project",
  "description": "Finish the Task Manager REST API",
  "completed": false,
  "categoryId": 1
}
```

## Sample Task Response

```json
{
  "id": 1,
  "title": "Complete Spring Boot project",
  "description": "Finish the Task Manager REST API",
  "completed": false,
  "createdAt": "2026-07-12T10:30:00",
  "category": {
    "categoryId": 1,
    "name": "Learning",
    "description": "Tasks related to learning and practice"
  }
}
```

## Pagination And Sorting Example

```http
GET /api/v1/tasks?page=0&size=10&sortBy=createdAt&sortDir=DESC
```

## Search And Filter Example

```http
GET /api/v1/tasks/search?title=spring&completed=false&page=0&size=5&sortBy=createdAt&sortDir=DESC
```

## H2 Database Console

The project uses an H2 in-memory database.

H2 Console URL:

```text
http://localhost:8080/h2-console
```

Default database details:

```text
JDBC URL: jdbc:h2:mem:taskdb
Username: sa
Password: password
```
```
