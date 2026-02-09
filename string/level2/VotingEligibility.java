package com.gla.string.level2;

import java.util.Scanner;

public class VotingEligibility {

    static int[] getAges(int n) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        return ages;
    }

    static String[][] checkVoting(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            int age = ages[i];
            result[i][0] = String.valueOf(age);

            if (age < 0) {
                result[i][1] = "Cannot Vote";
            } else if (age >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }

        return result;
    }

    static void displayTable(String[][] data) {

        System.out.println("\nAge\tVoting Eligibility");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        int n = 10;

        int[] ages = getAges(n);

        String[][] table = checkVoting(ages);

        displayTable(table);
    }
}
