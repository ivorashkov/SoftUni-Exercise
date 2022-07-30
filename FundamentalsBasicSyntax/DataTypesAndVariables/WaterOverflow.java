package FundamentalsBasicSyntax.DataTypesAndVariables;

import java.util.Scanner;

public class WaterOverflow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacityLitres = 255;
        int totalWater = 0;

        int input = Integer.parseInt(scanner.nextLine());

        for (int lines = 0; lines < input; lines++) {
            int quantityLiters = Integer.parseInt(scanner.nextLine());

            if (quantityLiters <= capacityLitres) {
                capacityLitres -= quantityLiters;
                totalWater += quantityLiters;

            } else {
                System.out.printf("Insufficient capacity!%n");
            }

        }
        System.out.println(totalWater);

    }
}
