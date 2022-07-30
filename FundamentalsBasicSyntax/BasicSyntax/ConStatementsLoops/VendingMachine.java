package FundamentalsBasicSyntax.BasicSyntax.ConStatementsLoops;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        double currentMoney = 0;

        while (!input.equals("Start")) {

            double money = Double.parseDouble(input);
            if (money == 0.1 || money == 0.2 ||
                    money == 0.5 || money == 1 || money == 2) {

                currentMoney += money;

            } else {
                System.out.printf("Cannot accept %.2f%n", money);

            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        boolean isEnough = true;
        while (!input.equals("End")) {


            if (input.equals("Nuts")) {
                double price = 2.0;
                if (currentMoney >= price) {
                    currentMoney -= 2.0;
                    System.out.printf("Purchased Nuts%n");
                }else{
                    isEnough = false;
                }

            } else if (input.equals("Water")) {
                double price = 0.7;
                if (currentMoney >= price) {
                    currentMoney -= 0.7;
                    System.out.printf("Purchased Water%n");
                }else{
                    isEnough = false;
                }

            } else if (input.equals("Crisps")) {
                double price = 1.5;
                if (currentMoney >= price) {
                    currentMoney -= 1.5;
                    System.out.printf("Purchased Crisps%n");
                }else{
                    isEnough = false;
                }

            } else if (input.equals("Soda")) {
                double price = 0.8;
                if (currentMoney >= price) {
                    currentMoney -= 0.8;
                    System.out.printf("Purchased Soda%n");
                }else{
                    isEnough = false;
                }

            } else if (input.equals("Coke")) {
                double price = 1.0;
                if (currentMoney >= price) {
                    currentMoney -= 1.0;
                    System.out.printf("Purchased Coke%n");
                }else{
                    isEnough = false;
                }

            } else {
                System.out.printf("Invalid product%n");
            }
            if (!isEnough) {
                System.out.printf("Sorry, not enough money%n");
                isEnough = true;
            }
            input = scanner.nextLine();
        }


        System.out.printf("Change: %.2f", currentMoney);
    }
}
