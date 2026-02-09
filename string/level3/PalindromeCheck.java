package com.gla.string.level3;

import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Iterative method using start and end indexes
    public static boolean isPalindromeIterative(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method
    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    // Logic 3: Using reverse character array
    public static boolean isPalindromeReverseArray(String str) {
        int len = str.length();
        char[] original = str.toCharArray();
        char[] reverse = new char[len];

        for (int i = 0; i < len; i++) {
            reverse[i] = str.charAt(len - 1 - i);
        }

        for (int i = 0; i < len; i++) {
            if (original[i] != reverse[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        System.out.println("Palindrome check using iterative method: " +
                (isPalindromeIterative(input) ? "Yes" : "No"));

        System.out.println("Palindrome check using recursive method: " +
                (isPalindromeRecursive(input, 0, input.length() - 1) ? "Yes" : "No"));

        System.out.println("Palindrome check using reverse array method: " +
                (isPalindromeReverseArray(input) ? "Yes" : "No"));
    }
}
