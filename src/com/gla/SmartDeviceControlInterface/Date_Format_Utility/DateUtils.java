package com.gla.SmartDeviceControlInterface.Date_Format_Utility;

// DateUtils.java
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface DateUtils {

    static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}
