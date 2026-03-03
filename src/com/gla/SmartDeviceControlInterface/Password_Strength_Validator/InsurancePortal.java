package com.gla.SmartDeviceControlInterface.Password_Strength_Validator;

public class InsurancePortal {

    public static void main(String[] args) {

        String password = "Secure@123";

        boolean isValid = SecurityUtils.isStrongPassword(password);

        if (isValid) {
            System.out.println("Password is strong ✅");
        } else {
            System.out.println("Password is weak ❌");
        }
    }
}