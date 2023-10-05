

# Bookstore Service (Microservices & API) 📚

Welcome to the 'Bookstore Service (Microservices & API)'! 

This repository contains the backend services required for this educational project, which is an online bookstore.

## Table of Contents

1. [Features](#features)
2. [Technologies Used](#technologies-used)
3. [Getting Started](#getting-started)
4. [Contributing](#contributing)
5. [License](#license)

## Features

- **Book Service**: Manages all CRUD operations for books.
- **Price Service**: Handles pricing details for books.
- **Inventory Service**: Tracks physical quantities of books in the store.

(Note: Elaborate on any other services or features you may have.)

## Technologies Used

- **Spring Boot**: For creating the RESTful microservices.
- **PostgreSQL**: Our primary data store.
- **Maven**: Dependency management and build tool.
- **JUnit**: For unit testing.
- **Docker** (if you use it): For containerization.

## Getting Started

1. **Clone the Repository**:
    ```bash
    git clone https://github.com/giarcheuli/bookstore-microservices.git
    cd bookstore-microservices
    ```

2. **Install Dependencies**:
    ```bash
    mvn clean install
    ```

3. **Run the Services**:
    ```bash
    mvn spring-boot:run
    ```

4. **Access the API**:
   - Book Service: `http://localhost:8081/books`
   - Price Service: `http://localhost:8082/prices`
   - Inventory Service: `http://localhost:8083/inventory`
   
(Note: Make sure to update the URLs if they differ.)

## Contributing

I'd love a contributor! Please fork the repository and submit a pull request if you want to contribute. For major changes, please open an issue first to discuss what you'd like to change.

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.

