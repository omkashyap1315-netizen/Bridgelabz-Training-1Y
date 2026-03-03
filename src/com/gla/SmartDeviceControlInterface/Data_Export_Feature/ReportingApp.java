package com.gla.SmartDeviceControlInterface.Data_Export_Feature;

public class ReportingApp {

    public static void main(String[] args) {

        ReportExporter csv = new CSVExporter();
        ReportExporter pdf = new PDFExporter();
        ReportExporter json = new JSONExporter();

        csv.export("Sales Data");
        csv.exportToJSON("Sales Data");   // Uses default

        pdf.export("Inventory Data");
        pdf.exportToJSON("Inventory Data"); // Uses default

        json.export("Revenue Data"); // Uses overridden version
    }
}
