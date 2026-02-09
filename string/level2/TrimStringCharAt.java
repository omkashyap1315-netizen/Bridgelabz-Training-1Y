package com.gla.string.level2;

import java.util.Scanner;

public class TrimStringCharAt {

    static int[] findTrimIndices(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    static String substringCharAt(String text, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result = result + text.charAt(i);
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

        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        int[] indices = findTrimIndices(text);

        String trimmedCharAt = substringCharAt(text, indices[0], indices[1]);

        String trimmedBuiltIn = text.trim();

        System.out.println("Trimmed using charAt(): '" + trimmedCharAt + "'");
        System.out.println("Trimmed using trim():     '" + trimmedBuiltIn + "'");

        boolean isSame = compareStrings(trimmedCharAt, trimmedBuiltIn);

        System.out.println("Are both results same? " + isSame);

        sc.close();
    }
}
