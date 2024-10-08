package org.example.testtasknerdy.service;

import org.example.testtasknerdy.dto.BorrowedBookInfo;
import org.example.testtasknerdy.entity.Book;

import java.util.List;

public interface BookService {
    Book add(Book book);
    Book update(Long id, Book book);
    List<Book> findAll();


    Book findById(Long id);
    void delete(Long id);

    List<String> getDistinctBorrowedBookTitles();

    List<BorrowedBookInfo> findDistinctBorrowedBooksWithCount();
}
