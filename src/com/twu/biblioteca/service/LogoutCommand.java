package com.twu.biblioteca.service;

import com.twu.biblioteca.model.Role;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.unit.Cache;

/**
 * Created by Thoughtworks on 6/6/15.
 */
public class LogoutCommand extends Command {
    @Override
    protected void execute() {
        Cache.setCache("user", new User(Role.Customer));
    }
}
