package com.gla.classesobjects.level3;

import java.util.Scanner;

public class DigitUtility {

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

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], 2);
        }
        return sum;
    }

    public static boolean isHarshad(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        if (sum == 0) return false;
        return number % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]][1]++;
        }
        return freq;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = countDigits(number);
        int[] digits = storeDigits(number);

        System.out.println("Number of digits: " + count);

        System.out.print("Digits: ");
        for (int d : digits)
            System.out.print(d + " ");
        System.out.println();

        int sum = sumOfDigits(digits);
        System.out.println("Sum of digits = " + sum);

        int squareSum = sumOfSquares(digits);
        System.out.println("Sum of squares of digits = " + squareSum);

        if (isHarshad(number, digits))
            System.out.println("Harshad Number");
        else
            System.out.println("Not a Harshad Number");

        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0)
                System.out.println("Digit " + frequency[i][0] + " -> " + frequency[i][1] + " times");
        }

        sc.close();
    }
}

