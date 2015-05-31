package com.twu.biblioteca.service;

import com.twu.biblioteca.db.BookDB;
import com.twu.biblioteca.model.Book;

import java.util.List;

/**
 * Created by Thoughtworks on 5/31/15.
 */
public class BookService {
    public List<Book> getBooks() {
        return BookDB.books;
    }
}
