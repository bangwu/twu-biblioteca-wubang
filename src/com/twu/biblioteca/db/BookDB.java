package com.twu.biblioteca.db;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Thoughtworks on 6/6/15.
 */
public class BookDB {
    private static List<Book> books = new ArrayList<Book>();
    static{
        books.add(new Book("Head First Java", new Date(), new User("zhangsan")));
        books.add(new Book("Head First C#", new Date(), new User("lisi")));
        books.add(new Book("Head First C", new Date(), new User("wangwu")));
        books.add(new Book("Head First Ruby", new Date(), new User("zhaoliu")));
        books.add(new Book("Head First C++", new Date(), new User("liqi")));
    }

    public static List<Book> getAll() {
        List<Book> result = new ArrayList<Book>();
        for (Book book : books){
            if(book.getStatus()){
                result.add(book);
            }
        }
        return result;
    }

    public static Book getBookByName(String bookName) {
        Book result =null;
        for (Book book : books){
            if(book.getName().equalsIgnoreCase(bookName)){
                result = book;
            }
        }
        return result;
    }

    public static Book getBookById(String id) {
        Book result =null;
        for (Book book : books){
            if(book.getId().equalsIgnoreCase(id)){
                result = book;
            }
        }
        return result;
    }

    public static boolean update(String id, User borrowedUser, boolean status) {
        boolean result = false;
        Book tmpBook = getBookById(id);
        tmpBook.setStatus(status);
        tmpBook.setBorrowUser(borrowedUser);
        books.remove(tmpBook);
        result = books.add(tmpBook);
        return result;
    }

}
