package com.twu.biblioteca.service;

import com.twu.biblioteca.db.BookDB;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Thoughtworks on 5/31/15.
 */
public class BookServiceTest {
    @Test
    public void getBooksTest() {
        BookService bookService = new BookService();
        assertEquals(BookDB.books.size(), bookService.getBooks().size());
    }
}
