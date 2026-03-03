package com.gla.HospitalPatientManagement;

public class OutPatient extends Patient implements MedicalRecord {

    private int numberOfVisits;

    public OutPatient(String patientId, String name, int age,
                      String diagnosis, int numberOfVisits) {
        super(patientId, name, age, diagnosis);
        this.numberOfVisits = numberOfVisits;
    }

    @Override
    public double calculateBill() {
        return 800 + (200 * numberOfVisits);
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
