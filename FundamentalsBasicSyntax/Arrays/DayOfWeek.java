package FundamentalsBasicSyntax.Arrays;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] daysOfWeek = new String[] {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday", "Sunday"};

        int currentDay = Integer.parseInt(scanner.nextLine());


            if (currentDay < 1 || currentDay > 7){
                System.out.printf("Invalid day!");
            }else{
                System.out.printf("%s", daysOfWeek[currentDay - 1]);
            }


    }
}
