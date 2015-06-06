package com.twu.biblioteca.service;

import com.twu.biblioteca.model.User;
import com.twu.biblioteca.unit.ConsoleInput;
import com.twu.biblioteca.unit.Message;

/**
 * Created by Thoughtworks on 6/6/15.
 */
public class QuitCommand extends Command {

    @Override
    protected void execute() {
        Message.put("Are you sure you want to exit this sysystem?(yes/no)");
        String status = ConsoleInput.getString();
        if (status.equalsIgnoreCase("yes")){
            Message.putln("Welcome back!");
            System.exit(0);
        }
    }
}
