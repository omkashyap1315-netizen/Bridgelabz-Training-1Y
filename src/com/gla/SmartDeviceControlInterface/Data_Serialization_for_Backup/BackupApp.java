package com.gla.SmartDeviceControlInterface.Data_Serialization_for_Backup;

public class BackupApp {

    public static void main(String[] args) {

        Customer customer = new Customer("Rahul", "rahul@email.com");
        Policy policy = new Policy("POL12345");
        TemporarySession session = new TemporarySession();

        BackupProcessor.processBackup(customer);
        BackupProcessor.processBackup(policy);
        BackupProcessor.processBackup(session);
    }

    private static class TemporarySession {
    }
}
