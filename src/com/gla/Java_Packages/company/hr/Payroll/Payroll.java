package com.gla.Java_Packages.company.hr.Payroll;

import com.company.hr.Employee;

public class Payroll {

    public void calculateBonus(Employee e) {
        double bonus = e.getSalary() * 0.10;
        e.setSalary(e.getSalary() + bonus);
    }
}