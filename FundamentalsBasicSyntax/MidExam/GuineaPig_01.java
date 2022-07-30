package FundamentalsBasicSyntax.MidExam;

import java.util.Scanner;

public class GuineaPig_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodKg = Double.parseDouble(scanner.nextLine()) * 1000;
        double hayKg = Double.parseDouble(scanner.nextLine()) * 1000;
        double coverKg = Double.parseDouble(scanner.nextLine()) * 1000;
        double guineaWeightKg = Double.parseDouble(scanner.nextLine()) * 1000;

        int days = 0;
        while (foodKg > 0 && hayKg > 0 && coverKg > 0 && days < 30){
            days++;
            foodKg -= 300;

            if (days % 2 == 0){
                hayKg = hayKg -  (foodKg * 0.05);
            }

            if (days % 3  == 0){
                coverKg = coverKg - (guineaWeightKg / 3);
            }


        }

        if (foodKg > 0 && hayKg > 0 && coverKg > 0){
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.%n", foodKg/1000.0, hayKg/1000.0,coverKg/1000.0);
        }else{
            System.out.println("Merry must go to the pet store!");
        }
    }
}
