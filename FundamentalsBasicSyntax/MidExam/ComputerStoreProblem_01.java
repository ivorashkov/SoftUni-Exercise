package FundamentalsBasicSyntax.MidExam;

import java.util.Scanner;

public class ComputerStoreProblem_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();
        double totalSum = 0;

        while (!(input.equals("special") || input.equals("regular"))) {
            double prices = Double.parseDouble(input);

            if (prices < 0) {
                System.out.println("Invalid price!");
                input = scanner.nextLine();
                continue;
            } else if (prices == 0) {
                System.out.println("Invalid order!");
                input = scanner.nextLine();
                continue;
            }

            totalSum += prices;


            input = scanner.nextLine().toLowerCase();
        }

        printResult(input,totalSum);

    }

    private static void printResult(String input, double totalSum) {
        if (totalSum != 0){
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", totalSum);
            System.out.printf("Taxes: %.2f$%n", totalSum *0.2);
            System.out.println("-----------");
            double sumWithTaxes = totalSum + totalSum * 0.20;
            if (input.equals("special")){
                System.out.printf("Total price: %.2f$", sumWithTaxes - (sumWithTaxes * 0.10));
            }else{
                System.out.printf("Total price: %.2f$", sumWithTaxes);

            }
        }else{
            System.out.println("Invalid order!");
        }
    }
}
