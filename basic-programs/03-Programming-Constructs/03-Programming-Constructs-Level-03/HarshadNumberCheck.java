import java.util.Scanner;

public class HarshadNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initialize sum to 0
        int sum = 0;

        // Store the original number for later comparison
        int originalNumber = number;

        // Step 1: Use a while loop to find the sum of the digits
        while (number != 0) {
            // Add the last digit to the sum
            sum += number % 10;

            // Remove the last digit from the number
            number /= 10;
        }

        // Step 2: Check if the original number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }

        sc.close();
    }
}

