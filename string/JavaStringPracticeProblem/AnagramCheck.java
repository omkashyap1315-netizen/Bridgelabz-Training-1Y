package com.gla.string.JavaStringPracticeProblem;

import java.util.Scanner;

public class AnagramCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        if (areAnagrams(s1, s2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    public static boolean areAnagrams(String a, String b) {

        a = a.replaceAll("\\s+", "").toLowerCase();
        b = b.replaceAll("\\s+", "").toLowerCase();

        if (a.length() != b.length())
            return false;

        int[] count = new int[256];

        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i)]++;
            count[b.charAt(i)]--;
        }

        for (int value : count) {
            if (value != 0)
                return false;
        }

        return true;
    }
}
