package com.gla.SmartDeviceControlInterface.Payment_Gateway_Integration;
public class RazorpayProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing ₹" + amount + " via Razorpay.");
    }

    // No refund() implemented — uses default
}
