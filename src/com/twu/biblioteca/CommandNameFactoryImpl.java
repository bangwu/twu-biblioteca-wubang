package com.twu.biblioteca;

import com.twu.biblioteca.model.Role;
import com.twu.biblioteca.unit.Cache;

/**
 * Created by Thoughtworks on 6/6/15.
 */
public class CommandNameFactoryImpl implements CommandNameFactory {
    private static String packageName = "com.twu.biblioteca.CommandName.";

    @Override
    public CommandName transStringToCommandName(String commandNameString) {
        CommandName commandName = null;
        if (commandNameString.equalsIgnoreCase("BookList")) {
            commandName = CommandName.BookListName;
        }else if (commandNameString.equalsIgnoreCase("BorrowBook")){
            commandName = CommandName.BorrowBookName;
        }else if(commandNameString.equalsIgnoreCase("ReturnBook")){
            commandName = CommandName.ReturnBookName;
        }else if (commandNameString.equalsIgnoreCase("Quit")){
            commandName = CommandName.QuitName;
        }else if(commandNameString.equalsIgnoreCase("MovieList")){
            commandName = CommandName.MovieListName;
        }else if(commandNameString.equalsIgnoreCase("Login")&& Cache.isCustomer()){
            commandName = CommandName.LoginName;
        }else if(commandNameString.equalsIgnoreCase("Logout")&& Cache.isNotCustomer()){
            commandName = CommandName.LogoutName;
        }else if(commandNameString.equalsIgnoreCase("UserInfo") && Cache.isNotCustomer()){
            commandName = CommandName.UserInfoCommand;
        }else {
            commandName = CommandName.ErrorName;
        }
        return commandName;
    }

}
