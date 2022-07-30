package BasicExercises;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeOne = Integer.parseInt(scanner.nextLine());
        int timeTwo = Integer.parseInt(scanner.nextLine());
        int timeThree = Integer.parseInt(scanner.nextLine());

        int all = timeOne + timeTwo + timeThree;

        int minutes = all / 60;
        int seconds = all % 60;

        if (seconds < 10){

            System.out.printf("%d:0%d", minutes, seconds);
        } else{

            System.out.printf("%d:%d", minutes, seconds);
        }



    }

}
