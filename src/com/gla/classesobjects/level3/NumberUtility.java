
package com.gla.classesobjects.level3;

import java.util.Scanner;

public class NumberUtility {

    // Perfect Number
    static void checkPerfect(int n) {
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                sum += i;
        }

        if (sum == n)
            System.out.println("Perfect Number");
        else
            System.out.println("Not Perfect Number");
    }

    // Abundant Number
    static void checkAbundant(int n) {
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                sum += i;
        }

        if (sum > n)
            System.out.println("Abundant Number");
        else
            System.out.println("Not Abundant Number");
    }

    // Deficient Number
    static void checkDeficient(int n) {
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                sum += i;
        }

        if (sum < n)
            System.out.println("Deficient Number");
        else
            System.out.println("Not Deficient Number");
    }

    // Strong Number
    static void checkStrong(int n) {
        int temp = n;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;

            int fact = 1;
            for (int i = 1; i <= digit; i++)
                fact *= i;

            sum += fact;
            temp /= 10;
        }

        if (sum == n)
            System.out.println("Strong Number");
        else
            System.out.println("Not Strong Number");
    }

    // Main method (calls all static methods)
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        checkPerfect(num);
        checkAbundant(num);
        checkDeficient(num);
        checkStrong(num);

        sc.close();
    }
}
