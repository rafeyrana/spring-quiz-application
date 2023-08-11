# Quiz Application Using Springboot

Welcome to the Quiz Application repository! This web-based platform allows users to create quizzes, generate random sets of questions, and participate in quizzes.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [MVC Architecture](#mvc-architecture)
- [License](#license)

## Features

- Create quizzes with specified categories, number of questions, and titles.
- Generate random sets of questions for quizzes.
- Participate in quizzes and answer questions.
- Manage questions and quizes(add, edit, delete) in the database.


## Technologies Used

- Spring Boot: Backend framework for building robust Java applications.
- PostgreSQL: Database management system for storing quiz-related data.
- Spring Data JPA: Object-Relational Mapping for simplified database interactions.

## MVC Architecture

The Quiz Application follows the Model-View-Controller (MVC) architectural pattern:

- **Model:** Represents the data and business logic of the application. Includes entities like `Question` and `Quiz`.

- **View:** Handles the presentation logic and user interface. In this application, the view is represented by the API endpoints that users interact with.

- **Controller:** Acts as an intermediary between the Model and View. Controllers handle HTTP requests, process input, and manage interactions between the Model and View.

## License

This project is licensed under the [MIT License](LICENSE).
