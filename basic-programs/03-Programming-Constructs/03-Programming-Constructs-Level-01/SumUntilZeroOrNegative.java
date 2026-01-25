import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize total sum to 0.0
        double total = 0.0;

        // Infinite loop until user enters 0 or a negative number
        while (true) {
            System.out.print("Enter a number (or 0 or a negative number to stop): ");
            double number = sc.nextDouble();  // Get user input

            // If the number is 0 or negative, break the loop
            if (number <= 0) {
                break;
            }

            // Add the number to the total if it's positive
            total += number;
        }

        // Outside the loop, display the total sum
        System.out.println("The total sum is: " + total);

        sc.close();
    }
}

