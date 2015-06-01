package com.twu.biblioteca;

import com.twu.biblioteca.service.BookService;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Welcome To Library");
        init();
    }

    private static void init() {
        Menu menu = new Menu();
        menu.addMenuItem(MenuItem.LISTBOOKMENUITEM);
        menu.addMenuItem(MenuItem.BORROWBOOK);
        menu.addMenuItem(MenuItem.LISTBORROWBOOKMENUITEM);
        menu.addMenuItem(MenuItem.QUITMENUITEM);
        MenuItem menuItem;
        do {
            menuItem = menu.showMenu();
            BookService bookService = new BookService();
            switch (menuItem) {
                case LISTBOOKMENUITEM:
                    bookService.listBooks();
                    break;
                case BORROWBOOK:
                    bookService.borrowBook();
                    break;
                case LISTBORROWBOOKMENUITEM:
                    bookService.listBorrowBooks();
                    break;
                case QUITMENUITEM:
                    System.out.println("This System will be exit!");
                    break;
                case ERRORMENUITEM:
                    System.out.println("You choose is not valid, please input again");
                    break;
            }
        } while (menuItem != MenuItem.QUITMENUITEM);
    }



}
