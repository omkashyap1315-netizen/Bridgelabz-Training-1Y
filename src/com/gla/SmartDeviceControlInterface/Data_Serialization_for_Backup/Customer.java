package com.gla.SmartDeviceControlInterface.Data_Serialization_for_Backup;

public class Customer implements BackupSerializable {

    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getDetails() {
        return name + " - " + email;
    }
}
