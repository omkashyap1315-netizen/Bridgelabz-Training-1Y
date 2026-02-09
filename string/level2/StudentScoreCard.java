package com.gla.string.level2;

import java.util.Scanner;

public class StudentScoreCard {

    static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = 40 + (int)(Math.random() * 61); // Physics 40-100
            scores[i][1] = 40 + (int)(Math.random() * 61); // Chemistry 40-100
            scores[i][2] = 40 + (int)(Math.random() * 61); // Math 40-100
        }
        return scores;
    }

    static double[][] calculatePercentage(int[][] scores) {
        int n = scores.length;
        double[][] result = new double[n][3]; // total, average, percentage
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;
            result[i][0] = Math.round(total * 100.0) / 100.0;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return result;
    }

    static String[] calculateGrade(double[][] percentages) {
        int n = percentages.length;
        String[] grades = new String[n];
        for (int i = 0; i < n; i++) {
            double percent = percentages[i][2];
            if (percent >= 80) grades[i] = "A";
            else if (percent >= 70) grades[i] = "B";
            else if (percent >= 60) grades[i] = "C";
            else if (percent >= 50) grades[i] = "D";
            else if (percent >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    static void displayScoreCard(int[][] scores, double[][] calc, String[] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i+1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t\t" +
                    scores[i][2] + "\t" +
                    (int)calc[i][0] + "\t" +
                    calc[i][1] + "\t" +
                    calc[i][2] + "\t\t" +
                    grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        double[][] calc = calculatePercentage(scores);
        String[] grades = calculateGrade(calc);

        displayScoreCard(scores, calc, grades);
        sc.close();
    }
}
