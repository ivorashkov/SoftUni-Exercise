package BasicExercises.ExamSecond;

import java.util.Scanner;

public class SuitcasesLoad_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int totalCases = 0;
        double capacity = Double.parseDouble(scanner.nextLine());

        boolean istrue= true;
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            double nextBag = Double.parseDouble(input);
            counter++;

            if (counter == 3) {
                counter = 0;
                nextBag = nextBag + nextBag * 0.10;
            }

            if (capacity < nextBag) {
                istrue = false;
                break;
            } else {
                istrue = true;
                capacity = capacity - nextBag;
                totalCases++;
            }

            input = scanner.nextLine();


        }
        if (istrue){
            System.out.printf("Congratulations! All suitcases are loaded!%n");
            System.out.printf("Statistic: %d suitcases loaded.", totalCases);
        }else {
            System.out.printf("No more space!%n");
            System.out.printf("Statistic: %d suitcases loaded.", totalCases);
        }


    }
}
