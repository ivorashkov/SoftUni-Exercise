package BasicExercises.ExamSecond;

import java.util.Scanner;

public class NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0;
        String winnerName = "";
        String input = scanner.nextLine();
//        for (int i = 0; i <text.length() ; i++) {
//            char symbol = text.charAt(i);

        while (!input.equals("Stop")) {
            int currentScore = 0;


            String name = input;


            for (int i = 0; i < name.length(); i++) {
                int letter = name.charAt(i);
                int guessNum = Integer.parseInt(scanner.nextLine());

                if (letter == guessNum) {

                    currentScore += 10;

                } else {

                    currentScore += 2;
                }


            }

            if (currentScore >= score) {

                score = currentScore;
                winnerName = name;

            }

            input = scanner.nextLine();
        }

        System.out.printf("The winner is %s with %d points!", winnerName, score);


    }
}
