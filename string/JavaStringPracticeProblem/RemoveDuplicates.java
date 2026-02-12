package com.gla.string.JavaStringPracticeProblem;

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String result = removeDuplicateCharacters(text);

        System.out.println("Modified string: " + result);
    }

    public static String removeDuplicateCharacters(String str) {

        StringBuilder unique = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (unique.indexOf(String.valueOf(ch)) == -1) {
                unique.append(ch);
            }
        }

        return unique.toString();
    }
}
