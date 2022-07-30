package BasicExercises.ExamOne;

import java.util.Scanner;

public class P01Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int group = Integer.parseInt(scanner.nextLine());
        int  nights= Integer.parseInt(scanner.nextLine());
        int  transport= Integer.parseInt(scanner.nextLine());
        int  museum= Integer.parseInt(scanner.nextLine());

        double priceNight = 20;
        double priceTransport = 1.60;
        double priceTicket = 6;

        double totalNights = priceNight * nights;
        double totalTransport = transport * priceTransport;
        double totalMuseum = museum *priceTicket;
        double totalSumPerPerson = totalMuseum + totalTransport + totalNights;

        double totalSum = totalSumPerPerson * group;
        totalSum = totalSum + totalSum * 0.25;


        System.out.printf("%.2f", totalSum);

    }
}
