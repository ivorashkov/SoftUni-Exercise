package FundamentalsBasicSyntax.Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(returnPowerOfNumber(number,power)));

    }

    private static double returnPowerOfNumber(double number, double power) {
        return Math.pow(number, power);
    }
}