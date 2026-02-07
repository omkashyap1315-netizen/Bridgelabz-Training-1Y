package JavaArrays.Level1;
import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Define an integer array of 5 elements
        int[] arr = new int[5];

        // Take user input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // b & c. Loop through the array and check conditions
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                System.out.print(arr[i] + " is Positive and ");

                if (arr[i] % 2 == 0) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            }
            else if (arr[i] < 0) {
                System.out.println(arr[i] + " is Negative");
            }
            else {
                System.out.println(arr[i] + " is Zero");
            }
        }

        // d. Compare first and last elements
        int first = arr[0];
        int last = arr[arr.length - 1];

        if (first == last) {
            System.out.println("First and last elements are Equal");
        }
        else if (first > last) {
            System.out.println("First element is Greater than last element");
        }
        else {
            System.out.println("First element is Less than last element");
        }

        sc.close();
    }
}
