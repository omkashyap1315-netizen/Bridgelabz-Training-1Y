package JavaArrays.Level2;

import java.util.Scanner;

public class ZaraEmployeeBonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int employees = 10;

        // b. Arrays for salary and years of service
        double[] salary = new double[employees];
        double[] yearsOfService = new double[employees];

        // c. Arrays for bonus and new salary
        double[] bonus = new double[employees];
        double[] newSalary = new double[employees];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // d. Take input with validation
        for (int i = 0; i < employees; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Salary: ");
            double sal = sc.nextDouble();

            System.out.print("Years of Service: ");
            double yrs = sc.nextDouble();

            if (sal <= 0 || yrs < 0) {
                System.out.println("Invalid input. Please enter again.");
                i--; // decrement index to retry
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = yrs;
        }

        // e. Calculate bonus and new salary
        for (int i = 0; i < employees; i++) {

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // f. Print results
        System.out.println("\n----- Zara Bonus Summary -----");
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Paid: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();
    }
}
