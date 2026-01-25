import java.util.Scanner;

public class PowerOfNumberUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the base number and power
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        // Check if the input values are non-negative integers
        if (number <= 0 || power < 0) {
            System.out.println("Please enter positive integers for both number and power.");
            return;
        }

        // Initialize result to 1 (the identity element for multiplication)
        int result = 1;

        // Initialize counter to zero
        int counter = 0;

        // Using a while loop to calculate the power
        while (counter < power) {
            result *= number;  // Multiply result by the base number
            counter++;  // Increment the counter
        }

        // Print the final result
        System.out.println(number + " raised to the power of " + power + " is: " + result);

        sc.close();
    }
}

