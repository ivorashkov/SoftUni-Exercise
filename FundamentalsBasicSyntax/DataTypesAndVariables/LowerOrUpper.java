package FundamentalsBasicSyntax.DataTypesAndVariables;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char character = scanner.nextLine().charAt(0);

        if (Character.isUpperCase(character)){
            System.out.printf("upper-case");
        }else{
            System.out.printf("lower-case");
        }
    }
}
