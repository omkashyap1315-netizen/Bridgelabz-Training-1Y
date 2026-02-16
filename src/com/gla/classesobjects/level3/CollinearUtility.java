package com.gla.classesobjects.level3;

import java.util.Scanner;

public class CollinearUtility {

    // METHOD 1 : Using slope formula
    static void checkBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {

        // avoid division (cross multiply)
        if ((y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1))
            System.out.println("Collinear by Slope Method");
        else
            System.out.println("Not Collinear by Slope Method");
    }

    // METHOD 2 : Using area of triangle
    static void checkByArea(int x1, int y1, int x2, int y2, int x3, int y3) {

        double area = 0.5 * ( x1*(y2 - y3)
                + x2*(y3 - y1)
                + x3*(y1 - y2) );

        if (area == 0)
            System.out.println("Collinear by Area Method");
        else
            System.out.println("Not Collinear by Area Method");
    }

    // MAIN
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x1 y1:");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter x2 y2:");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println("Enter x3 y3:");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        checkBySlope(x1, y1, x2, y2, x3, y3);
        checkByArea(x1, y1, x2, y2, x3, y3);

        sc.close();
    }
}
