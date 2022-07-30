package FundamentalsBasicSyntax.BasicSyntax.ConStatementsLoops;


import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int groupNumber = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine().toLowerCase();
        String day = scanner.nextLine().toLowerCase();

        double price = 0;
        double totalPrice = 0;
        if (type.equals("students")) {

            if (day.equals("friday")) {
                price = 8.45;
            } else if (day.equals("saturday")) {
                price = 9.80;
            } else if (day.equals("sunday")) {
                price = 10.46;
            }

            if (groupNumber >= 30) {
                //reduce the total price by 15%
                totalPrice = price * groupNumber;
                totalPrice = totalPrice - totalPrice * 0.15;

            } else {
                totalPrice = price * groupNumber;

            }

        } else if (type.equals("business")) {

            if (day.equals("friday")) {
                price = 10.90;
            } else if (day.equals("saturday")) {
                price = 15.60;
            } else if (day.equals("sunday")) {
                price = 16;
            }

            if (groupNumber >= 100) {
                //10 ppl for free
                totalPrice = price * groupNumber;
                totalPrice = totalPrice - 10 * price;

            } else {
                totalPrice = price * groupNumber;

            }

        } else if (type.equals("regular")) {

            if (day.equals("friday")) {
                price = 15;
            } else if (day.equals("saturday")) {
                price = 20;
            } else if (day.equals("sunday")) {
                price = 22.50;
            }

            if (groupNumber >= 10 && groupNumber <= 20) {
                //reduce total price by 5%
                totalPrice = price * groupNumber;
                totalPrice = totalPrice - totalPrice*0.05;
            } else {
                totalPrice = price * groupNumber;

            }

        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
