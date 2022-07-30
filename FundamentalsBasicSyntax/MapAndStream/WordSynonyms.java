package FundamentalsBasicSyntax.MapAndStream;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> synonyms = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String keyWord = scanner.nextLine();
            String synWord = scanner.nextLine();

           synonyms.putIfAbsent(keyWord, new ArrayList<>());

            synonyms.get(keyWord).add(synWord);
        }
        //Print Method for multiple values in List separated by comma w/o the last element
        for (Map.Entry<String, List<String>> entry : synonyms.entrySet()){
            System.out.print(entry.getKey() + " - ");

            int count=0;
            for (String word: entry.getValue()){
                count++;

                System.out.print(word);
                if (count!= entry.getValue().size()){
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
