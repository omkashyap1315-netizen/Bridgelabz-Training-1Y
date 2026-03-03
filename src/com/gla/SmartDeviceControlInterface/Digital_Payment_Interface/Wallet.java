package com.gla.SmartDeviceControlInterface.Digital_Payment_Interface;

public class Wallet implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Wallet.");
    }
}
