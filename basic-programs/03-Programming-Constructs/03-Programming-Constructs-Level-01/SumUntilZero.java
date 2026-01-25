import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize total sum to 0.0
        double total = 0.0;
        double number;

        // Use a while loop to keep asking for input until the user enters 0
        do {
            System.out.print("Enter a number (or 0 to stop): ");
            number = sc.nextDouble();  // Get user input

            // If number is not zero, add to total
            if (number != 0) {
                total += number;
            }
        } while (number != 0);  // Continue until the user enters 0

        // Outside the loop, display the total sum
        System.out.println("The total sum is: " + total);

        sc.close();
    }
}

