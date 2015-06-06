package com.twu.biblioteca;

import com.twu.biblioteca.unit.Message;

/**
 * Created by Thoughtworks on 6/6/15.
 */
public enum CommandName {
    BookListName("BookListCommand"), BorrowBookName("BorrowBookCommand"), QuitName("QuitCommand"), ReturnBookName("ReturnBookCommand"), ErrorName("ValidCommand");
    private String name;

    CommandName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void showAllCommandName(){
        Message.putln("");
        Message.putln("==============Menu List====================");
        Message.putln("1 "+CommandName.BookListName);
        Message.putln("2 "+CommandName.BorrowBookName);
        Message.putln("3 "+CommandName.ReturnBookName);
        Message.putln("4 "+CommandName.QuitName);
        Message.putln("===========================================");
        Message.put("Please input command:");
    }
}
