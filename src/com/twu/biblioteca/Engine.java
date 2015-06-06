package com.twu.biblioteca;

import com.twu.biblioteca.service.Command;
import com.twu.biblioteca.unit.ConsoleInput;
import com.twu.biblioteca.unit.Message;

/**
 * Created by Thoughtworks on 6/6/15.
 */
public class Engine implements Runnable{
    public Engine() {
        new Thread(this).start();
    }

    @Override
    public void run() {
        Message.putln("Welcome To Biblioteca Library");
        while(true){
            CommandName.showAllCommandName();
            CommandFactory commandFactory = new CommandFactoryImpl();
            String commandNameString = ConsoleInput.getString();
            CommandNameFactory commandNameFactory = new CommandNameFactoryImpl();
            CommandName commandName = commandNameFactory.transStringToCommandName(commandNameString);
            Command command = commandFactory.transStringToCommand(commandName);
            command.process();
        }
    }
}
