package BasicExercises;

import java.util.Scanner;

public class Fishtank {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lengthCM = Integer.parseInt(scanner.nextLine());
        int widthCM = Integer.parseInt(scanner.nextLine());
        int heightCM = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double capacityCubeCm = lengthCM * widthCM * heightCM;
        double capacityLitres = capacityCubeCm / 1000;
        double nonFreeSpace = percent / 100;
        double necessaryLitres = capacityLitres * (1 - nonFreeSpace);

        System.out.println(necessaryLitres);

    }


}
