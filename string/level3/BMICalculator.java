package com.gla.string.level3;

import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and status for a person
    static String[] calculateBMIStatus(double weightKg, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weightKg / (heightM * heightM);
        String status = "";

        if (bmi <= 18.4) status = "Underweight";
        else if (bmi <= 24.9) status = "Normal";
        else if (bmi <= 39.9) status = "Overweight";
        else status = "Obese";

        return new String[]{
                String.format("%.2f", heightCm),
                String.format("%.2f", weightKg),
                String.format("%.2f", bmi),
                status
        };
    }

    // Method to compute BMI and status for all persons
    static String[][] computeAllBMI(double[][] hw) {
        int n = hw.length;
        String[][] result = new String[n][4];

        for (int i = 0; i < n; i++) {
            result[i] = calculateBMIStatus(hw[i][1], hw[i][0]); // weight, height
        }

        return result;
    }

    // Method to display 2D array in tabular format
    static void displayBMI(String[][] data) {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" +
                    data[i][1] + "\t\t" +
                    data[i][2] + "\t\t" +
                    data[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10; // 10 members
        double[][] hw = new double[n][2]; // [height, weight]

        for (int i = 0; i < n; i++) {
            System.out.print("Enter height (cm) of person " + (i+1) + ": ");
            hw[i][0] = sc.nextDouble();
            System.out.print("Enter weight (kg) of person " + (i+1) + ": ");
            hw[i][1] = sc.nextDouble();
        }

        String[][] bmiData = computeAllBMI(hw);
        displayBMI(bmiData);

        sc.close();
    }
}
