package com.bookstore.bookservice.controller;

import com.bookstore.bookservice.model.Book;
import com.bookstore.bookservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        Book savedBook = bookService.saveBook(book);
        return ResponseEntity.ok(savedBook);  // Returns the saved book with a 200 OK status.
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = bookService.getAllBooks();
        return ResponseEntity.ok(books);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        return bookService.getBookById(id)
                .map(ResponseEntity::ok)  // If book is found, return it with a 200 OK status.
                .orElseGet(() -> ResponseEntity.notFound().build());  // If not found, return a 404 Not Found status.
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book bookDetails) {
        Book updatedBook = bookService.updateBook(id, bookDetails);
        if (updatedBook != null) {
            return ResponseEntity.ok(updatedBook);  // Returns the updated book with a 200 OK status.
        } else {
            return ResponseEntity.notFound().build();  // If not found, return a 404 Not Found status.
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
        return ResponseEntity.noContent().build();  // Returns a 204 No Content status indicating successful deletion.
    }

    // You can continue to add other endpoints as needed, such as finding books by specific criteria, filtering by genres, etc.
}
