package BasicExercises;

import java.util.Scanner;

public class NewDayNewAdventures {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double squareMeters = Double.parseDouble(scanner.nextLine());

        double sumOfSquareMeters = squareMeters * 7.61;

        double discount = sumOfSquareMeters * 0.18;
        double totalSum = sumOfSquareMeters - discount;

        System.out.println("The final price is: "+totalSum+" lv.");
        System.out.println("The discount is: "+discount+" lv.");

    }
}
