package com.twu.biblioteca.model;

import com.twu.biblioteca.model.User;

import java.util.*;

/**
 * Created by Thoughtworks on 5/31/15.
 */
public class Book {


    private String id;
    private String name;
    private Date publicTime;
    private User author;

    public Book() {
        this.id = UUID.randomUUID().toString();
    }

    public Book(String name, Date publicTime, User author) {
        this.id = UUID.randomUUID().toString();
        this.name = name+id;
        this.publicTime = publicTime;
        this.author = author;
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

    public Date getPublicTime() {
        return publicTime;
    }

    public void setPublicTime(Date publicTime) {
        this.publicTime = publicTime;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", publicTime=" + publicTime +
                ", author=" + author.getName() +
                '}';
    }
}
