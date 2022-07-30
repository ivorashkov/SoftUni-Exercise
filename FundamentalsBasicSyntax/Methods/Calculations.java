package FundamentalsBasicSyntax.Methods;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        if (command.equals("add")) {
            int result = add(firstNum, secondNum);
            System.out.printf("%d", result);
        } else if (command.equals("multiply")) {
            int result = multiply(firstNum, secondNum);
            System.out.printf("%d", result);
        } else if (command.equals("subtract")) {
            int result = subtract(firstNum, secondNum);
            System.out.printf("%d", result);
        } else if (command.equals("divide")) {
            int result = divide(firstNum, secondNum);
            System.out.printf("%d", result);
        }

    }

    static int add(int a, int b) {
        return a + b;
        //static void add( int a, int b){System.out.println(a + b);}
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int divide(int a, int b) {
        int result = a / b;
        return result;
    }

}
