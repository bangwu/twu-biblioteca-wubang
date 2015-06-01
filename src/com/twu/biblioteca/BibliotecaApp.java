package com.twu.biblioteca;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Role;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.service.BookService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Welcome To Library");
        init();
    }

    private static void init() {
        Menu menu = new Menu();
        menu.addMenuItem(MenuItem.LISTBOOKMENUITEM);
        menu.addMenuItem(MenuItem.LISTBORROWBOOKMENUITEM);
        menu.addMenuItem(MenuItem.QUITMENUITEM);
        MenuItem menuItem;
        do {
            menuItem = menu.showMenu();
            BookService bookService = new BookService();
            switch (menuItem) {
                case LISTBOOKMENUITEM:
                    bookService.listBook();
                    bookService.borrowBook();
                    break;
                case LISTBORROWBOOKMENUITEM:
                    bookService.listBorrowBook();
                    break;
                case QUITMENUITEM:
                    System.out.println("This System will be exit!");
                    break;
                case ERRORMENUITEM:
                    System.out.println("You choose is not valid, please input again");
                    break;
            }
        } while (true);
    }



}
