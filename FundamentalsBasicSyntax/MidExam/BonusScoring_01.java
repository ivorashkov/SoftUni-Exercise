package FundamentalsBasicSyntax.MidExam;

import java.util.Scanner;

public class BonusScoring_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsNumber = Integer.parseInt(scanner.nextLine());
        int numberOfLectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());

        double maxBonus = 0;
        int totalLectures = 0;
        for (int i = 0; i < studentsNumber; i++) {
            int currentStudentAttendance = Integer.parseInt(scanner.nextLine());
            double currentBonus = 1.0 * currentStudentAttendance / numberOfLectures * (5 + additionalBonus);

            if (currentBonus > maxBonus) {
                maxBonus = currentBonus;
                totalLectures = currentStudentAttendance;
            }

        }

        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.", totalLectures);

    }
}
