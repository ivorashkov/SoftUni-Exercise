package FundamentalsBasicSyntax.MapAndStream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split("\\s+");

        Map<Character, Integer> countChars = new LinkedHashMap<>();

        // text, text, text
        for (String string:strings) {
            //0 1 2 3
            //t e x t
            for (int i = 0; i < string.length(); i++) {
                //get current char
                char currentSymbol = string.charAt(i);
                //get
                /*if (currentSymbol == ' '){
                    continue;
                    //за тоя израз можем да премахнем листа и обхождането отгоре
                }*/
                Integer currentCount = countChars.get(currentSymbol);//стойност на текущия ключ
                if (currentCount != null){//проверка за нулева стойност
                    countChars.put(currentSymbol, currentCount + 1);
                }else{
                    countChars.put(currentSymbol, 1);
                }

            }

        }
            //for(var entry : countChars.entrySet())
        for (Map.Entry<Character, Integer> entry: countChars.entrySet()){
            //обхождане и принтиране на мапа
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        //countChars.entrySet().forEach(entry -> System.out.println(entry.getKey() + " - > " + entry.getValue()));
    }
}
