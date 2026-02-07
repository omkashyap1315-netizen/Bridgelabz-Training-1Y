import java.util.Scanner;

public class BMIUsing2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        // b. 2D array and status array
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // c. Take input with validation
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Weight (kg): ");
            double weight = sc.nextDouble();

            System.out.print("Height (m): ");
            double height = sc.nextDouble();

            // Validate input
            if (weight <= 0 || height <= 0) {
                System.out.println("Invalid input. Enter positive values only.");
                i--; // repeat this person's input
                continue;
            }

            personData[i][0] = weight;
            personData[i][1] = height;
        }

        // d. Calculate BMI and weight status
        for (int i = 0; i < number; i++) {

            double weight = personData[i][0];
            double height = personData[i][1];

            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // e. Display results
        System.out.println("\n----- BMI REPORT -----");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("Height: " + personData[i][1] + " m");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
            System.out.println();
        }

        sc.close();
    }
}
