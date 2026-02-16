
package com.gla.classesobjects.level3;

import java.util.Scanner;

public class FactorUtility {

    // a) find factors and return array
    static int[] getFactors(int n) {

        int count = 0;

        // first loop -> count factors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }

        // create array of required size
        int[] factors = new int[count];

        // second loop -> store factors
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // b) greatest factor using array
    static int greatestFactor(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    // c) sum of factors
    static int sumFactors(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        return sum;
    }

    // d) product of factors
    static int productFactors(int[] arr) {
        int product = 1;

        for (int i = 0; i < arr.length; i++)
            product *= arr[i];

        return product;
    }

    // e) product of cube of factors
    static double cubeProduct(int[] arr) {
        double product = 1;

        for (int i = 0; i < arr.length; i++) {
            product *= Math.pow(arr[i], 3);
        }
        return product;
    }

    // MAIN
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = getFactors(num);

        // printing factors
        System.out.print("Factors: ");
        for (int i = 0; i < factors.length; i++)
            System.out.print(factors[i] + " ");

        System.out.println();

        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumFactors(factors));
        System.out.println("Product of Factors: " + productFactors(factors));
        System.out.println("Product of Cube of Factors: " + cubeProduct(factors));

        sc.close();
    }
}

