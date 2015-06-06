package com.twu.biblioteca.service;

import com.twu.biblioteca.model.User;
import com.twu.biblioteca.unit.Cache;
import com.twu.biblioteca.unit.Message;

/**
 * Created by Thoughtworks on 6/6/15.
 */
public class UserInfoCommand  extends Command{

    @Override
    protected void execute() {
        User user = Cache.getCache("user");
        Message.putln(user.toString());
    }
}
