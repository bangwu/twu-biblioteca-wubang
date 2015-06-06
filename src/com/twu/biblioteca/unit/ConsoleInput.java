package com.twu.biblioteca.unit;

import java.util.Scanner;

/**
 * Created by Thoughtworks on 6/6/15.
 */
public class ConsoleInput {
    private static Scanner reader = new Scanner(System.in);
    public static String getString(){
        return reader.nextLine();
    }
}
