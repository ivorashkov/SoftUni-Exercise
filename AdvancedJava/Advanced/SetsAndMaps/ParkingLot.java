package AdvancedJava.Advanced.SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        String command = input[0];

        Set<String> carNumbersSet = new LinkedHashSet<>();
        while (!command.equals("END")) {
            String number = input[1];
            if (command.equals("IN")) {
                carNumbersSet.add(number);
            } else if (command.equals("OUT")) {
                carNumbersSet.remove(number);
            }

            input = scanner.nextLine().split(", ");
            command = input[0];
        }

        if (carNumbersSet.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            carNumbersSet.forEach(System.out::println);
        }
    }
}
