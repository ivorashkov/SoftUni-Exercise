package FundamentalsBasicSyntax.MidExam.ActualExam;

import java.util.Scanner;

public class TheHuntingGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOfAdventure = Integer.parseInt(scanner.nextLine());
        int numberOfPlayers = Integer.parseInt(scanner.nextLine());
        double groupsEnergy = Double.parseDouble(scanner.nextLine());
        double waterPerPersonPerDay = Double.parseDouble(scanner.nextLine());
        double foodPerPersonPerDay = Double.parseDouble(scanner.nextLine());

        double totalWaterSupply = daysOfAdventure * numberOfPlayers * waterPerPersonPerDay;
        double totalFoodSupply = daysOfAdventure * numberOfPlayers * foodPerPersonPerDay;

        int daysCount = 0;
        while (groupsEnergy > 0 && daysCount < daysOfAdventure) {
            daysCount++;

            double amountOfEnergyLost = Double.parseDouble(scanner.nextLine());
            groupsEnergy -= amountOfEnergyLost;

            if (groupsEnergy <= 0){
                break;
            }

            if (daysCount % 2 == 0) {
                groupsEnergy += groupsEnergy * 0.05;
                totalWaterSupply -= totalWaterSupply * 0.30;
            }

            if (daysCount % 3 == 0) {
                totalFoodSupply -= totalFoodSupply / numberOfPlayers;//check calculation
                groupsEnergy += groupsEnergy * 0.10;

            }

        }

        if (daysCount == daysOfAdventure && groupsEnergy > 0) {
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!%n", groupsEnergy);

        } else {
            System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", totalFoodSupply, totalWaterSupply);
        }
    }
}
