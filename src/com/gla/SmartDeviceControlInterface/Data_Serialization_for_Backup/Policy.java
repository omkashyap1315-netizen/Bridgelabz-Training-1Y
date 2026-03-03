package com.gla.SmartDeviceControlInterface.Data_Serialization_for_Backup;

public class Policy implements BackupSerializable {

    private String policyNumber;

    public Policy(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }
}
