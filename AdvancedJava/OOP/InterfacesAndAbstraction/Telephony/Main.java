package AdvancedJava.OOP.InterfacesAndAbstraction.Telephony;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.asList(scanner.nextLine().split("\\s+"));
        List<String> urls = Arrays.asList(scanner.nextLine().split("\\s+"));

        Smartphone smartphone = new Smartphone(numbers,urls);
        System.out.println(smartphone.call());
        System.out.println(smartphone.browse());


    }
}
