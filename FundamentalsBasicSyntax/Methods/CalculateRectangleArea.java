package FundamentalsBasicSyntax.Methods;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        areaCalculation(height,width);

    }
    static void areaCalculation(int a, int b){
        System.out.printf("%d", a * b);
    }
}
