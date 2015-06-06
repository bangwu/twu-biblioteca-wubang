package com.twu.biblioteca;

import com.twu.biblioteca.db.BookDB;
import com.twu.biblioteca.service.BookListCommand;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Thoughtworks on 6/6/15.
 */
public class BookListCommandTest {
    @Test
    public void process() throws Exception {
        BookListCommand bookListCommand = new BookListCommand();
        bookListCommand.process();
        assertEquals(5, BookDB.getAllAvailable().size());
    }
}
