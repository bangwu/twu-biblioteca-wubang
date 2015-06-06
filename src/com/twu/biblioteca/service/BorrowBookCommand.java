package com.twu.biblioteca.service;

import com.twu.biblioteca.db.BookDB;
import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.unit.ConsoleInput;
import com.twu.biblioteca.unit.Message;

/**
 * Created by Thoughtworks on 6/6/15.
 */
public class BorrowBookCommand extends Command {
    @Override
    public void process() {
        Message.put("Input book name:");
        String bookName = ConsoleInput.getString();
        Book book = BookDB.getBookByName(bookName);
        if(book!=null && book.getStatus()){
            User borrowUser = new User("1150330030","wubang");
            boolean status = BookDB.update(book.getId(), borrowUser, false);
            if(status){
                Message.putln("Thank you! Enjoy the book");
            }
        }else{
            Message.putln("That book is not available.");
        }
    }
}
