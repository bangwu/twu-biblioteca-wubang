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
        System.out.println("please input you choose number");
        for (MenuItem menuItem : menuItems) {
            System.out.println(menuItems.indexOf(menuItem) + "-" + menuItem.toString());
        }
        System.out.print("input number:");
        Scanner reader = new Scanner(System.in);
        return reader.nextInt();
    }

    public void addMenuItem(ListBooksMenuItem menuItem) {
        menuItems.add(menuItems.size(), menuItem);
    }
}
