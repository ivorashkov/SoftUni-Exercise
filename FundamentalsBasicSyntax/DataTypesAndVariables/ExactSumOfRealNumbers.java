package FundamentalsBasicSyntax.DataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = BigDecimal.valueOf(0);

        for (int i = 0; i < input; i++) {
            BigDecimal addNum = new BigDecimal(scanner.nextLine());
            sum = sum.add(addNum);

        }

        System.out.println(sum);

    }
}
