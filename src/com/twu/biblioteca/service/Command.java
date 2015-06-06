package com.twu.biblioteca.service;

import com.twu.biblioteca.model.User;

/**
 * Created by Thoughtworks on 6/6/15.
 */
public abstract class Command {
    public void process() {
        execute();
    }

    protected void execute() {

    }
}
