package FundamentalsBasicSyntax.Methods;


import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();

        while (!input.equals("end")) {
            int number = Integer.parseInt(input);
            isPalindrome(number);
            input = scanner.nextLine().toLowerCase();

        }
    }
    static void isPalindrome(int number){
        int temp = number;
        int current, sum = 0;
        while (number > 0) {
            current = number % 10;
            sum = (sum * 10) + current;
            number /= 10;
        }

        if (temp == sum) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
