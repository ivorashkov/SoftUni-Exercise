package BasicExercises;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (type.equals("Premiere")) {
            price = rows * cols * 12.00;


        } else if (type.equals("Normal")) {
            price = rows * cols * 7.50;


        } else if (type.equals("Discount")) {
            price = rows * cols * 5.00;

        }
        System.out.printf("%.2f", price);
    }
}
