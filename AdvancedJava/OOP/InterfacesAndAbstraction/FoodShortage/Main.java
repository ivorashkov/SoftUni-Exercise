package AdvancedJava.OOP.InterfacesAndAbstraction.FoodShortage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        Map<String, PersonImpl> people = new HashMap<>();
        while (numberOfPeople-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            if (input.length == 4) {
                //citizen
                String id = input[2];
                String birthDate = input[3];
                Citizen citizen = new Citizen(name, age, id, birthDate);
                people.put(name, citizen);

            } else if (input.length == 3) {
                //rabel
                String group = input[2];
                Rebel rebel = new Rebel(name, age, group);
                people.put(name, rebel);
            }
        }

        String inputNames = scanner.nextLine();
        while (!"End".equals(inputNames)) {

            PersonImpl person = people.get(inputNames);
            if (person != null){
                person.buyFood();
            }

            inputNames = scanner.nextLine();
        }

      Integer sum = people.values().stream()
                .map(Buyer::getFood).reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
