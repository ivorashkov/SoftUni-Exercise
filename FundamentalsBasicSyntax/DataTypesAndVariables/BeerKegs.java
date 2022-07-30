package FundamentalsBasicSyntax.DataTypesAndVariables;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double biggest = Integer.MIN_VALUE;
        String bestName = "";

        int input = Integer.parseInt(scanner.nextLine());
        for (int line = 0; line < input; line++) {
            String name = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());

            double result = Math.PI * Math.pow(radius, 2) * height;

            if (result > biggest){
                biggest = result;
                bestName = name;
            }

        }

        System.out.printf("%s", bestName);


    }
}
