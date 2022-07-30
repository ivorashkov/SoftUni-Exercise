package FundamentalsBasicSyntax.Methods;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        char operation = scanner.nextLine().charAt(0);
        int number2 =  Integer.parseInt(scanner.nextLine());

        int result = getCalculations(number1,operation,number2);
        System.out.println(result);
    }

    private static int getCalculations(int number1, char operation, int number2) {
        int result = 0;

        if (operation == '*'){
            result = number1 * number2;
        }else if (operation == '/'){
            result = number1 / number2;
        }else if (operation == '+'){
            result = number1 + number2;
        }else if (operation == '-'){
            result = number1 - number2;
        }

        return result;
    }
}
