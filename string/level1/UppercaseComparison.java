package com.gla.string.level1;

import java.util.Scanner;

public class UppercaseComparison {

    static String convertToUpper(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }

            result = result + ch;
        }

        return result;
    }

    static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String userUpper = convertToUpper(text);

        String builtInUpper = text.toUpperCase();

        boolean result = compareStrings(userUpper, builtInUpper);

        System.out.println("Uppercase using charAt(): " + userUpper);
        System.out.println("Uppercase using toUpperCase(): " + builtInUpper);
        System.out.println("Are both results same? " + result);

        sc.close();
    }
}
