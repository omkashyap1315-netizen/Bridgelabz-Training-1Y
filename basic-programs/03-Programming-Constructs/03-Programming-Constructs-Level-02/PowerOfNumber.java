import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for number and power
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        // Check if the input values are positive integers
        if (number <= 0 || power < 0) {
            System.out.println("Please enter positive integers for both number and power.");
            return;
        }

        // Initialize the result variable to 1
        int result = 1;

        // Loop to calculate the power of the number
        for (int i = 1; i <= power; i++) {
            result *= number;  // Multiply result by number in each iteration
        }

        // Print the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);

        sc.close();
    }
}

