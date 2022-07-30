package BasicExercises.ExamExcersises;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int jury = Integer.parseInt(scanner.nextLine());

        double totalAverage = 0;
        int counter = 0;
        
        String input = scanner.nextLine();
        
        while (!input.equals("Finish")){
            String presentation = input;
            double currentAverage= 0;


            for (int i = 1; i <= jury ; i++) {
             double grade = Double.parseDouble(scanner.nextLine());
             currentAverage = currentAverage + grade;
             counter++;

            }
            totalAverage = totalAverage + currentAverage;

            System.out.printf("%s - %.2f.%n", presentation, currentAverage / jury);
            input = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.",totalAverage / counter);
    }
}
