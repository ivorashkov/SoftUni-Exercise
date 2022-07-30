package FundamentalsBasicSyntax.BasicSyntax.ConStatementsLoops;

import java.util.Scanner;

public class BackInThirtyMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());


        minutes = minutes + 30;
        if (minutes > 59){
            minutes = minutes - 60;
            hours++;

        }
        if (hours > 23){
            hours = 0;


        }

        if (minutes < 10){
            System.out.printf("%d:%02d",hours,minutes);
        }else {
            System.out.printf("%d:%d", hours, minutes);
        }


    }
}
