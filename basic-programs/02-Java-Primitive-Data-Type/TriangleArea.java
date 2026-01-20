import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        double base;
        double height;
        double areaSqInches;
        double areaSqCm;

        Scanner input = new Scanner(System.in);

        base = input.nextDouble();
        height = input.nextDouble();

        areaSqInches = 0.5 * base * height;
        areaSqCm = areaSqInches * 6.4516;

        System.out.println(
            "The area of the triangle is " + areaSqInches +
            " square inches and " + areaSqCm +
            " square centimeters"
        );

        input.close();
    }
}
