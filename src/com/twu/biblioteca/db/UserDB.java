package com.twu.biblioteca.db;

import com.twu.biblioteca.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thoughtworks on 5/31/15.
 */
public class UserDB {
    private static List<User> users = new ArrayList<User>();
    static {
        users.add(0, new User());
    }
}
