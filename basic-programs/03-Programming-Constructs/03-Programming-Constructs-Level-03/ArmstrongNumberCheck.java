import java.util.Scanner;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 1: Initialize sum and store the original number
        int sum = 0;
        int originalNumber = number;

        // Step 2: Use a while loop to process the digits of the number
        while (originalNumber != 0) {
            // Step 3: Find the last digit of the number using modulus operation
            int digit = originalNumber % 10;

            // Step 4: Cube the digit and add it to the sum
            sum += Math.pow(digit, 3);

            // Step 5: Remove the last digit of the number using division operation
            originalNumber /= 10;
        }

        // Step 6: Check if the sum is equal to the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        sc.close();
    }
}

