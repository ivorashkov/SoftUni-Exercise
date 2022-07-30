package FundamentalsBasicSyntax.Methods;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());

        gradePrinter(grade);

    }
    static void gradePrinter(double grade){

        if (grade <= 2.99){
            System.out.printf("Fail");
        }else if (grade <= 3.49){
            System.out.printf("Poor");
        }else if (grade <= 4.49) {
            System.out.printf("Good");
        }else if (grade <= 5.49) {
            System.out.printf("Very good");
        }else if (grade <= 6.00){
            System.out.printf("Excellent");
        }
    }

}
