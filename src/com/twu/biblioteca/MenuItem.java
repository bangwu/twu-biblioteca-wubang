package com.twu.biblioteca;

/**
 * Created by Thoughtworks on 5/31/15.
 */
public enum  MenuItem {
    LISTBOOKMENUITEM("List Books"), LISTBORROWBOOKMENUITEM("List Borrow Books"),QUITMENUITEM("Quit"), ERRORMENUITEM("Error");
    private String name;

    MenuItem(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
