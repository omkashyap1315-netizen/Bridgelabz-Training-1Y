package com.gla.classesobjects.level3;

import java.util.Scanner;

public class NumberChecker {

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

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0)
                return true;
        }
        return false;
    }

    public static boolean isArmstrong(int number, int[] digits) {
        int power = digits.length;
        int sum = 0;

        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], power);
        }

        return sum == Math.abs(number);
    }

    public static int[] largestSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        return new int[]{largest, secondLargest};
    }

    public static int[] smallestSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            } else if (digits[i] < secondSmallest && digits[i] != smallest) {
                secondSmallest = digits[i];
            }
        }
        return new int[]{smallest, secondSmallest};
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

        if (isDuckNumber(digits))
            System.out.println("Duck Number");
        else
            System.out.println("Not a Duck Number");

        if (isArmstrong(number, digits))
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");

        int[] largest = largestSecondLargest(digits);
        System.out.println("Largest Digit = " + largest[0]);
        System.out.println("Second Largest Digit = " + largest[1]);

        int[] smallest = smallestSecondSmallest(digits);
        System.out.println("Smallest Digit = " + smallest[0]);
        System.out.println("Second Smallest Digit = " + smallest[1]);

        sc.close();
    }
}

