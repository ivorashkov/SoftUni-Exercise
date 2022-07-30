package FundamentalsBasicSyntax.MapAndStream;

import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();
        Map<Double, Integer> numberCounts = new TreeMap<>();

        for (Double number : numbers) {
            Integer currentCount = numberCounts.get(number);//търсим по ключа(стойността на текущия номер)
            //ако numberCounts не е срещал такъв ключ/стойност, ще е празен -> null


            numberCounts.merge(number, 1, Integer::sum);
        /*    if (currentCount != null) {//Ако такъв ключ съществува
                numberCounts.put(number, currentCount + 1);
            } else {
                numberCounts.put(number, 1);
            }*/
        }

        for (Map.Entry<Double, Integer> entry : numberCounts.entrySet()) {
            System.out.printf("%.0f -> %d%n",entry.getKey(),entry.getValue());
        }


    }
}

