package com.twu.biblioteca;

import com.twu.biblioteca.model.Role;
import com.twu.biblioteca.unit.Cache;

/**
 * Created by Thoughtworks on 6/6/15.
 */
public class CommandNameFactoryImpl implements CommandNameFactory {

    @Override
    public CommandName transStringToCommandName(String commandNameString){
        CommandName commandName = CommandName.getExamType(commandNameString);
        return commandName;
    }

}
