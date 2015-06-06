package com.twu.biblioteca.unit;

import com.twu.biblioteca.model.Role;
import com.twu.biblioteca.model.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Thoughtworks on 6/6/15.
 */
public class Cache {
    private static Map<String, User> caches = new HashMap<String, User>();

    static {
        caches.put("user", new User(Role.Customer));
    }

    public static void setCache(String userName, User user) {
        caches.put(userName, user);
    }

    public static User getCache(String userName) {
        return caches.get(userName);
    }


    public static boolean isNotCustomer() {
        return getCache("user").getRole() != Role.Customer;
    }

    public static boolean isCustomer() {
        return !isNotCustomer();
    }
}
