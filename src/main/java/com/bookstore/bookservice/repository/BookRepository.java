/*
 This is an interface that extends JpaRepository,
 giving you the ability to perform CRUD operations
 on the Book entity without implementing the methods manually.
*/

package com.bookstore.bookservice.repository;

import com.bookstore.bookservice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findByIsbn(String isbn);
}
