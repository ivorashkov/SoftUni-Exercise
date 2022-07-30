package FundamentalsBasicSyntax.MapAndStream;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] split = scanner.nextLine().split("\\s+");

        List<String> result = Arrays.stream(split)
                .filter(str -> str.length() % 2 == 0)//проверяваме дължината дали е четна
                .toList();//записваме в лист друг вариант е .collect(Collectors.toList())

        result.forEach(System.out::println);//result.forEach(s-> System.out.println(s));
    }
}
