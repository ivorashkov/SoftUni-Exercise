package BasicExercises.ExamExcersises;

import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int adults = Integer.parseInt(scanner.nextLine());
        int kids = Integer.parseInt(scanner.nextLine());
        double priceAdults = Double.parseDouble(scanner.nextLine());
        double tips = Double.parseDouble(scanner.nextLine());

        double kidsTicket = priceAdults - priceAdults * 0.70;
        priceAdults = priceAdults + tips;
        kidsTicket = kidsTicket + tips;

        double totalPrice = (kids * kidsTicket) + (adults * priceAdults);
        double profit = totalPrice * 0.20;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.",name, profit);

    }
}
