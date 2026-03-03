package com.gla.EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Employee emp1 = new FullTimeEmployee(101, "Aman", 50000);
        emp1.assignDepartment("IT");

        Employee emp2 = new PartTimeEmployee(102, "Riya", 0, 80, 500);
        emp2.assignDepartment("HR");

        employees.add(emp1);
        employees.add(emp2);

        for (Employee e : employees) {
            e.displayDetails();
        }
    }
}