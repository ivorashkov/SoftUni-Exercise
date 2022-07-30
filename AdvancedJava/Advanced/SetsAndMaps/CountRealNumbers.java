package AdvancedJava.Advanced.SetsAndMaps;

import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        Map<Double, Integer> countMap = new LinkedHashMap<>();

        for (Double d: numbers) {

            Integer valueOfKey = countMap.get(d);

            if (valueOfKey != null){
                countMap.put(d, valueOfKey +1);
            }else{
                countMap.put(d,1);
            }
        }


        for (Map.Entry<Double, Integer> entry: countMap.entrySet()) {

            System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());

        }


    }
}
