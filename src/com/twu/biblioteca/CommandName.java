package com.twu.biblioteca;

import com.twu.biblioteca.model.Role;
import com.twu.biblioteca.unit.Cache;
import com.twu.biblioteca.unit.Message;

/**
 * Created by Thoughtworks on 6/6/15.
 */
public enum CommandName {
    BookListName("BookListCommand"),
    BorrowBookName("BorrowBookCommand"),
    QuitName("QuitCommand"),
    ReturnBookName("ReturnBookCommand"),
    ErrorName("ValidCommand"),
    MovieListName("MovieListCommand"),
    LoginName("LoginCommand"),
    UserInfoCommand("UserInfoCommand"), LogoutName("LogoutCommand");

    private String name;

    public static CommandName getExamType(String name) {
        for (CommandName examType : CommandName.values()) {
            if (examType.getName().equalsIgnoreCase(name+"Command")) {
                return examType;
            }
        }
        return BookListName;
    }

    CommandName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void showAllCommandName() {
        Message.putln("");
        Message.putln("==============Menu List====================");
        Message.putln("---" + CommandName.BookListName);
        Message.putln("---" + CommandName.BorrowBookName);
        Message.putln("---" + CommandName.ReturnBookName);
        Message.putln("---" + CommandName.MovieListName);
        if (Cache.isNotCustomer()) {
            Message.putln("---" + CommandName.LogoutName);
            Message.putln("---" + CommandName.UserInfoCommand);
        } else {
            Message.putln("---" + CommandName.LoginName);
        }
        Message.putln("---" + CommandName.QuitName);
        Message.putln("===========================================");
        Message.put("Please input command:");
    }

    public String getName() {
        return name;
    }
}
