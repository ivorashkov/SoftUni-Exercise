package BasicExercises.ExamExcersises;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int bestScore = 0;
        String winnerName = "";
        while(!input.equals("END")){
            String name = input;
            int goals = Integer.parseInt(scanner.nextLine());

            if (goals > bestScore){

                bestScore = goals;
                winnerName = name;
            }

            if (goals >= 10){
                break;
            }



            input = scanner.nextLine();
        }
        if (bestScore >= 10){
            System.out.printf("%s is the best player!%nHe has scored %d goals and made a hat-trick !!!", winnerName, bestScore);
        }else if (bestScore >= 3){
            System.out.printf("%s is the best player!%nHe has scored %d goals and made a hat-trick !!!", winnerName, bestScore);
        }else{
            System.out.printf("%s is the best player!%nHe has scored %d goals.", winnerName, bestScore);
        }


    }
}
