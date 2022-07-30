package FundamentalsBasicSyntax.MidExam.ActualExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //family 3 7210>>van 4 2345>>heavyDuty 9 31000>>sports 4 7410
        //"family 3 7210","van 4 2345","heavyDuty 9 31000","sports 4 7410"
        //car type - years the tax should be paid - kilometres
        List<String> vehicles = new ArrayList<>(Arrays.asList(scanner.nextLine().split(">>")));

        double totalRevenue = 0;
        for (int i = 0; i < vehicles.size(); i++) {
            String carInformation = vehicles.get(i);
            String[] type = carInformation.split("\\s+");

            int years =  Integer.parseInt(type[1]);
            int km =  Integer.parseInt(type[2]);
            if (type[0].equals("family")){

                double taxes =km / 3000 * 12 + (50 - years * 5);
                totalRevenue += taxes;
                System.out.printf("A family car will pay %.2f euros in taxes.%n", taxes);

            }else if (type[0].equals("heavyDuty")){

                double taxes = km / 9000 * 14 + (80 - years * 8);
                totalRevenue += taxes;
                System.out.printf("A heavyDuty car will pay %.2f euros in taxes.%n", taxes);

            }else if (type[0].equals("sports")){

                double taxes =km / 2000 * 18 + (100 - years * 9);
                totalRevenue += taxes;
                System.out.printf("A sports car will pay %.2f euros in taxes.%n", taxes);
            }else{
                System.out.println("Invalid car type.");
            }
        }
        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.%n", totalRevenue);





    }
}
