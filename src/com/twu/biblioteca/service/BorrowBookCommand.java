package com.twu.biblioteca.service;

import com.twu.biblioteca.db.BookDB;
import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Role;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.unit.Cache;
import com.twu.biblioteca.unit.ConsoleInput;
import com.twu.biblioteca.unit.Message;

/**
 * Created by Thoughtworks on 6/6/15.
 */
public class BorrowBookCommand extends Command {

    @Override
    protected void execute() {
        User user = Cache.getCache("user");
        if (user.getRole() == Role.Customer) {
            new LoginCommand().process();
        }
        user = Cache.getCache("user");
        if(user.getRole() == Role.Student){
            borrowBook(user);
        }

    }

    private void borrowBook(User user) {
        Message.put("Input book name:");
        String bookName = ConsoleInput.getString();
        Book book = BookDB.getBookByName(bookName);
        if (book != null && book.getStatus()) {
            boolean status = false;
            if (user.getRole() == Role.Student) {
                status = BookDB.update(book.getId(), user, false);
            }
            if (status) {
                Message.putln("Thank you! Enjoy the book");
            }
        } else {
            Message.putln("That book is not available.");
        }
    }
}
