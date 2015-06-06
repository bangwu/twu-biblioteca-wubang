package com.twu.biblioteca;

import com.twu.biblioteca.service.BookListCommand;
import com.twu.biblioteca.service.Command;
import com.twu.biblioteca.service.ErrorCommand;

/**
 * Created by Thoughtworks on 6/6/15.
 */
public class CommandFactoryImpl implements CommandFactory
{
    private static String packageName = "com.twu.biblioteca.service.";

    @Override
    public Command transStringToCommand(CommandName commandName) {
        Command command = null;
        try {
            Class<Command> commandClass = (Class<Command>) Class.forName(packageName+ commandName);
            command = commandClass.newInstance();
        } catch (Exception e) {
            command = new ErrorCommand();
        }
        return command;
    }
}
