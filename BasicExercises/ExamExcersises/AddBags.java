package BasicExercises.ExamExcersises;

import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double  priceOverTwenty= Double.parseDouble(scanner.nextLine());
        double  kg= Double.parseDouble(scanner.nextLine());
        int  daysUntilTravel= Integer.parseInt(scanner.nextLine());
        int  baggageCount= Integer.parseInt(scanner.nextLine());

        double totalBaggageTaks = 0;
        if (kg < 10){
            totalBaggageTaks = priceOverTwenty * 0.20;

        }else if (kg <=20){
            totalBaggageTaks = priceOverTwenty * 0.50;

        }else if (kg > 20){
            totalBaggageTaks = priceOverTwenty;
        }


        if (daysUntilTravel > 30){
            totalBaggageTaks = totalBaggageTaks + totalBaggageTaks * 0.10;

        }else if (daysUntilTravel >=7 && daysUntilTravel <=30){
            totalBaggageTaks = totalBaggageTaks + totalBaggageTaks * 0.15;

        }else if (daysUntilTravel < 7){
            totalBaggageTaks = totalBaggageTaks + totalBaggageTaks * 0.40;

        }

        System.out.printf("The total price of bags is: %.2f lv.", totalBaggageTaks * baggageCount);
    }
}
