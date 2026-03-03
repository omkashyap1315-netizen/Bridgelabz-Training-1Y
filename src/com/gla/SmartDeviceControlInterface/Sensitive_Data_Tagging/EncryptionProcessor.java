package com.gla.SmartDeviceControlInterface.Sensitive_Data_Tagging;

public class EncryptionProcessor {

    public static void process(Object obj) {

        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting sensitive data...");
            System.out.println("Encrypted: ******");
        } else {
            System.out.println("No encryption required.");
        }
    }
}
