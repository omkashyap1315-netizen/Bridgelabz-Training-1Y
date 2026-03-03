package com.gla.SmartDeviceControlInterface.Data_Export_Feature;

public class CSVExporter implements ReportExporter {

    @Override
    public void export(String data) {
        System.out.println("Exporting data to CSV format...");
        System.out.println("report," + data);
    }

    // No JSON method — uses default
}
