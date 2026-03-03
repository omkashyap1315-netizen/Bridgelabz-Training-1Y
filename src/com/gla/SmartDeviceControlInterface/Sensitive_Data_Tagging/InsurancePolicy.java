package com.gla.SmartDeviceControlInterface.Sensitive_Data_Tagging;

public class InsurancePolicy implements SensitiveData {

    private String policyNumber;
    private double premium;

    public InsurancePolicy(String policyNumber, double premium) {
        this.policyNumber = policyNumber;
        this.premium = premium;
    }

    public String getData() {
        return policyNumber + " - " + premium;
    }
}
