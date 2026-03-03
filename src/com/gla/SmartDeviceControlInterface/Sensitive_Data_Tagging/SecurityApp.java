package com.gla.SmartDeviceControlInterface.Sensitive_Data_Tagging;
public class SecurityApp {

    public static void main(String[] args) {

        UserCredentials credentials = new UserCredentials("rahul", "pass123");
        InsurancePolicy policy = new InsurancePolicy("POL789", 15000);
        PublicAnnouncement announcement = new PublicAnnouncement();

        EncryptionProcessor.process(credentials);
        EncryptionProcessor.process(policy);
        EncryptionProcessor.process(announcement);
    }

    private static class PublicAnnouncement {
    }
}
