package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Thoughtworks on 5/31/15.
 */
public class Menu {
    private List<MenuItem> menuItems = new ArrayList<MenuItem>();

    public MenuItem showMenu() {
        System.out.println("please input you choose number");
        for (MenuItem menuItem : menuItems) {
            System.out.println(menuItems.indexOf(menuItem) + "-" + menuItem.toString());
        }
        System.out.print("input number:");
        Scanner reader = new Scanner(System.in);
        int index = reader.nextInt();
        try {
            return menuItems.get(index);
        }catch (Exception e){
            return MenuItem.ERROR;
        }
    }

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public List<MenuItem> getItems() {
        return menuItems;
    }
}
