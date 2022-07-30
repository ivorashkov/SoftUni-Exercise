package FundamentalsBasicSyntax.Methods;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 =  Integer.parseInt(scanner.nextLine());
        int num2 =  Integer.parseInt(scanner.nextLine());
        int num3 =  Integer.parseInt(scanner.nextLine());

        int add = sumMethod(num1,num2);
        int subtract = subtractMethod(add,num3);

        System.out.println(subtract);

    }

    static int sumMethod(int a, int b){
        return a + b;
    }

    static  int subtractMethod(int a, int b){
        return a - b;

    }
}
