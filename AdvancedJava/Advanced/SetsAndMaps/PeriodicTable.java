package AdvancedJava.Advanced.SetsAndMaps;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number =  Integer.parseInt(scanner.nextLine());

        Set<String> chemicals = new TreeSet<>();
        for (int i = 0; i < number; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            chemicals.addAll(Arrays.asList(input));
        }

        chemicals.forEach(s -> System.out.print(s + " "));
    }
}
