package BasicExercises;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        double calculate = 0;
        boolean isOddOrEven = false;


        if (operator.equals("+")) {
            calculate = 1.0 * n1 + n2;


            if (calculate % 2 == 0) {
                isOddOrEven = true;
            }


        } else if (operator.equals("-")) {
            calculate = 1.0 * n1 - n2;

            if (calculate % 2 == 0) {
                isOddOrEven = true;
            }

        } else if (operator.equals("*")) {
            calculate = 1.0 * n1 * n2;

            if (calculate % 2 == 0) {
                isOddOrEven = true;
            }

        } else if (operator.equals("/") && n2 != 0) {
            calculate = 1.0 * n1 / n2;


        } else if (operator.equals("%") && n2 != 0) {
            calculate = 1.0 * n1 % n2;


        }

        if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
            if (isOddOrEven) {
                System.out.printf("%d %s %d = %.0f - even", n1, operator, n2, calculate);

            } else  {

                System.out.printf("%d %s %d = %.0f - odd", n1, operator, n2, calculate);

            }
        } else if (operator.equals("/") && n2 == 0) {
            System.out.printf("Cannot divide %d by zero", n1);

        } else if (operator.equals("/")) {
            System.out.printf("%d %s %d = %.2f", n1, operator, n2, calculate);

        } else if (operator.equals("%") && n2 == 0) {
            System.out.printf("Cannot divide %d by zero", n1);
        } else {
            System.out.printf("%d %s %d = %.0f", n1, operator, n2, calculate);
        }

    }
}
