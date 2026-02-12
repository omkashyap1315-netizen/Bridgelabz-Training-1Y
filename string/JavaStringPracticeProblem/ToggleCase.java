package com.gla.string.JavaStringPracticeProblem;

import java.util.Scanner;

public class ToggleCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String result = toggleCase(text);

        System.out.println("Toggled string: " + result);
    }

    public static String toggleCase(String str) {

        StringBuilder toggled = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch))
                toggled.append(Character.toLowerCase(ch));
            else if (Character.isLowerCase(ch))
                toggled.append(Character.toUpperCase(ch));
            else
                toggled.append(ch);
        }

        return toggled.toString();
    }
}
