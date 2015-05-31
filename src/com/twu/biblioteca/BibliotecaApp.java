package com.twu.biblioteca;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.service.BookService;

import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Welcome To Library");
        init();
    }

    private static void init() {
        Menu menu = new Menu();
        menu.addMenuItem(MenuItem.LISTBOOKMENUITEM);
        menu.addMenuItem(MenuItem.QUITMENUITEM);
        MenuItem menuItem;
        do {
            menuItem = menu.showMenu();
            switch (menuItem) {
                case LISTBOOKMENUITEM:
                    BookService bookService = new BookService();
                    List<Book> books = bookService.getBooks();
                    for (Book book : books) {
                        System.out.println(book.toString());
                    }
                    break;
                case QUITMENUITEM:
                    System.out.println("This System will be exit!");
                    break;
                case ERRORMENUITEM:
                    System.out.println("You choose is not valid, please input again");
                    break;
            }
        } while (menuItem == MenuItem.ERRORMENUITEM);
    }

}
