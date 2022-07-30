package FundamentalsBasicSyntax.FinalExam;

import java.util.Scanner;

public class ActivationKeys_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Generate")) {
            String[] cms = input.split(">>>");
            String command = cms[0];

            if (command.equals("Contains")) {
                String substring = cms[1];
                if (activationKey.indexOf(substring) != -1) {
                    System.out.printf("%s contains %s%n", activationKey, substring);
                } else {
                    System.out.println("Substring not found!");
                }

            } else if (command.equals("Flip")) {
                String subCommand = cms[1];//Upper/Lower
                int startIndex = Integer.parseInt(cms[2]);
                int endIndex = Integer.parseInt(cms[3]);

                if (subCommand.equals("Upper")) {
                    String firstPart = activationKey.substring(0, startIndex);
                    String substring = activationKey.substring(startIndex, endIndex);
                    String secondPart = activationKey.substring(endIndex);

                    substring = substring.toUpperCase();
                    activationKey = firstPart + substring + secondPart;
                    System.out.println(activationKey);

                } else if (subCommand.equals("Lower")) {
                    String firstPart = activationKey.substring(0, startIndex);
                    String substring = activationKey.substring(startIndex, endIndex);
                    String secondPart = activationKey.substring(endIndex);

                    substring = substring.toLowerCase();
                    activationKey = firstPart + substring + secondPart;
                    System.out.println(activationKey);
                }

            } else if (command.equals("Slice")) {
                int startIndex = Integer.parseInt(cms[1]);
                int endIndex = Integer.parseInt(cms[2]);

                StringBuilder stringBuilder = new StringBuilder(activationKey);
                stringBuilder.delete(startIndex,endIndex);
                activationKey = stringBuilder.toString();
                System.out.println(activationKey);

            }
            input = scanner.nextLine();
        }
        System.out.println("Your activation key is: " + activationKey);
    }
}
