package com.twu.biblioteca.service;

import com.twu.biblioteca.db.BookDB;
import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Role;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.unit.Cache;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thoughtworks on 6/6/15.
 */
public class BookListCommand extends Command {
    @Override
    protected void execute() {
        User user = Cache.getCache("user");
        List<Book> books = null;
        if (user.getRole() == Role.Customer)
            books = BookDB.getAllAvailable();
        else if (user.getRole() == Role.Student)
            books = BookDB.getBookByUser(user);
        else
            books = BookDB.getAllBooks();
        listBooks(books);
    }

    private void listBooks(List<Book> bookList) {
        for (Book book : bookList) {
            System.out.println(book.toString());
        }
    }
}
