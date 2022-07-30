package FundamentalsBasicSyntax.DataTypesAndVariables;

import java.util.Scanner;

public class SnowBalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSnowBalls = Integer.parseInt(scanner.nextLine());


        double bestSnowBallValue = Integer.MIN_VALUE;
        int bestBallSnow = Integer.MIN_VALUE;
        int bestBallTime = Integer.MIN_VALUE;
        int bestBallQuality = Integer.MIN_VALUE;
        for (int i = 0; i < numberOfSnowBalls; i++) {
            int snowBallSnow = Integer.parseInt(scanner.nextLine());
            int snowBallTime = Integer.parseInt(scanner.nextLine());
            int snowBallQuality = Integer.parseInt(scanner.nextLine());

            double snowBallValue = Math.pow((snowBallSnow / snowBallTime), snowBallQuality);

            if (snowBallValue > bestSnowBallValue) {
                bestSnowBallValue = snowBallValue;
                bestBallSnow = snowBallSnow;
                bestBallTime = snowBallTime;
                bestBallQuality = snowBallQuality;
            }

        }
        System.out.printf("%d : %d = %.0f (%d)%n",bestBallSnow, bestBallTime, bestSnowBallValue, bestBallQuality );

    }
}
