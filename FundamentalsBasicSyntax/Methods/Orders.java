package FundamentalsBasicSyntax.Methods;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        if (product.equals("coffee")) {
            double prodPrice = 1.50;
            priceCalculator(prodPrice, quantity);
        } else if (product.equals("water")) {
            double prodPrice = 1.00;
            priceCalculator(prodPrice, quantity);
        } else if (product.equals("coke")) {
            double prodPrice = 1.40;
            priceCalculator(prodPrice, quantity);
        } else if (product.equals("snacks")) {
            double prodPrice = 2.00;
            priceCalculator(prodPrice, quantity);
        }
    }

    static void priceCalculator(double prodPrice, double quantity) {
        System.out.printf("%.2f", prodPrice * quantity);
    }
}
