package com.gla.classesobjects.level2;

import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check voting eligibility
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // invalid age
        }
        if (age >= 18) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker obj = new StudentVoteChecker();

        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            boolean result = obj.canStudentVote(ages[i]);

            if (result) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        sc.close();
    }
}


