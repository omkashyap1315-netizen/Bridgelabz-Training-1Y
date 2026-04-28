package com.gla.functionalInterface;

public class Main {
    static void main(String[] args) {
//        Employee obj = new SoftwareEngineer();
//        System.out.println(obj.getName());
        Employee obj = () -> "Software Engineer";
        System.out.println(obj.getName());
        Employee obj2 = () -> "Doctor";
        System.out.println(obj2.getName());
    }
}
