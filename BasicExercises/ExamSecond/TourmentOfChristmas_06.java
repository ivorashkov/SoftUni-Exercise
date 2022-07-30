package BasicExercises.ExamSecond;

import java.util.Scanner;

public class TourmentOfChristmas_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOfTourment = Integer.parseInt(scanner.nextLine());

        int dayCount = 0;
        double raisedMoney = 0;
        int winnerPoints = 0;
        int loserPoints = 0;


        while (dayCount < daysOfTourment) {
            double raisedMoneyForDay = 0;
            int dayWin = 0;
            int dayLose= 0;

            String input = scanner.nextLine();
            while (!input.equals("Finish")) {

                String result = scanner.nextLine();

                if (result.equals("win")) {
                    raisedMoneyForDay += 20;
                    winnerPoints++;
                    dayWin++;
                } else {
                    dayLose++;
                    loserPoints++;
                }

                input = scanner.nextLine();

            }

            if (dayWin > dayLose) {
                raisedMoneyForDay = raisedMoneyForDay + raisedMoneyForDay * 0.10;

            }

            dayCount++;
            raisedMoney = raisedMoney + raisedMoneyForDay;
        }

        if (winnerPoints > loserPoints) {
            raisedMoney = raisedMoney + raisedMoney * 0.20;
            System.out.printf("You won the tournament! Total raised money: %.2f", raisedMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", raisedMoney);
        }


    }
}
