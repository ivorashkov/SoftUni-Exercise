package AdvancedJava.Advanced.SetsAndMaps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<Character, Integer> chars = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (chars.containsKey(c)){
                int count = chars.get(c);
                chars.put(c, count+1);
            }else{
                chars.put(c,1);
            }

        }

        chars.entrySet()
                .forEach(e-> System.out.println(e.getKey() + ": " + e.getValue() + " time/s"));
    }
}
