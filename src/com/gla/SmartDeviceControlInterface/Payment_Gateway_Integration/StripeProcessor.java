package com.gla.SmartDeviceControlInterface.Payment_Gateway_Integration;

public class StripeProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing ₹" + amount + " via Stripe.");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " processed via Stripe API.");
    }
}
