package com.twu.biblioteca.service;

import com.twu.biblioteca.db.BookDB;
import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.unit.ConsoleInput;
import com.twu.biblioteca.unit.Message;

/**
 * Created by Thoughtworks on 6/6/15.
 */
public class ReturnBookCommand extends Command {

    @Override
    protected void execute() {
        Message.put("Please input book name: ");
        String bookName = ConsoleInput.getString();
        Book book = BookDB.getBookByName(bookName);
        if (book != null && !book.getStatus()) {
            boolean status = BookDB.update(book.getId(), null, true);
            if (status) {
                Message.putln("Thank you for returning the book.");
            }
        } else {
            Message.putln("That is not a valid book to return.");
        }
    }
}
