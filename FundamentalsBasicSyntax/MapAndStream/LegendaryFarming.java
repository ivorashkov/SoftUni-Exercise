package FundamentalsBasicSyntax.MapAndStream;

import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //shadowmourne 250 shards
        //Valenyr 250 fragments
        //Dragonwrath 250 motes
        Map<String, Integer> itemQuantity = new LinkedHashMap<>();
        itemQuantity.put("shards", 0);
        itemQuantity.put("fragments", 0);
        itemQuantity.put("motes", 0);

        boolean hasWinner = false;
        String winner = "";
        while (!hasWinner) {
            List<String> input = new ArrayList<>(Arrays.asList(scanner.nextLine().toLowerCase().split("\\s+")));

            for (int i = 0; i < input.size(); i += 2) {
                int quantity = Integer.parseInt(input.get(i));
                String resource = input.get(i + 1);
                // itemQuantity.merge(resource, quantity, Integer::sum);
                Integer keyValue = itemQuantity.get(resource);
                if (keyValue != null) {
                    itemQuantity.put(resource, keyValue + quantity);
                } else {
                    itemQuantity.put(resource, quantity);
                }

                if (resource.equals("shards") || resource.equals("fragments") || resource.equals("motes")) {

                    if (itemQuantity.get(resource) >= 250) {
                        itemQuantity.put(resource, itemQuantity.get(resource) - 250);
                        winner = resource;
                        hasWinner = true;
                        break;
                    }

                }
            }
        }

        if (winner.equals("shards")) {
            System.out.println("Shadowmourne obtained!");

        } else if (winner.equals("fragments")) {
            System.out.println("Valanyr obtained!");

        } else if (winner.equals("motes")) {

            System.out.println("Dragonwrath obtained!");
        }

        itemQuantity.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }

}

