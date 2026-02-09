package com.gla.string.level1;

import java.util.Scanner;

public class CompareStrings {

    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {

            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (c1 != c2) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        boolean resultCharAt = compareStrings(str1, str2);

        boolean resultEquals = str1.equals(str2);

        System.out.println();
        System.out.println("Using charAt(): " + resultCharAt);
        System.out.println("Using equals(): " + resultEquals);

        if (resultCharAt == resultEquals) {
            System.out.println("Both methods give SAME result.");
        } else {
            System.out.println("Both methods give DIFFERENT result.");
        }

        sc.close();
    }
}
