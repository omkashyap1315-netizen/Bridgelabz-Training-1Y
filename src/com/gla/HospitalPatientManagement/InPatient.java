package com.gla.HospitalPatientManagement;

public class InPatient extends Patient implements MedicalRecord {

    private final int daysAdmitted;

    public InPatient(String patientId, String name, int age,
                     String diagnosis, int daysAdmitted) {
        super(patientId, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public double calculateBill() {
        return (2000 * daysAdmitted) + 5000;
    }

    @Override
    public void addRecord(String record) {
        getMedicalHistory().add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Diagnosis: " + getDiagnosis());
        System.out.println("Medical History: " + getMedicalHistory());
    }
}
