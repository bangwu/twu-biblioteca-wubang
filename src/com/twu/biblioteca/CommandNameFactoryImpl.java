package com.twu.biblioteca;

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
        }else if(commandNameString.equalsIgnoreCase("Login")){
            commandName = CommandName.LoginName;
        }else{
            commandName = CommandName.ErrorName;
        }
        return commandName;
    }
}
