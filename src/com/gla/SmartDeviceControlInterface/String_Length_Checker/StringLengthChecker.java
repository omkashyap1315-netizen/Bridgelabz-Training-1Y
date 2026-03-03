package com.gla.SmartDeviceControlInterface.String_Length_Checker;

import java.util.function.Function;

public class StringLengthChecker {

    public static void main(String[] args) {

        String message = "This is a sample message for checking length.";
        int limit = 50;

        // Function to calculate length
        Function<String, Integer> getLength = str -> str.length();

        int messageLength = getLength.apply(message);

        if (messageLength > limit) {
            System.out.println("⚠ Message exceeds character limit!");
        } else {
            System.out.println("Message is within the limit.");
        }

        System.out.println("Length: " + messageLength);
    }
}
