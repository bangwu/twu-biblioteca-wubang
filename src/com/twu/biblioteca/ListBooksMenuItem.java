package com.twu.biblioteca;

/**
 * Created by Thoughtworks on 5/31/15.
 */
public class ListBooksMenuItem implements MenuItem{
    private String name;

    public ListBooksMenuItem(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
