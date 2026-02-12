package com.gla.string.JavaStringPracticeProblem;

import java.util.Scanner;

public class LexicographicalCompare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        int result = compareStrings(s1, s2);

        if (result == 0)
            System.out.println("Both strings are equal.");
        else if (result < 0)
            System.out.println("First string comes before second string.");
        else
            System.out.println("First string comes after second string.");
    }

    public static int compareStrings(String a, String b) {

        int minLength = Math.min(a.length(), b.length());

        for (int i = 0; i < minLength; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return a.charAt(i) - b.charAt(i);
            }
        }

        if (a.length() == b.length())
            return 0;
        else
            return a.length() - b.length();
    }
}
