package com.gla.string.JavaStringPracticeProblem;

import java.util.Scanner;

public class SubstringOccurrence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String text = sc.nextLine();

        System.out.print("Enter the substring: ");
        String sub = sc.nextLine();

        int count = countOccurrences(text, sub);

        System.out.println("Occurrences: " + count);
    }

    public static int countOccurrences(String text, String sub) {

        if (sub.length() == 0) return 0;

        int count = 0;

        for (int i = 0; i <= text.length() - sub.length(); i++) {
            if (text.substring(i, i + sub.length()).equals(sub)) {
                count++;
            }
        }

        return count;
    }
}
