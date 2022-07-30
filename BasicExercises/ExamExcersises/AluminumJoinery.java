package BasicExercises.ExamExcersises;

import java.util.Scanner;

public class AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String methodReceipt = scanner.nextLine();

        double moneyPerCount = 0;

        if (count > 10) {

            if (type.equals("90X130")) {
                moneyPerCount = 110 * count;

                if (count > 30 && count <= 60) {
                    moneyPerCount = moneyPerCount - moneyPerCount * 0.05;
                } else if (count > 60) {
                    moneyPerCount = moneyPerCount - moneyPerCount * 0.08;
                }

            } else if (type.equals("100X150")) {
                moneyPerCount = 140 * count;

                if (count > 40 && count <= 80) {
                    moneyPerCount = moneyPerCount - moneyPerCount * 0.06;
                } else if (count > 80) {
                    moneyPerCount = moneyPerCount - moneyPerCount * 0.10;
                }
            } else if (type.equals("130X180")) {
                moneyPerCount = 190 * count;

                if (count > 20 && count <= 50) {
                    moneyPerCount = moneyPerCount - moneyPerCount * 0.07;
                } else if (count > 50) {
                    moneyPerCount = moneyPerCount - moneyPerCount * 0.12;
                }
            } else if (type.equals("200X300")) {
                moneyPerCount = 250 * count;

                if (count > 25 && count <= 50) {
                    moneyPerCount = moneyPerCount - moneyPerCount * 0.09;
                } else if (count > 50) {
                    moneyPerCount = moneyPerCount - moneyPerCount * 0.14;
                }

            }

        }

        if (methodReceipt.equals("With delivery")) {
            moneyPerCount = moneyPerCount + 60;
        }

        if (count < 10) {
            System.out.println("Invalid order");
        } else if (count > 99) {
            moneyPerCount = moneyPerCount - moneyPerCount * 0.04;
            System.out.printf("%.2f BGN", moneyPerCount);
        } else {
            System.out.printf("%.2f BGN", moneyPerCount);
        }
    }
}