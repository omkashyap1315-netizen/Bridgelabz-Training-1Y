package com.gla.classesobjects.level3;

import java.util.Scanner;

public class StudentScorecard {

    // Method 1: Generate random marks (2-digit)
    public static int[][] generateMarks(int n) {

        int[][] marks = new int[n][3]; // 3 subjects PCM

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = 10 + (int)(Math.random() * 90); // 10–99 marks
            }
        }
        return marks;
    }

    // Method 2: Calculate total, average, percentage
    public static double[][] calculateResult(int[][] marks) {

        int n = marks.length;
        double[][] result = new double[n][3]; // total, average, percentage

        for (int i = 0; i < n; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            // round to 2 digits
            avg = Math.round(avg * 100.0) / 100.0;
            percent = Math.round(percent * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = avg;
            result[i][2] = percent;
        }

        return result;
    }

    // Method 3: Find Grade
    public static String findGrade(double percent) {

        if (percent >= 80) return "A";
        else if (percent >= 70) return "B";
        else if (percent >= 60) return "C";
        else if (percent >= 50) return "D";
        else if (percent >= 40) return "E";
        else return "R";
    }

    // Method 4: Display Scorecard
    public static void display(int[][] marks, double[][] result) {

        System.out.println("\nID\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {

            String grade = findGrade(result[i][2]);

            System.out.println((i+1) + "\t" +
                    marks[i][0] + "\t" +
                    marks[i][1] + "\t" +
                    marks[i][2] + "\t" +
                    (int)result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2] + "\t" +
                    grade);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = generateMarks(n);
        double[][] result = calculateResult(marks);

        display(marks, result);
    }
}
