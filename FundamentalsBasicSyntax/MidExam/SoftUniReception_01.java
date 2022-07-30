package FundamentalsBasicSyntax.MidExam;

import java.util.Scanner;

public class SoftUniReception_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employee1 =  Integer.parseInt(scanner.nextLine());
        int employee2 =  Integer.parseInt(scanner.nextLine());
        int employee3 =  Integer.parseInt(scanner.nextLine());
        int studentsCount =  Integer.parseInt(scanner.nextLine());

        int hoursNeeded = 0;
        while(studentsCount > 0){
            studentsCount -= (employee1 + employee2 + employee3);
            hoursNeeded++;
            if (hoursNeeded % 4 == 0){
                hoursNeeded++;

            }
        }

        System.out.printf("Time needed: %dh.", hoursNeeded);

    }
}
