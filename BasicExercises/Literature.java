package BasicExercises;

import java.util.Scanner;

public class Literature {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalBookPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysCount = Integer.parseInt(scanner.nextLine());

        int totalHoursPerBook = totalBookPages / pagesPerHour;
        int daysToRead =  totalHoursPerBook / daysCount;

        System.out.println(daysToRead);

    }

}
