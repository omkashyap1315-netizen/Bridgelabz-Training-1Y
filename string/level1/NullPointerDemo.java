package com.gla.string.level1;

import java.util.Scanner;   // import line

public class NullPointerDemo {

    // Method to generate NullPointerException
    static void generateException() {

        String text = null;     // reference variable is null

        // calling String method on null -> Exception
        int length = text.length();

        System.out.println("Length is: " + length);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  // just to use import

        System.out.println("Press Enter to generate NullPointerException...");
        sc.nextLine();

        // calling method
        generateException();

        sc.close();
    }
}
