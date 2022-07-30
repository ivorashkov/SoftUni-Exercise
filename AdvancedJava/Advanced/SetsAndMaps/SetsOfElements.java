package AdvancedJava.Advanced.SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int first =  Integer.parseInt(input[0]);
        int second =  Integer.parseInt(input[1]);
        Set<Integer> firstS = new LinkedHashSet<>();
        Set<Integer> secondS = new LinkedHashSet<>();

        for (int i = 0; i < first; i++) {
            int current =  Integer.parseInt(scanner.nextLine());
            firstS.add(current);
        }

        for (int i = 0; i < second; i++) {
            int current =  Integer.parseInt(scanner.nextLine());
            secondS.add(current);
        }

        firstS.retainAll(secondS);
        firstS.forEach(num -> System.out.print(num + " "));
    }
}
