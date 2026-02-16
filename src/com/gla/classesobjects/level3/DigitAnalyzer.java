package com.gla.classesobjects.level3;

import java.util.Scanner;

public class DigitAnalyzer {

    public static int countDigits(int number) {
        number = Math.abs(number);
        if (number == 0) return 1;

        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static int[] storeDigits(int number) {
        int n = Math.abs(number);
        int count = countDigits(n);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    public static int[] reverseArray(int[] digits) {
        int[] rev = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            rev[i] = digits[digits.length - 1 - i];
        }
        return rev;
    }

    public static boolean compareArrays(int[] a, int[] b) {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }

    public static boolean isPalindrome(int number) {
        int[] original = storeDigits(number);
        int[] reversed = reverseArray(original);
        return compareArrays(original, reversed);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int digitCount = countDigits(number);
        int[] digits = storeDigits(number);

        System.out.println("Number of digits: " + digitCount);

        System.out.print("Digits: ");
        for (int d : digits)
            System.out.print(d + " ");
        System.out.println();

        int[] reversed = reverseArray(digits);

        System.out.print("Reversed digits: ");
        for (int d : reversed)
            System.out.print(d + " ");
        System.out.println();

        if (compareArrays(digits, reversed))
            System.out.println("Arrays are Equal");
        else
            System.out.println("Arrays are Not Equal");

        if (isPalindrome(number))
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");

        if (isDuckNumber(digits))
            System.out.println("Duck Number");
        else
            System.out.println("Not a Duck Number");

        sc.close();
    }
}
