import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        double a, b, c;
        double result1, result2, result3, result4;

        Scanner input = new Scanner(System.in);

        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        result1 = a + b * c;
        result2 = a * b + c;
        result3 = c + a / b;
        result4 = a % b + c;

        System.out.println(
            "The results of Double Operations are " +
            result1 + ", " + result2 + ", " +
            result3 + ", and " + result4
        );

        input.close();
    }
}
