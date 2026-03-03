package com.gla.SmartDeviceControlInterface.Cloning_Prototype_Objects;

public class Vehicle implements Cloneable {

    private String model;
    private double price;

    public Vehicle(String model, double price) {
        this.model = model;
        this.price = price;
    }

    // Override clone() method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }

    public void display() {
        System.out.println("Model: " + model + ", Price: " + price);
    }
}
