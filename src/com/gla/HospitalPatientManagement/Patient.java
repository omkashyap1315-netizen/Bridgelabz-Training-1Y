package com.gla.HospitalPatientManagement;

import java.util.ArrayList;
import java.util.List;

public abstract class Patient {

    private String patientId;
    private String name;
    private int age;

    // Sensitive medical data (Encapsulation)
    private String diagnosis;
    private List<String> medicalHistory;

    public Patient(String patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
        this.medicalHistory = new ArrayList<>();
    }

    // Getters (No direct setter for diagnosis)
    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    protected String getDiagnosis() {
        return diagnosis;
    }

    protected void updateDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    protected List<String> getMedicalHistory() {
        return medicalHistory;
    }

    // Concrete method
    public String getPatientDetails() {
        return "Patient ID: " + patientId +
                ", Name: " + name +
                ", Age: " + age;
    }

    // Abstract method
    public abstract double calculateBill();
}
