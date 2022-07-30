package FundamentalsBasicSyntax.Arrays;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int[] wagons = new int[input];
        int sum = 0;
        for (int i = 0; i < input; i++) {
            wagons[i] = Integer.parseInt(scanner.nextLine());
            sum += wagons[i];
        }
        for (int wagon : wagons) {
            System.out.printf("%d ", wagon);
        }
        System.out.println();
        System.out.println(sum);
    }
}
