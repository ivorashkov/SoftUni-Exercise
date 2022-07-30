package FundamentalsBasicSyntax.ClassAndObject;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number =  Integer.parseInt(scanner.nextLine());
        BigInteger result = factorial(number);

        System.out.println(result);
    }

    static BigInteger factorial(int number){
        BigInteger factorial = BigInteger.ONE;

        for (int i = number; i > 0; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return  factorial;
    }
}
