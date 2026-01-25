import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is greater than 1, as prime numbers are greater than 1
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
            return;
        }

        // Initialize the isPrime variable to true (assuming the number is prime)
        boolean isPrime = true;

        // Loop through numbers from 2 to number - 1 to check for divisibility
        for (int i = 2; i <= Math.sqrt(number); i++) { // We check till the square root of the number for efficiency
            if (number % i == 0) { // If number is divisible by i, it is not a prime number
                isPrime = false;
                break; // Exit the loop as we've found the divisor
            }
        }

        // Output the result based on the value of isPrime
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        sc.close();
    }
}

