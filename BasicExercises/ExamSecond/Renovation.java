package BasicExercises.ExamSecond;

import java.util.Scanner;

public class Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int percentage = Integer.parseInt(scanner.nextLine());

        int total = height * width * 4;

        //calculating total - percentage of it
        total = (int) Math.ceil(total - (total / 100.0 * percentage));


        String input = scanner.nextLine();
        while (!input.equals("Tired!")) {
            total -= Integer.parseInt(input);

            if (total <= 0) {
                break;
            }

            input = scanner.nextLine();
        }
        if (total > 0) {
            System.out.printf("%d quadratic m left.", total);
        } else if (total == 0) {
            System.out.println("All walls are painted! Great job, Pesho!");
        } else {
            System.out.printf("All walls are painted and you have %d l paint left!", Math.abs(total));
        }
    }
}
