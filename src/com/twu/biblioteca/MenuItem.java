package com.twu.biblioteca;

/**
 * Created by Thoughtworks on 5/31/15.
 */
public enum  MenuItem {
    LISTBOOKS("List Books"), LISTBORROWBOOKS("List Borrow Books"), QUIT("Quit"), ERROR("Error"), BORROWBOOK("Borrow Book"), RETURNBOOK("Return Book");
    private String name;

    MenuItem(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
