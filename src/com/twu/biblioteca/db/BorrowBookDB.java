package com.twu.biblioteca.db;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Thoughtworks on 5/31/15.
 */
public class BorrowBookDB {
    private static Map<User, ArrayList<Book>> borrowBooksList = new HashMap<User, ArrayList<Book>>();

    public static void saveBook(User user, Book chooseBook) {
        if (borrowBooksList.keySet().contains(user)) {
            borrowBooksList.get(user).add(chooseBook);
        }else {
            ArrayList<Book> bookArrayList = new ArrayList<Book>();
            bookArrayList.add(chooseBook);
            borrowBooksList.put(user,bookArrayList);
        }
    }

    public static Map<User, ArrayList<Book>> getAll() {
        return borrowBooksList;
    }
}
