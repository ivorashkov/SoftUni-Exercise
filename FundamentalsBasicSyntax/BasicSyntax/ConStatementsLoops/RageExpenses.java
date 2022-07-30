package FundamentalsBasicSyntax.BasicSyntax.ConStatementsLoops;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double headsetTrash = 0;
        double mouseTrash = 0;
        double keyboardTrash = 0;
        double displayTrash = 0;
        int keyboardCount = 0;

        for (int i = 1; i <= lostCount; i++) {

            if (i % 2 == 0 && i % 3 == 0) {
                keyboardTrash += keyboardPrice;
                mouseTrash += mousePrice;
                headsetTrash += headsetPrice;
                keyboardCount++;
            } else if (i % 3 == 0) {
                mouseTrash += mousePrice;
            } else if (i % 2 == 0) {
                headsetTrash += headsetPrice;
            }

            if (keyboardCount > 0 && keyboardCount % 2 == 0) {
                displayTrash += displayPrice;
                keyboardCount = 0;
            }
        }

        System.out.printf("Rage expenses: %.2f lv.", Math.abs(headsetTrash + mouseTrash + keyboardTrash + displayTrash));
    }
}
