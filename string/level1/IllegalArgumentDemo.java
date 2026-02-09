package com.gla.string.level1;

import java.util.Scanner;

public class IllegalArgumentDemo {

    static void generateException(String text) {

        String result = text.substring(5, 2);
        System.out.println(result);
    }

    static void handleException(String text) {

        try {
            String result = text.substring(5, 2);
            System.out.println(result);
        }
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.println("Generating Exception...");
        generateException(text);

        System.out.println("Handling Exception...");
        handleException(text);

        sc.close();
    }
}
