package BasicExercises;

import java.util.Scanner;

public class Repainting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double sumNylon = (nylon + 2.00) * 1.50;
        double sumPaint = paint + paint * 0.10;
        double sumThinner = thinner * 5.00;
        double sumMaterials = sumNylon + sumPaint * 14.50 + sumThinner + 0.40;

        double salary = (sumMaterials * 0.30) * hours;

        double totalSum = salary + sumMaterials;

        System.out.println(totalSum);

    }
}
