package FundamentalsBasicSyntax.FinalExam;

import java.util.Scanner;

public class WorldTour_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String allStops = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Travel")) {
            String[] allCommands = input.split(":");
            String command = allCommands[0];

            if (command.equals("Add Stop")) {
                int index = Integer.parseInt(allCommands[1]);
                String string = allCommands[2];

                if (index >= 0 && index < allStops.length()) {
                    String firstHalf = allStops.substring(0, index);
                    String secondHalf = allStops.substring(index);
                    allStops = firstHalf.concat(string).concat(secondHalf);
                }
                System.out.println(allStops);

            } else if (command.equals("Remove Stop")) {
                int startIndex = Integer.parseInt(allCommands[1]);
                int endIndex = Integer.parseInt(allCommands[2]);

                if ((startIndex >= 0 && startIndex < allStops.length()) && (endIndex >= 0 && endIndex < allStops.length())) {
                    String firstHalf = allStops.substring(0, startIndex);
                    String secondHalf;
                    secondHalf = allStops.substring(endIndex + 1);
                    allStops = firstHalf.concat(secondHalf);
                }
                System.out.println(allStops);

            } else if (command.equals("Switch")) {
                String oldString = allCommands[1];
                String newString = allCommands[2];
                int indexOf = allStops.indexOf(oldString);

                if (indexOf != -1) {
                    allStops = allStops.replace(oldString, newString);
                }
                System.out.println(allStops);
            }
            input = scanner.nextLine();
        }

        System.out.printf("Ready for world tour! Planned stops: %s", allStops);

    }
}
