package com.gla.SmartDeviceControlInterface.Payment_Gateway_Integration;

public class PaymentApp {

    public static void main(String[] args) {

        PaymentProcessor razorpay = new RazorpayProcessor();
        PaymentProcessor stripe = new StripeProcessor();

        razorpay.processPayment(2000);
        razorpay.refund(500);   // Uses default method

        stripe.processPayment(3000);
        stripe.refund(1000);    // Uses overridden method
    }
}
