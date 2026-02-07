package JavaArrays.Level1;

import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // b. Create a double array of size 11
        double[] heights = new double[11];
        double sum = 0.0;

        // Take input for heights
        System.out.println("Enter the height of 11 football players:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextDouble();
        }

        // c. Find the sum of all elements
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        // d. Calculate and print mean height
        double mean = sum / heights.length;
        System.out.println("Mean height of the football team = " + mean);

        sc.close();
    }
}

