package JavaArrays.Level1;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Array, total, and index initialization
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // b. Infinite while loop
        while (true) {

            System.out.print("Enter a number: ");
            double input = sc.nextDouble();

            // c. Break if input is 0 or negative
            if (input <= 0) {
                break;
            }

            // d. Break if array size reaches 10
            if (index == 10) {
                break;
            }

            // e. Store value and increment index
            numbers[index] = input;
            index++;
        }

        // f. Add all elements to total
        for (int i = 0; i < index; i++) {
            total += numbers[i];
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }

        // g. Display total
        System.out.println("Total sum = " + total);

        sc.close();
    }
}
