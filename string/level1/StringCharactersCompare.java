package com.gla.string.level1;

import java.util.Scanner;

public class StringCharactersCompare {

    public static char[] getCharacters(String text) {

        char[] arr = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }

        return arr;
    }

    public static boolean compareArrays(char[] a, char[] b) {

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String text = sc.next();

        char[] userArray = getCharacters(text);

        char[] builtInArray = text.toCharArray();

        boolean result = compareArrays(userArray, builtInArray);

        System.out.println("\nCharacters using user-defined method:");
        for (int i = 0; i < userArray.length; i++) {
            System.out.print(userArray[i] + " ");
        }

        System.out.println("\n\nCharacters using toCharArray():");
        for (int i = 0; i < builtInArray.length; i++) {
            System.out.print(builtInArray[i] + " ");
        }

        System.out.println("\n\nAre both arrays equal? " + result);

        sc.close();
    }
}
