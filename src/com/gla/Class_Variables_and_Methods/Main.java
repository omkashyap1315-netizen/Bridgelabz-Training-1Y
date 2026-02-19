package com.gla.Class_Variables_and_Methods;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product("Pen", 10);
        Product p2 = new Product("Notebook", 50);
        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();
        System.out.println();

        Course c1 = new Course("Java", 3, 5000);
        Course c2 = new Course("Python", 2, 4000);
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        Course.updateInstituteName("GLA University");
        c1.displayCourseDetails();
        System.out.println();

        Vehicle v1 = new Vehicle("Rahul", "Bike");
        Vehicle v2 = new Vehicle("Amit", "Car");
        v1.displayVehicleDetails();
        Vehicle.updateRegistrationFee(7000);
        v2.displayVehicleDetails();
    }
}

