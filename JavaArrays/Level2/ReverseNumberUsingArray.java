import java.util.Scanner;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;

        // b. Find the count of digits
        int count = 0;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        // c. Store digits in array
        int[] digits = new int[count];
        temp = number;

        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }

        // d. Store digits in reverse order
        int[] reverse = new int[count];
        for (int i = 0; i < count; i++) {
            reverse[i] = digits[count - 1 - i];
        }

        // e. Display reversed number
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reverse[i]);
        }

        sc.close();
    }
}
