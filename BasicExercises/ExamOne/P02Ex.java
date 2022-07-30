package BasicExercises.ExamOne;

import java.util.Scanner;

public class P02Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double extraSavedMoneyPerDay = Double.parseDouble(scanner.nextLine());
        double moneyPerDay = Double.parseDouble(scanner.nextLine());
        double totalCosts = Double.parseDouble(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double totalMoney = 0;

        extraSavedMoneyPerDay = extraSavedMoneyPerDay * 5;
        moneyPerDay = moneyPerDay * 5;
        totalMoney = moneyPerDay + extraSavedMoneyPerDay;

        totalMoney = totalMoney - totalCosts;


        if (totalMoney >= giftPrice) {
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", totalMoney);
        } else {

            System.out.printf("Insufficient money: %.2f BGN.", Math.abs(totalMoney - giftPrice));
        }


    }
}
