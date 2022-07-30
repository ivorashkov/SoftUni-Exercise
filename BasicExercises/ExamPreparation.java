package BasicExercises;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badGrades = Integer.parseInt(scanner.nextLine());
        String excercise = scanner.nextLine();
        int badcount = 0;
        int exCount = 0;
        double score = 0;
        boolean success = true;
        String lastProblem = "";

        while (!excercise.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());
            exCount++;
            score += grade;
            if (grade <= 4) {
                badcount++;
                if (badcount >= badGrades) {
                    success = false;
                    break;
                }
            }
            lastProblem = excercise;

            excercise = scanner.nextLine();


        }
        if (success) {
            System.out.printf("Average score: %.2f%n",score / exCount);
            System.out.printf("Number of problems: %d%n", exCount);
            System.out.printf("Last problem: %s%n", lastProblem);
        }else{
            System.out.printf("You need a break, %d poor grades.%n", badGrades);
        }
    }
}
