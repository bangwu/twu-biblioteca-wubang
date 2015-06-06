package com.twu.biblioteca.model;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Thoughtworks on 6/6/15.
 */
public class Book {
    private String id;
    private String name;
    private Date publish;
    private User author;
    private User borrowedUser;
    private boolean status;

    public Book(String name, Date publish, User author) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.publish = publish;
        this.author = author;
        this.borrowedUser = null;
        this.status = true;
    }

    public Book() {

    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", publish=" + publish +
                ", author=" + author +
                ", borrowedUser=" + borrowedUser +
                ", status=" + status +
                '}';
    }

    public String getName() {
        return name;
    }

    public boolean getStatus() {
        return status;
    }

    public String getId() {
        return id;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (id != null ? !id.equals(book.id) : book.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    public void setBorrowUser(User borrowUser) {
        this.borrowedUser = borrowUser;
    }

    public User getBorrowedUser() {
        return borrowedUser;
    }


}
