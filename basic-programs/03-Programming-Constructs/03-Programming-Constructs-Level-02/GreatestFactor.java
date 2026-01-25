import java.util.Scanner;

public class GreatestFactor {
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

        // For loop to find the greatest factor (besides the number itself)
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {  // If i is a factor of the number
                greatestFactor = i;  // Assign i to greatestFactor
                break;  // Break the loop after finding the greatest factor
            }
        }

        // Display the greatest factor
        System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);

        sc.close();
    }
}

