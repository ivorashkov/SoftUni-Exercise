package BasicExercises.ExamOne;

import java.util.Scanner;

public class P05Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int countdays = 1;
        int start = 5364;
        int end = 8848;


        String input = scanner.nextLine();
        while (!input.equals("END") && countdays <= 5) {
            String sleepOver = input;

            if (sleepOver.equals("Yes")) {
                input = scanner.nextLine();
                countdays++;
                continue;

            } else if (input.equals("No")){
                input = scanner.nextLine();


            }

            int meters = Integer.parseInt(input);
            start = start + meters;


            if (start >= end) {

                break;
            }


            input = scanner.nextLine();
        }
        if (start >= end) {
            System.out.printf("Goal reached for %d days!", countdays);
        } else {
            System.out.printf("Failed!%n");
            System.out.println(start);
        }

    }
}
