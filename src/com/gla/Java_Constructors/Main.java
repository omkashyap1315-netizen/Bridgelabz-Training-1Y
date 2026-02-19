package com.gla.Java_Constructors;

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book();
        Book b2 = new Book("Java", "James Gosling", 500);
        b1.display();
        b2.display();
        System.out.println();

        Circle c1 = new Circle();
        Circle c2 = new Circle(5);
        c1.display();
        c2.display();
        System.out.println();

        Person p1 = new Person("Rahul", 20);
        Person p2 = new Person(p1);
        p1.display();
        p2.display();
        System.out.println();

        HotelBooking h1 = new HotelBooking();
        HotelBooking h2 = new HotelBooking("Amit", "Deluxe", 3);
        HotelBooking h3 = new HotelBooking(h2);
        h1.display();
        h2.display();
        h3.display();
        System.out.println();

        LibraryBook lb = new LibraryBook("C++", "Bjarne", 600, true);
        lb.display();
        lb.borrowBook();
        lb.display();
        System.out.println();

        CarRental cr = new CarRental("Rohan", "Swift", 4);
        cr.display();
    }
}

