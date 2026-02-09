package com.gla.string.level1;

import java.util.Scanner;

public class ArrayIndexDemo {

    static void generateException(String[] names) {

        System.out.println(names[names.length]);
    }

    static void handleException(String[] names) {

        try {
            System.out.println(names[names.length]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();

        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }

        System.out.println("Generating Exception...");
        generateException(names);

        System.out.println("Handling Exception...");
        handleException(names);

        sc.close();
    }
}
