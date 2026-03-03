package com.gla.SmartDeviceControlInterface.Data_Export_Feature;

public class PDFExporter implements ReportExporter {

    @Override
    public void export(String data) {
        System.out.println("Exporting data to PDF format...");
        System.out.println("PDF Content: " + data);
    }

    // No JSON method — uses default
}
