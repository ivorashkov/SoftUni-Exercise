package BasicExercises;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int time = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());

        double lunchBreak =1.0 * breakTime * 1/8;
        double relaxTime =1.0 *  breakTime * 1/4;

        double freeTime =  breakTime - lunchBreak - relaxTime;

        if (freeTime >= time){

            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, Math.ceil(freeTime - time));
        }else{
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, Math.ceil(time - freeTime));
        }
    }
}
