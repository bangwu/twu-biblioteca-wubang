package com.twu.biblioteca;

import com.twu.biblioteca.service.Command;

/**
 * Created by Thoughtworks on 6/6/15.
 */
public interface CommandFactory {
    Command transStringToCommand(CommandName command);
}
