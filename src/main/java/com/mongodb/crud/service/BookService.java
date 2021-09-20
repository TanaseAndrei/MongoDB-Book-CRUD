package com.mongodb.crud.service;

import com.mongodb.crud.controller.exception.AppException;
import com.mongodb.crud.model.Book;
import com.mongodb.crud.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public Long saveBook(Book book) {
        Book saveBook = bookRepository.save(book);
        return saveBook.getId();
    }

    public Book findById(long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new AppException(HttpStatus.NOT_FOUND.value(), "The book with the id " + id + " does not exist"));
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public void deleteById(long id) {
        Book book = findById(id);
        bookRepository.delete(book);
    }
}
