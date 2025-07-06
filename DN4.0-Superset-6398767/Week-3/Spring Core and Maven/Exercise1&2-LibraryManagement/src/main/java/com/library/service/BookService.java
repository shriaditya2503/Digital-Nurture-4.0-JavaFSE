package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public void performSaveOperation(String bookName) {
        System.out.println("BookService: Request to save book received.");
        bookRepository.saveBook(bookName);
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
}
