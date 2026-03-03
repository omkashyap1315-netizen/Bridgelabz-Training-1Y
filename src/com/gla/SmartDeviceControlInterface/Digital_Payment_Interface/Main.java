package com.gla.SmartDeviceControlInterface.Digital_Payment_Interface;

public class Main {
    public static void main(String[] args) {

        PaymentMethod upi = new UPI();
        PaymentMethod card = new CreditCard();
        PaymentMethod wallet = new Wallet();

        upi.pay(1000);
        card.pay(2500);
        wallet.pay(500);
    }
}
