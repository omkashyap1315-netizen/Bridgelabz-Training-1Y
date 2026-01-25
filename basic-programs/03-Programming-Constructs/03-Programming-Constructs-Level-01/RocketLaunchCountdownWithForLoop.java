import java.util.Scanner;

public class RocketLaunchCountdownWithForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the countdown start number
        System.out.print("Enter the countdown start number: ");
        int counter = sc.nextInt();

        // Using for loop to count down to 1
        for (int i = counter; i >= 1; i--) {
            System.out.println("T-" + i + " seconds");
        }

        // Once countdown reaches 1, print the final message
        System.out.println("Lift off!");

        sc.close();
    }
}

