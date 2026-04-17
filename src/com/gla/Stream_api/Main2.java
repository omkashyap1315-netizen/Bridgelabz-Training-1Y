package com.gla.Stream_api;

import java.util.*;

class Doctor {
    String name;
    String specialty;
    boolean weekendAvailable;

    Doctor(String name, String specialty, boolean weekendAvailable) {
        this.name = name;
        this.specialty = specialty;
        this.weekendAvailable = weekendAvailable;
    }

    public boolean isWeekendAvailable() { return weekendAvailable; }
    public String getSpecialty() { return specialty; }
    public String toString() { return name + " " + specialty; }
}

public class Main2 {
    public static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
                new Doctor("A", "Cardio", true),
                new Doctor("B", "Neuro", false),
                new Doctor("C", "Ortho", true)
        );

        doctors.stream()
                .filter(Doctor::isWeekendAvailable)
                .sorted(Comparator.comparing(Doctor::getSpecialty))
                .forEach(System.out::println);
    }
}
