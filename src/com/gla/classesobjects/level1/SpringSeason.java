package com.gla.classesobjects.level1;

public class SpringSeason {

    public static int checkSpring(int month, int day) {
        if ((month == 3 && day >= 20 && day <= 31) ||
                (month == 4 && day >= 1 && day <= 30) ||
                (month == 5 && day >= 1 && day <= 31) ||
                (month == 6 && day >= 1 && day <= 20))
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        int result = checkSpring(month, day);

        if (result == 1)
            System.out.println("Its a Spring Season");
        else
            System.out.println("Not a Spring Season");
    }
}
