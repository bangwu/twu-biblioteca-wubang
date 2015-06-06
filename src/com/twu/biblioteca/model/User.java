package com.twu.biblioteca.model;

import java.util.UUID;

/**
 * Created by Thoughtworks on 6/6/15.
 */
public class User {
//    name, email address and phone number
    private String id;
    private String name;
    private String email;
    private String passWord;
    private String address;
    private String phoneNumber;
    private Role role;

    public User(String name, String passWord, String email, String address, String phoneNumber, Role role) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.passWord = passWord;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.role = role;
    }

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public User(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getPassWord() {
        return passWord;
    }

    public Role getRole() {
        return role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (name != null ? !name.equals(user.name) : user.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
