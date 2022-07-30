package FundamentalsBasicSyntax.DataTypesAndVariables;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int days = 0;
        int profit = 0;
        //source has starting yield ->first day
        int startingYield = Integer.parseInt(scanner.nextLine());

        //profitable source should be at least 100
        while (startingYield >= 100) {  //less than 100 - abandon the source

            profit += startingYield;
            profit -= 26;//mining crew consumes 26 spices every day every shift

            startingYield -= 10;//every day yield drops by 10
            days++;
        }

        System.out.println(days);

        //print days of operation in the mine
        if (profit >= 26) {//cannot consume more spice than there is in storage
            profit -= 26; //-26 spices more when the mine is exhausted
        }
        System.out.println(profit);//total spice extracted


    }
}
