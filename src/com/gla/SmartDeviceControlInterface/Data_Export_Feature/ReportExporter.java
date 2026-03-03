package com.gla.SmartDeviceControlInterface.Data_Export_Feature;

// ReportExporter.java
public interface ReportExporter {

    void export(String data);

    // Newly added feature (without breaking old classes)
    default void exportToJSON(String data) {
        System.out.println("Exporting data to JSON (default implementation)...");
        System.out.println("{ \"report\": \"" + data + "\" }");
    }
}
