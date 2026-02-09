package com.gla.string.level1;

import java.util.Scanner;

public class StringIndexDemo {

    static void generateException(String text) {

        System.out.println("Character is: " + text.charAt(text.length()));
    }

    static void handleException(String text) {

        try {
            System.out.println("Character is: " + text.charAt(text.length()));
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.println("\nGenerating Exception...");
        generateException(text);

        System.out.println("\nHandling Exception...");
        handleException(text);

        sc.close();
    }
}
