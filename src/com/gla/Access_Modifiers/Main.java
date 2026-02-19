package com.gla.Access_Modifiers;

public class Main {
    public static void main(String[] args) {

        PostgraduateStudent s = new PostgraduateStudent(1, "Rahul", 8.5);
        s.display();
        s.setCGPA(9.0);
        System.out.println("Updated CGPA: " + s.getCGPA());
        System.out.println();

        EBook b = new EBook("12345", "Java Programming", "James");
        b.display();
        b.setAuthor("Gosling");
        System.out.println("Updated Author: " + b.getAuthor());
        System.out.println();

        SavingsAccount acc = new SavingsAccount(1001, "Amit", 5000);
        acc.display();
        acc.setBalance(7000);
        System.out.println("Updated Balance: " + acc.getBalance());
        System.out.println();

        Manager m = new Manager(501, "IT", 60000);
        m.display();
        m.setSalary(75000);
        System.out.println("Updated Salary: " + m.getSalary());
    }
}

