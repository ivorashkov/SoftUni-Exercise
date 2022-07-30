package AdvancedJava.OOP.InterfacesAndAbstraction.BorderControl;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Identifiable> identifiableList = new ArrayList<>();

        String input = scanner.nextLine();

        while(!"End".equals(input)){
            String[] command = input.split(" ");

            Identifiable identifiable = command.length == 2
                ? new Robot(command[1],command[0])
                : new Citizen(command[0],  Integer.parseInt(command[1]), command[2]);

            identifiableList.add(identifiable);

            input = scanner.nextLine();
        }

        String fakeId = scanner.nextLine();
        identifiableList
                .stream()
                .map(Identifiable::getId)
                .filter(i -> i.endsWith(fakeId))
                .forEach(System.out::println);
    }
}
