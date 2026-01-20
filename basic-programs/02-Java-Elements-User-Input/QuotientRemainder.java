import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        int number1;
        int number2;
        int quotient;
        int remainder;

        Scanner input = new Scanner(System.in);

        number1 = input.nextInt();
        number2 = input.nextInt();

        quotient = number1 / number2;
        remainder = number1 % number2;

        System.out.println(
            "The Quotient is " + quotient +
            " and Reminder is " + remainder +
            " of two number " + number1 +
            " and " + number2
        );

        input.close();
    }
}
