package com.gla.Using_Objects_and_Classes.Level1;


 class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Rahul", 101, 45000);
        e1.displayDetails();

        System.out.println();

        Circle c1 = new Circle(5);
        c1.display();

        System.out.println();

        Item i1 = new Item(201, "Pen", 10);
        i1.display(5);

        System.out.println();

        MobilePhone m1 = new MobilePhone("Samsung", "Galaxy S21", 69999);
        m1.displayDetails();
    }
}

