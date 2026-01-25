import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for weight in kilograms and height in centimeters
        System.out.print("Enter the weight of the person (in kg): ");
        double weight = sc.nextDouble();
        
        System.out.print("Enter the height of the person (in cm): ");
        double heightCm = sc.nextDouble();

        // Convert height from cm to meters
        double heightM = heightCm / 100;

        // Calculate BMI using the formula: BMI = weight / (height * height)
        double bmi = weight / (heightM * heightM);

        // Determine the BMI status based on the provided table
        String status = "";
        
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            status = "Overweight";
        } else if (bmi >= 40.0) {
            status = "Obese";
        }

        // Output the BMI value and the weight status
        System.out.printf("BMI: %.2f\n", bmi);
        System.out.println("Status: " + status);

        sc.close();
    }
}

