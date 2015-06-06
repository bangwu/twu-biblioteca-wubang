package com.twu.biblioteca.service;

import com.twu.biblioteca.db.UserDB;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.unit.Cache;
import com.twu.biblioteca.unit.ConsoleInput;
import com.twu.biblioteca.unit.Message;

/**
 * Created by Thoughtworks on 6/6/15.
 */
public class LoginCommand extends Command {

    @Override
    protected void execute() {
        Message.putln("You should login");
        Message.put("Please input you name:");
        String name = ConsoleInput.getString();
        User user = UserDB.findByName(name);
        user = validateUser(user);
        Cache.setCache("user", user);
    }

    private User validateUser(User user) {
        User result = null;
        if (!user.getPassWord().equals("")) {
            Message.put("Please input you pass:");
            String pass = ConsoleInput.getString();
            result = validateUserPassWord(user, pass);
        } else {
            Message.putln("You name is not exist");
        }
        return result;
    }

    private User validateUserPassWord(User user, String pass) {
        User result = null;
        if (pass.equals(user.getPassWord())) {
            Message.putln("Login Success");
            Message.putln("Welcome " + user.getName() + " visit this system");
            result = user;
        } else {
            Message.putln("You password is not valid");
        }
        return result;
    }
}
