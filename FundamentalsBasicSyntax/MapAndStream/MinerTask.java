package FundamentalsBasicSyntax.MapAndStream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> metalValues = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            int amount = Integer.parseInt(scanner.nextLine());

            Integer currentValueOfKey = metalValues.get(input);

            if (currentValueOfKey != null) {
                metalValues.put(input, currentValueOfKey + amount);
            } else {
                metalValues.put(input, amount);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : metalValues.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
