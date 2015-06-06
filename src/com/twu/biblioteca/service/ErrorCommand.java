package com.twu.biblioteca.service;

import com.twu.biblioteca.unit.Message;

/**
 * Created by Thoughtworks on 6/6/15.
 */
public class ErrorCommand extends Command{
    @Override
    public void process() {
        Message.putln("Select a valid option!");
    }
}
