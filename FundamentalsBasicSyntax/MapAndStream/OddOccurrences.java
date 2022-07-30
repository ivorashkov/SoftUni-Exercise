package FundamentalsBasicSyntax.MapAndStream;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = new ArrayList<>(Arrays.asList(scanner.nextLine().toLowerCase().split("\\s+")));

        Map<String, Integer> counts = new LinkedHashMap<>();

        for (String word : input) {
            Integer currentCount = counts.get(word);//Integer връща null, ако не съществува понеже е обект
            if (counts.get(word) != null) {
                //стойността на срещанията се повишава с 1
                counts.put(word, currentCount + 1);
            } else {
                //задаваме начална стойност 1 на първия срещнат такъв ключ
                counts.put(word, 1);
            }
        }


        List<String> values = new ArrayList<>();
        StringBuilder result = new StringBuilder();//+++++++++++IMPORTANTO*******
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                result.append(entry.getValue() + ", ");
                values.add(entry.getKey());
            }
        }
        //01234
        //Hello -> 5 length-1
        result.delete(result.length() - 2, result.length() - 1);
        System.out.println(result.toString());

        /*for (int i = 0; i < values.size(); i++) {
            System.out.print(values.get(i));

            if (i != values.size() - 1){
                System.out.print(", ");
            }
        }
        System.out.println();*/
    }
}
