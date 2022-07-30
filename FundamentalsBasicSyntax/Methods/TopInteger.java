package FundamentalsBasicSyntax.Methods;

import java.util.Scanner;

public class TopInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //сумата на числата му се дели на 8,16,88 тн
        //състои се от поне 1 нечетна цифра

        int number = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= number; i++) {
           boolean one = isTopNumberSumOfDigits(i);
           boolean two = isContainingOddNums(i);

           if (one && two){
               System.out.println(i);
           }

        }
    }

        static boolean isTopNumberSumOfDigits(int number){

            int sum = 0;
            while (number > 0) {
                int currentNum = number % 10;
                sum += currentNum;
                number /= 10;
            }

            if (sum % 8 == 0) {
                return true;
            }
            return false;
        }

        static boolean isContainingOddNums(int number){

            while (number > 0) {
                int currentNum = number % 10;
                if (currentNum % 2 == 1) {
                    return true;
                }
                number /= 10;
            }
            return false;
        }
    }
