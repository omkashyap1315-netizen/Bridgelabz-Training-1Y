package com.gla.classesobjects.level2;

import java.util.Scanner;

public class LeapYear {

    public static int checkLeapYear(int year) {
        if (year < 1582)
            return -1;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        int result = checkLeapYear(year);

        if (result == -1)
            System.out.println("Year should be greater than or equal to 1582");
        else if (result == 1)
            System.out.println("Year is a Leap Year");
        else
            System.out.println("Year is not a Leap Year");
    }
}

