import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the countdown starting number
        System.out.print("Enter the countdown start number: ");
        int counter = sc.nextInt();

        // Using while loop to count down to 1
        while (counter >= 1) {
            System.out.println("T-" + counter + " seconds");
            counter--; // Decrementing the counter
        }

        // Once countdown reaches 1, print the final message
        System.out.println("Lift off!");

        sc.close();
    }
}

