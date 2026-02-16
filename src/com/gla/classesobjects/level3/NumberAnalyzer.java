package com.gla.classesobjects.level3;

import java.util.Scanner;

public class NumberAnalyzer {

    // Prime
    static void verifyPrime(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }

        if (count == 2)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
    }

    // Neon
    static void verifyNeon(int n) {
        int square = n * n;
        int sum = 0;

        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }

        if (sum == n)
            System.out.println("Neon Number");
        else
            System.out.println("Not Neon Number");
    }

    // Spy
    static void verifySpy(int n) {
        int sum = 0, product = 1;

        while (n > 0) {
            int d = n % 10;
            sum += d;
            product *= d;
            n /= 10;
        }

        if (sum == product)
            System.out.println("Spy Number");
        else
            System.out.println("Not Spy Number");
    }

    // Automorphic
    static void verifyAutomorphic(int n) {
        int square = n * n;
        int temp = n;

        while (temp > 0) {
            if (temp % 10 != square % 10) {
                System.out.println("Not Automorphic Number");
                return;
            }
            temp /= 10;
            square /= 10;
        }

        System.out.println("Automorphic Number");
    }

    // Buzz
    static void verifyBuzz(int n) {
        if (n % 7 == 0 || n % 10 == 7)
            System.out.println("Buzz Number");
        else
            System.out.println("Not Buzz Number");
    }

    // MAIN METHOD (VERY IMPORTANT)
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        verifyPrime(num);
        verifyNeon(num);
        verifySpy(num);
        verifyAutomorphic(num);
        verifyBuzz(num);

        sc.close();
    }
}
