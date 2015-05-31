package com.twu.biblioteca.model;

import com.twu.biblioteca.model.Role;

import java.util.UUID;

/**
 * Created by Thoughtworks on 5/31/15.
 */
public class User {
    private String id;
    private String name;
    private Role role;

    public User() {
        this.id = UUID.randomUUID().toString();
    }

    public User(String name, Role role) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
