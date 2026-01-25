import java.util.Scanner;

public class GreatestFactorUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if the entered number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Initialize the greatestFactor variable
        int greatestFactor = 1;

        // Initialize counter to number - 1
        int counter = number - 1;

        // Using a while loop to find the greatest factor (besides the number itself)
        while (counter >= 1) {
            if (number % counter == 0) {  // If counter is a factor of the number
                greatestFactor = counter;  // Assign counter to greatestFactor
                break;  // Break the loop after finding the greatest factor
            }
            counter--;  // Decrement the counter to check the next number
        }

        // Display the greatest factor
        System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);

        sc.close();
    }
}

