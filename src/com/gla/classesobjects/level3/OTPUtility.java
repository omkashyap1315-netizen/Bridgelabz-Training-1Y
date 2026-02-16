package com.gla.classesobjects.level3;

public class OTPUtility {

    // a) generate 6 digit OTP
    static int generateOTP() {
        // generates number from 100000 to 999999
        int otp = (int)(Math.random() * 900000) + 100000;
        return otp;
    }

    // c) check uniqueness
    static boolean checkUnique(int[] arr) {

        // compare every element with first element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
                return true;   // at least one OTP is different
            }
        }
        return false; // all OTPs same
    }

    // MAIN METHOD
    public static void main(String[] args) {

        int[] otpArray = new int[10];

        // b) generate 10 OTPs and store
        System.out.println("Generated OTPs:");
        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
            System.out.println(otpArray[i]);
        }

        // validate
        if (checkUnique(otpArray))
            System.out.println("OTPs are UNIQUE (not all same)");
        else
            System.out.println("All OTPs are SAME (Invalid)");
    }
}
