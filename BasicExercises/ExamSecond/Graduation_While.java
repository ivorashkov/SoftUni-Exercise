package BasicExercises.ExamSecond;

import java.util.Scanner;

public class Graduation_While {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        double sum = 0;
        int y = 1;
        int excluded = 0;
        while (y <= 12) {
            if (excluded > 1) {
                break;
            }

            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 4) {
                excluded++;
                continue;
            }

            sum = sum + grade;

            y++;
        }

        if (excluded > 1) {
            System.out.printf("%s has been excluded at %d grade%n", name, y);
        } else {
            double avgGrade = sum / 12;
            System.out.printf("%s graduated. Average grade: %.2f%n", name, avgGrade);
        }
    }
}

