package FundamentalsBasicSyntax.FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Pattern destinationPattern = Pattern.compile("([=/])(?<destination>[A-Z][A-Za-z]{2,})\\1");
        Matcher destMatcher = destinationPattern.matcher(input);

        int travelPoints = 0;
        List<String> destinations = new ArrayList<>();
        while (destMatcher.find()) {
            String destination = destMatcher.group("destination");
            travelPoints += destination.length();
            destinations.add(destination);
        }

        System.out.print("Destinations: ");
        for (int i = 0; i < destinations.size(); i++) {
            System.out.printf("%s", destinations.get(i));

            if (i < destinations.size() - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.printf("Travel Points: %d", travelPoints);


    }
}
