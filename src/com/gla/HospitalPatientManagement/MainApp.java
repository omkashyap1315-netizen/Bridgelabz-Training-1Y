package com.gla.HospitalPatientManagement;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();

        patients.add(new InPatient("P101", "Rahul", 30,
                "Appendicitis", 5));

        patients.add(new OutPatient("P202", "Priya", 25,
                "Flu", 3));

        for (Patient patient : patients) {

            System.out.println(patient.getPatientDetails());

            // Polymorphic call
            double bill = patient.calculateBill();
            System.out.println("Total Bill: ₹" + bill);

            if (patient instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) patient;
                record.addRecord("Initial Checkup Completed");
                record.addRecord("Medication Prescribed");
                record.viewRecords();
            }

            System.out.println("------------------------------------");
        }
    }
}
