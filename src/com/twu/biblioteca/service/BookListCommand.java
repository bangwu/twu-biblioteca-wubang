package com.twu.biblioteca.service;

import com.twu.biblioteca.db.BookDB;
import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.service.Command;

import java.util.List;

/**
 * Created by Thoughtworks on 6/6/15.
 */
public class BookListCommand extends Command {
    @Override
    protected void execute() {
        List<Book> books = BookDB.getAll();
        listBooks(books);
    }
    private void listBooks(List<Book> bookList){
        for(Book book : bookList){
            System.out.println(book.toString());
        }
    }
}
