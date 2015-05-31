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
        menu.addMenuItem(new ListBooksMenuItem("List Books"));
        int optionNumber = menu.showMenu();
        if(0 == optionNumber){
            BookService bookService = new BookService();
            List<Book> books = bookService.getBooks();
            for (Book book: books){
                System.out.println(book.toString());
            }
        }
    }

}
