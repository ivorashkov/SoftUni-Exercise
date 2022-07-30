package BasicExercises;

import java.util.Scanner;

public class Basketball {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int annualPayment = Integer.parseInt(scanner.nextLine());

        double shoes =annualPayment - annualPayment * 0.40;
        double clothes = shoes - shoes * 0.20;
        double ball = clothes * 0.25;
        double accessories = ball * 0.20;

        double totalSum = annualPayment + shoes + clothes + ball + accessories;

        System.out.println(totalSum);


    }


}
