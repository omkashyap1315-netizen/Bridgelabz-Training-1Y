package com.gla.SmartDeviceControlInterface.Data_Export_Feature;

public class JSONExporter implements ReportExporter {

    @Override
    public void export(String data) {
        System.out.println("Exporting data to JSON format...");
        exportToJSON(data);
    }

    @Override
    public void exportToJSON(String data) {
        System.out.println("Custom JSON Export:");
        System.out.println("{ \"customReport\": \"" + data + "\" }");
    }
}
