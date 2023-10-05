/*
This class contains business logic for handling Book objects.
It uses the BookRepository to interact with the database.
*/

package com.bookstore.bookservice.service;

import com.bookstore.bookservice.model.Book;
import com.bookstore.bookservice.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    public Book updateBook(Long id, Book bookDetails) {
        if (bookRepository.existsById(id)) {
            Book existingBook = bookRepository.getOne(id);
            existingBook.setTitle(bookDetails.getTitle());
            existingBook.setAuthor(bookDetails.getAuthor());
            existingBook.setIsbn(bookDetails.getIsbn());
            existingBook.setYearPublished(bookDetails.getYearPublished());
            return bookRepository.save(existingBook);
        } else {
            return null;
        }
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    // You can add more methods as needed.
}
