import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if the number is positive
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        // Initialize factorial result to 1 (since factorial of 0 is 1)
        long factorial = 1;

        // Using a while loop to compute the factorial
        int i = 1;
        while (i <= number) {
            factorial *= i; // Multiply the current factorial value by i
            i++; // Increment i
        }

        // Print the factorial result
        System.out.println("The factorial of " + number + " is: " + factorial);

        sc.close();
    }
}

