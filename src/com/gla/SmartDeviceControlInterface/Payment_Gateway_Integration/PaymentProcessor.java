package com.gla.SmartDeviceControlInterface.Payment_Gateway_Integration;

// PaymentProcessor.java
public interface PaymentProcessor {

    void processPayment(double amount);

    // New feature added later
    default void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " processed using default method.");
    }
}
