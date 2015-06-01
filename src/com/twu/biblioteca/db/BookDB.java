package com.twu.biblioteca.db;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Role;
import com.twu.biblioteca.model.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Thoughtworks on 5/31/15.
 */
public class BookDB {
    private static List<Book> books = new ArrayList<Book>();
    static {
        for(int i=0; i<10; i++){
            books.add(i, new Book("java", new Date(), new User("wubang", Role.AUTHOR)));
        }
    }

    public static Book getBookByIndex(int chooseBookIndex) {
        return books.get(chooseBookIndex);
    }

    public static List<Book> getAllBooks() {
        return books;
    }

    public static void removeBook(Book chooseBook) {
        books.remove(chooseBook);
    }
}
