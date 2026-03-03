package com.gla.SmartDeviceControlInterface.Data_Serialization_for_Backup;

public class BackupProcessor {

    public static void processBackup(Object obj) {

        if (obj instanceof BackupSerializable) {
            System.out.println("Backing up object: " + obj.getClass().getSimpleName());
        } else {
            System.out.println("This object is not eligible for backup.");
        }
    }
}
