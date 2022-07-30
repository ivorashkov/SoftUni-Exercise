package BasicExercises;

import java.util.Scanner;

public class OnTimeForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int mins = Integer.parseInt(scanner.nextLine());
        int hourOfArrival = Integer.parseInt(scanner.nextLine());
        int minsOfArrival = Integer.parseInt(scanner.nextLine());

        int examAllMins = hour * 60 + mins;
        int arrivalAllMins = hourOfArrival * 60 + minsOfArrival;

        int difference = Math.abs(examAllMins - arrivalAllMins);
        int diffHour = difference / 60;
        int diffMin = difference % 60;

        if (examAllMins < arrivalAllMins) {
            System.out.println("Late");
            if (diffHour == 0) {
                System.out.printf("%d minutes after the start", difference);
            } else {
                System.out.printf("%d:%02d hours after the start", diffHour, diffMin);
            }
        } else if (examAllMins == arrivalAllMins || difference <= 30) {
            System.out.println("On time");

            if (difference != 0) {
                System.out.printf("%d minutes before the start", diffMin);
            }
        }else {
            System.out.println("Early");
            if (diffHour == 0){
                System.out.printf("%d minutes before the start", diffMin);
            }else{
                System.out.printf("%d:%02d hours before the start", diffHour, diffMin);
            }

        }

    }


}

