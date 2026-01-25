import java.util.Scanner;

public class MultiplesBelow100UsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();

        // Check if the entered number is a positive integer and less than 100
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
            return;
        }

        // Initialize counter to number (to check multiples starting from the number itself)
        int counter = number;

        // Using a while loop to find multiples of the number below 100
        System.out.println("Multiples of " + number + " below 100 are:");
        while (counter < 100) {
            System.out.println(counter);  // Print the current multiple
            counter += number;  // Increase counter by the number to find the next multiple
        }

        sc.close();
    }
}

