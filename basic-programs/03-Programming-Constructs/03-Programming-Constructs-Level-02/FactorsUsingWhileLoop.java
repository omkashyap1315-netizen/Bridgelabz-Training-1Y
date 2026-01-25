import java.util.Scanner;

public class FactorsUsingWhileLoop {
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

        // Initialize the counter variable
        int counter = 1;

        // Find and print all the factors using a while loop
        System.out.println("The factors of " + number + " are:");
        while (counter <= number) {
            if (number % counter == 0) { // If counter is a factor of number
                System.out.println(counter);
            }
            counter++; // Increment the counter
        }

        sc.close();
    }
}

