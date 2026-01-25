import java.util.Scanner;

public class FizzBuzzWithWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if the input is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Initialize the counter variable
        int i = 1;

        // Using a while loop to loop through numbers from 1 to the entered number
        while (i <= number) {
            // Check if the number is divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Check if the number is divisible by 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Check if the number is divisible by 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // Print the number if it is not divisible by 3 or 5
            else {
                System.out.println(i);
            }
            i++; // Increment the counter
        }

        sc.close();
    }
}

