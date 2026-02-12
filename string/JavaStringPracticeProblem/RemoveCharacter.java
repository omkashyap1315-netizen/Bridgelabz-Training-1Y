package com.gla.string.JavaStringPracticeProblem;

import java.util.Scanner;

public class RemoveCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.print("Enter character to remove: ");
        char ch = sc.nextLine().charAt(0);

        String result = removeCharacter(text, ch);

        System.out.println("Modified String: " + result);
    }

    public static String removeCharacter(String str, char target) {

        StringBuilder modified = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != target) {
                modified.append(str.charAt(i));
            }
        }

        return modified.toString();
    }
}

