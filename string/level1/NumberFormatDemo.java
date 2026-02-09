package com.gla.string.level1;

import java.util.Scanner;

public class NumberFormatDemo {

    static void generateException(String text) {

        int num = Integer.parseInt(text);
        System.out.println("Number is: " + num);
    }

    static void handleException(String text) {

        try {
            int num = Integer.parseInt(text);
            System.out.println("Number is: " + num);
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value: ");
        String text = sc.next();

        System.out.println("Generating Exception...");
        generateException(text);

        System.out.println("Handling Exception...");
        handleException(text);

        sc.close();
    }
}
