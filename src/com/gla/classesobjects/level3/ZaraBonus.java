package com.gla.classesobjects.level3;

public class ZaraBonus {

    // Method 1: generate salary and years of service
    public static double[][] getEmployeeData(int n) {

        double[][] data = new double[n][2];
        // [i][0] = salary
        // [i][1] = years of service

        for (int i = 0; i < n; i++) {

            // 5-digit salary (10000 – 99999)
            int salary = 10000 + (int)(Math.random() * 90000);

            // years of service (1 – 10 years)
            int years = 1 + (int)(Math.random() * 10);

            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    // Method 2: calculate bonus and new salary
    public static double[][] calculateBonus(double[][] data) {

        int n = data.length;
        double[][] result = new double[n][3];
        // [i][0] = old salary
        // [i][1] = bonus
        // [i][2] = new salary

        for (int i = 0; i < n; i++) {

            double salary = data[i][0];
            double years = data[i][1];
            double bonus;

            if (years > 5)
                bonus = salary * 0.05;   // 5% bonus
            else
                bonus = salary * 0.02;   // 2% bonus

            double newSalary = salary + bonus;

            result[i][0] = salary;
            result[i][1] = bonus;
            result[i][2] = newSalary;
        }
        return result;
    }

    // Method 3: display table and totals
    public static void showReport(double[][] data, double[][] result) {

        double totalOld = 0;
        double totalNew = 0;
        double totalBonus = 0;

        System.out.println("-------------------------------------------------------------");
        System.out.println("Emp\tOld Salary\tYears\tBonus\t\tNew Salary");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < data.length; i++) {

            System.out.printf("%d\t%.0f\t\t%.0f\t%.2f\t%.2f\n",
                    (i + 1),
                    data[i][0],
                    data[i][1],
                    result[i][1],
                    result[i][2]);

            totalOld += result[i][0];
            totalNew += result[i][2];
            totalBonus += result[i][1];
        }

        System.out.println("-------------------------------------------------------------");
        System.out.printf("Total Old Salary : %.2f\n", totalOld);
        System.out.printf("Total New Salary : %.2f\n", totalNew);
        System.out.printf("Total Bonus Paid : %.2f\n", totalBonus);
    }

    public static void main(String[] args) {

        int employees = 10;

        double[][] data = getEmployeeData(employees);
        double[][] result = calculateBonus(data);
        showReport(data, result);
    }
}
