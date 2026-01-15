# Task Manager API

## Português

### Descrição
API REST para gerenciamento de tarefas, desenvolvida em Java com Spring Boot.  
O projeto implementa um CRUD completo e utiliza PostgreSQL como banco de dados, seguindo uma arquitetura em camadas.

### Tecnologias Utilizadas
- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven
- Git & GitHub

### Arquitetura
O projeto foi estruturado seguindo boas práticas de separação de responsabilidades:
- **Controller**: recebe e responde às requisições HTTP
- **Service**: contém a lógica de negócio
- **Repository**: responsável pelo acesso ao banco de dados
- **Model**: entidades do sistema

### Funcionalidades (CRUD)
- Criar uma tarefa
- Listar todas as tarefas
- Atualizar uma tarefa existente
- Excluir uma tarefa

### Endpoints Principais
- `POST /tasks` → Criar tarefa
- `GET /tasks` → Listar tarefas
- `PUT /tasks/{id}` → Atualizar tarefa
- `DELETE /tasks/{id}` → Excluir tarefa

### Banco de Dados
- PostgreSQL
- Mapeamento ORM com JPA/Hibernate
- Configuração via `application.properties`

---

## English

### Description
REST API for task management, developed in Java using Spring Boot.  
This project implements a complete CRUD and uses PostgreSQL as the database, following a layered architecture.

### Technologies Used
- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven
- Git & GitHub

### Architecture
The project was structured following best practices for separation of concerns:
- **Controller**: handles and responds to HTTP requests
- **Service**: contains the business logic
- **Repository**: responsible for database access
- **Model**: system entities

### Features (CRUD)
- Create a task
- List all tasks
- Update an existing task
- Delete a task

### Main Endpoints
- `POST /tasks` → Create a task
- `GET /tasks` → List tasks
- `PUT /tasks/{id}` → Update a task
- `DELETE /tasks/{id}` → Delete a task

### Database
- PostgreSQL
- ORM mapping with JPA/Hibernate
- Configuration via `application.properties`
