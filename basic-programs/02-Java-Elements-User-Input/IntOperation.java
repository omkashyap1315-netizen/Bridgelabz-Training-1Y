import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        int a, b, c;
        int result1, result2, result3, result4;

        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        result1 = a + b * c;
        result2 = a * b + c;
        result3 = c + a / b;
        result4 = a % b + c;

        System.out.println(
            "The results of Int Operations are " +
            result1 + ", " + result2 + ", " +
            result3 + ", and " + result4
        );

        input.close();
    }
}
