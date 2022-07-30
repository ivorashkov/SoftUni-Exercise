package BasicExercises.ExamExcersises;

import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int red = 0;
        int orange = 0;
        int yellow = 0;
        int white = 0;
        int others = 0;
        int black = 0; //divide by 2 math floor
        double totalPoints = 0;

        int allBalls = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < allBalls; i++) {
           String nextBall = scanner.nextLine();

            if (nextBall.equals("red")) {
                red++;
                totalPoints += 5;
            } else if (nextBall.equals("orange")) {
                orange++;
                totalPoints += 10;
            } else if (nextBall.equals("yellow")) {
                yellow++;
                totalPoints += 15;
            } else if (nextBall.equals("white")) {
                white++;
                totalPoints += 20;
            } else if (nextBall.equals("black")) {
                totalPoints = Math.floor(totalPoints / 2);
                black++;
            }else{
                others++;
            }
        }

        System.out.printf("Total points: %.0f%n", totalPoints);
        System.out.printf("Red balls: %d%n", red);
        System.out.printf("Orange balls: %d%n", orange);
        System.out.printf("Yellow balls: %d%n", yellow);
        System.out.printf("White balls: %d%n", white);
        System.out.printf("Other colors picked: %d%n", others);
        System.out.printf("Divides from black balls: %d%n", black);




    }

}

