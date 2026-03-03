package com.gla.SmartDeviceControlInterface.Digital_Payment_Interface;

public class CreditCard implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}
