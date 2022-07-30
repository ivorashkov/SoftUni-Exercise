package FundamentalsBasicSyntax.MapAndStream;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Double>> items = new LinkedHashMap<>();

        String[] input = scanner.nextLine().split("\\s+");
        //List<String> input = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\s+")));

        while (!input[0].equals("buy")) {
            String keyItem = input[0];
            double price = Double.parseDouble(input[1]);
            double quantity = Integer.parseInt(input[2]);

            List<Double> keyValue = items.get(keyItem);

            if (keyValue != null) {
                items.get(keyItem).set(0, price);
                items.get(keyItem).set(1, items.get(keyItem).get(1) + quantity);
            } else {
                items.put(keyItem, new ArrayList<>());
                items.get(keyItem).add(price);
                items.get(keyItem).add(quantity);
            }

            input = scanner.nextLine().split("\\s+");
        }
        items.forEach((k, v) -> System.out.printf("%s -> %.2f%n", k, v.get(0) * v.get(1)));
    }
}
