package com.gla.Java_Packages.company.hr.main;

import com.company.hr.Employee;          // Single-type import
import com.company.payroll.*;            // On-demand import

public class MainApp {
    public static void main(String[] args) {

        Employee emp = new Employee(101, "Aman", "IT", 50000);
        Payroll payroll = new Payroll();

        System.out.println("Before Bonus:");
        emp.displayEmployee();
        System.out.println();

        payroll.calculateBonus(emp);

        System.out.println("After Bonus:");
        emp.displayEmployee();
    }
}
