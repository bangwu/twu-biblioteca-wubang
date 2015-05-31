package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Thoughtworks on 5/31/15.
 */
public class Menu {
    private List<MenuItem> menuItems = new ArrayList<MenuItem>();

    public int showMenu(){
        while(true) {
            System.out.println("please input you choose number");
            for (MenuItem menuItem : menuItems) {
                System.out.println(menuItems.indexOf(menuItem) + "-" + menuItem.toString());
            }
            System.out.print("input number:");
            Scanner reader = new Scanner(System.in);
            int optionNumber = reader.nextInt();
            if(optionNumber < menuItems.size() && optionNumber >=0)
                return optionNumber;
        }
    }

    public void addMenuItem(ListBooksMenuItem menuItem) {
        menuItems.add(menuItems.size(), menuItem);
    }
}
