package BasicExercises;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rest = Double.parseDouble(scanner.nextLine());
        double coins = rest * 100;
        int monetCount = 0;

        while (coins > 0){

            if (coins >= 200){
                monetCount++;
                coins -= 200;

            }else if (coins >= 100){
                monetCount++;
                coins -= 100;

            }else if (coins >= 50){
                monetCount++;
                coins -= 50;

            }else if (coins >= 20){
                monetCount++;
                coins -= 20;

            }else if (coins >= 10){
                monetCount++;
                coins -= 10;

            }else if (coins >= 5){
                monetCount++;
                coins -= 5;

            }else if (coins >= 2){
                monetCount++;
                coins -= 2;

            }else if (coins >= 1){
                monetCount++;
                coins -= 1;

            }else{
                break;
            }
        }
        System.out.println(monetCount);

    }
}
