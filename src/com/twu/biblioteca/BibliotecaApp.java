package com.twu.biblioteca;

import com.twu.biblioteca.service.BookService;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Welcome To Library");
        init();
    }

    private static void init() {
        Menu menu = initMenu();
        MenuItem menuItem;
        do {
            menuItem = menu.showMenu();
            BookService bookService = new BookService();
            switch (menuItem) {
                case LISTBOOKS:
                    bookService.listBooks();
                    break;
                case BORROWBOOK:
                    bookService.borrowBook();
                    break;
                case LISTBORROWBOOKS:
                    bookService.listBorrowBooks();
                    break;
                case RETURNBOOK:
                    bookService.returnBook();
                    break;
                case QUIT:
                    System.out.println("This System will be exit!");
                    break;
                case ERROR:
                    System.out.println("You choose is not valid, please input again");
                    break;
            }
        } while (menuItem != MenuItem.QUIT);
    }

    private static Menu initMenu() {
        Menu menu = new Menu();
        menu.addMenuItem(MenuItem.LISTBOOKS);
        menu.addMenuItem(MenuItem.BORROWBOOK);
        menu.addMenuItem(MenuItem.LISTBORROWBOOKS);
        menu.addMenuItem(MenuItem.RETURNBOOK);
        menu.addMenuItem(MenuItem.QUIT);
        return menu;
    }


}
