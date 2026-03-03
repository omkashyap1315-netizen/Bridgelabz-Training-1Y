package com.gla.EmployeeManagementSystem;

public abstract class Employee implements Department {

    private int employeeId;
    private String name;
    private double baseSalary;
    private String departmentName;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentDetails() {
        return departmentName;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + departmentName);
        System.out.println("Salary: " + calculateSalary());
        System.out.println("---------------------------");
    }
}
