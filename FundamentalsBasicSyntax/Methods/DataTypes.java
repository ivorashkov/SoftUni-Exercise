package FundamentalsBasicSyntax.Methods;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();

        dataTypes(scanner,input);
    }

    private static void dataTypes(Scanner scanner, String input) {
        if (input.equals("int")) {
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println(number = number * 2);
        } else if (input.equals("real")) {
            double number = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.2f",number = number * 1.5);
        }else if (input.equals("string")){
            String word = scanner.nextLine();
            System.out.printf("$"+word+"$");
        }
    }
}
