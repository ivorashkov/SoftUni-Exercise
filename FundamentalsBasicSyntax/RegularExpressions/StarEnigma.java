package FundamentalsBasicSyntax.RegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfMessages = Integer.parseInt(scanner.nextLine());
        List<String> attacked = new ArrayList<>();
        List<String> destroyed = new ArrayList<>();

        for (int i = 0; i < numberOfMessages; i++) {
            String encryptedInput = scanner.nextLine();
            Pattern encryptPattern = Pattern.compile("[star]", Pattern.CASE_INSENSITIVE);
            Matcher encryptMatcher = encryptPattern.matcher(encryptedInput);
            int count = 0;//encryption key counter
            while (encryptMatcher.find()) {
                count++;
            }
            //encrypting the data
            StringBuilder messageBuilder = new StringBuilder();
            for (int j = 0; j < encryptedInput.length(); j++) {
                int symbol = encryptedInput.charAt(j) - count;
                messageBuilder.append((char) symbol);
            }
            // System.out.println(messageBuilder);

            Pattern infoPattern = Pattern.compile("^[^@\\-!:>]*@(?<planet>[A-Za-z]+)[^@\\-!:>]*:(?<population>[\\d]+)[^@\\-!:>]*!(?<type>A|D)![^@\\-!:>]*->(?<soldiers>\\d+)[^@\\-!:>]*$");
            Matcher infoMatcher = infoPattern.matcher(messageBuilder.toString());

            if (infoMatcher.find()) {
                String planet = infoMatcher.group("planet");
                String type = infoMatcher.group("type");

                if (type.equals("D")) {
                    destroyed.add(planet);
                } else {
                    attacked.add(planet);
                }
            }
        }

        System.out.printf("Attacked planets: %d%n", attacked.size());
        Collections.sort(attacked);
        for (String name : attacked) {
            System.out.printf("-> %s%n", name);
        }

        System.out.printf("Destroyed planets: %d%n",destroyed.size());
        Collections.sort(destroyed);
        for (String name : destroyed) {
            System.out.printf("-> %s%n", name);
        }


    }
}
