import java.util.Scanner;

public class TriangleAreaConversion {
    public static void main(String[] args) {
        double base;
        double height;
        double areaSqCm;
        double areaSqIn;

        Scanner input = new Scanner(System.in);

        base = input.nextDouble();
        height = input.nextDouble();

        areaSqCm = 0.5 * base * height;
        areaSqIn = areaSqCm / 6.4516;

        System.out.println(
            "The Area of the triangle in sq in is " + areaSqIn +
            " and sq cm is " + areaSqCm
        );

        input.close();
    }
}
