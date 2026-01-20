import java.util.Scanner;

public class PurchaseTotal {
    public static void main(String[] args) {
        double unitPrice;
        int quantity;
        double totalPrice;

        Scanner input = new Scanner(System.in);

        unitPrice = input.nextDouble();
        quantity = input.nextInt();

        totalPrice = unitPrice * quantity;

        System.out.println(
            "The total purchase price is INR " + totalPrice +
            " if the quantity " + quantity +
            " and unit price is INR " + unitPrice
        );

        input.close();
    }
}
