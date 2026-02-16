package com.gla.classesobjects.level3;

import java.util.Scanner;

public class CalendarUtility {

    // Month names
    static String getMonthName(int m) {
        String[] months = {
                "January","February","March","April","May","June",
                "July","August","September","October","November","December"
        };
        return months[m - 1];
    }

    // Leap year
    static boolean isLeap(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
            return true;
        else
            return false;
    }

    // Number of days in month
    static int getDays(int m, int year) {

        int[] days = {
                31,28,31,30,31,30,
                31,31,30,31,30,31
        };

        // February in leap year
        if (m == 2 && isLeap(year))
            return 29;

        return days[m - 1];
    }

    // First day using Gregorian formula
    // returns 0=Sun,1=Mon,...6=Sat
    static int getFirstDay(int m, int year) {

        int d = 1; // first date

        int y0 = year - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12*((14 - m)/12) - 2;

        int d0 = (d + x + (31*m0)/12) % 7;

        return d0;
    }

    // Display calendar
    static void printCalendar(int m, int year) {

        int firstDay = getFirstDay(m, year);
        int totalDays = getDays(m, year);

        System.out.println("\n   " + getMonthName(m) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // spaces before first date
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // print dates
        for (int date = 1; date <= totalDays; date++) {

            System.out.printf("%3d ", date);

            if ((firstDay + date) % 7 == 0)
                System.out.println();
        }
    }

    // MAIN
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        printCalendar(month, year);

        sc.close();
    }
}
