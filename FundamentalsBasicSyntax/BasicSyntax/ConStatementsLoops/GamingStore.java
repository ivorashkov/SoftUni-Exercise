package FundamentalsBasicSyntax.BasicSyntax.ConStatementsLoops;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String game1 = "OutFall 4";
        String game2 = "CS: OG";
        String game3 = "Zplinter Zell";
        String game4 = "Honored 2";
        String game5 = "RoverWatch";
        String game6 = "RoverWatch Origins Edition";

        double amount = Double.parseDouble(scanner.nextLine());
        double spentMoney = 0;
        String input = scanner.nextLine();
        while (amount > 0) {

            if (input.equals("Game Time")) {
                System.out.printf("Total spent: $%.2f. Remaining: $%.2f",spentMoney, amount);
                break;
            }


            if (input.equals(game1)) {
                if (amount >= 39.99) {
                    spentMoney += 39.99;
                    amount -= 39.99;
                    System.out.printf("Bought %s%n", game1);
                } else {
                    System.out.printf("Too Expensive%n");
                }

            } else if (input.equals(game2)) {
                if (amount >= 15.99) {
                    spentMoney += 15.99;
                    amount -= 15.99;
                    System.out.printf("Bought %s%n", game2);
                } else {
                    System.out.printf("Too Expensive%n");
                }

            } else if (input.equals(game3)) {
                if (amount >= 19.99) {
                    spentMoney += 19.99;
                    amount -= 19.99;
                    System.out.printf("Bought %s%n", game3);
                } else {
                    System.out.printf("Too Expensive%n");
                }

            } else if (input.equals(game4)) {
                if (amount >= 59.99) {
                    spentMoney += 59.99;
                    amount -= 59.99;
                    System.out.printf("Bought %s%n", game4);
                } else {
                    System.out.printf("Too Expensive%n");
                }

            } else if (input.equals(game5)) {
                if (amount >= 29.99) {
                    spentMoney += 29.99;
                    amount -= 29.99;
                    System.out.printf("Bought %s%n", game5);
                } else {
                    System.out.printf("Too Expensive%n");
                }

            } else if (input.equals(game6)) {
                if (amount >= 39.99) {
                    spentMoney += 39.99;
                    amount -= 39.99;
                    System.out.printf("Bought %s%n", game6);
                } else {
                    System.out.printf("Too Expensive%n");
                }

            } else {
                System.out.printf("Not Found%n");

            }

            input = scanner.nextLine();
        }

        if (amount == 0){
            System.out.printf("Out of money!%n");
        }
    }
}
