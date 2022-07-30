package BasicExercises;

import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalTime =  (hours * 60) + (minutes + 15);

        int totalHours = totalTime / 60;
        int totalMins = totalTime % 60;


        if(totalHours == 24){
            totalHours = 0;
        }

        if(totalMins < 10){
            System.out.printf("%d:0%d", totalHours, totalMins);
        }else{
            System.out.printf("%d:%d",totalHours, totalMins);
        }
    }
}
