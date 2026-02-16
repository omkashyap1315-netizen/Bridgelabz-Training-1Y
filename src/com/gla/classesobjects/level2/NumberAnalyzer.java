package com.gla.classesobjects.level2;

import java.util.Scanner;

public class NumberAnalyzer {

    // Method to check positive or negative
    public static int isPositive(int num) {
        if (num >= 0)
            return 1;      // positive
        else
            return -1;     // negative
    }

    // Method to check even or odd
    public static int isEven(int num) {
        if (num % 2 == 0)
            return 1;      // even
        else
            return 0;      // odd
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2)
            return 1;
        else if (number1 == number2)
            return 0;
        else
            return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        // Taking input
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("\nResult:");

        // Checking each number
        for (int i = 0; i < arr.length; i++) {

            if (isPositive(arr[i]) == 1) {
                System.out.print(arr[i] + " is Positive and ");

                if (isEven(arr[i]) == 1)
                    System.out.println("Even");
                else
                    System.out.println("Odd");
            }
            else {
                System.out.println(arr[i] + " is Negative");
            }
        }

        // Comparing first and last element
        int result = compare(arr[0], arr[arr.length - 1]);

        System.out.println("\nComparison between first and last element:");

        if (result == 1)
            System.out.println("First element is Greater than Last element");
        else if (result == 0)
            System.out.println("First element is Equal to Last element");
        else
            System.out.println("First element is Less than Last element");

        sc.close();
    }
}

