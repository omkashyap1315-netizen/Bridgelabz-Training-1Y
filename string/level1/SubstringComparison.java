package com.gla.string.level1;

import java.util.Scanner;

public class SubstringComparison {

    public static String makeSubstring(String text, int start, int end) {

        String sub = "";

        for (int i = start; i < end; i++) {
            sub = sub + text.charAt(i);
        }

        return sub;
    }

    public static boolean compareStrings(String s1, String s2) {

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

        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String manualSubstring = makeSubstring(text, start, end);

        String builtinSubstring = text.substring(start, end);

        boolean result = compareStrings(manualSubstring, builtinSubstring);

        System.out.println("\nSubstring using charAt(): " + manualSubstring);
        System.out.println("Substring using substring(): " + builtinSubstring);

        if (result) {
            System.out.println("Both substrings are SAME.");
        } else {
            System.out.println("Both substrings are DIFFERENT.");
        }

        sc.close();
    }
}
