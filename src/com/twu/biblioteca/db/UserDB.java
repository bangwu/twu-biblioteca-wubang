package com.twu.biblioteca.db;

import com.twu.biblioteca.model.Role;
import com.twu.biblioteca.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thoughtworks on 6/6/15.
 */
public class UserDB {
    private static List<User> users = new ArrayList<User>();
    static {
        users.add(new User("wu-bang", "12345678","wubang@thouhtworks.com", "wuhan guanggu", "12345678910", Role.Admin));
        users.add(new User("wang-yun", "12345678","wangyun@thouhtworks.com", "wuhan guanggu", "13135652403", Role.Student));
        users.add(new User("li-si", "12345678","lisi@thouhtworks.com", "wuhan guanggu", "13164600981", Role.Student));
    }

    public static User findByName(String name) {
        User result= null;
        for(User user: users){
            if(user.getName().equalsIgnoreCase(name))
                result= user;
        }
        return result;
    }
}
