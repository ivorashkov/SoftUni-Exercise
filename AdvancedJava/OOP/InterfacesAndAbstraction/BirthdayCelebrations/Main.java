package AdvancedJava.OOP.InterfacesAndAbstraction.BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Birthable> birthables = new ArrayList<>();
        while (!"End".equals(input)){
            String[] tokens = input.split("\\s+");
            String type = tokens[0];

            if ("Citizen".equals(type)){
                String name = tokens[1];
                int age =  Integer.parseInt(tokens[2]);
                String id = tokens[3];
                String birthDate = tokens[4];

                Birthable citizen= new Citizen(name,age,id,birthDate);
                birthables.add(citizen);

            }else if ("Pet".equals(type)){
                String name = tokens[1];
                String birthDate = tokens[2];

                Birthable pet = new Pet(name, birthDate);
                birthables.add(pet);

            }else if ("Robot".equals(type)){
                //todo nothing expected for robots
            }


            input = scanner.nextLine();
        }

        String year = scanner.nextLine();
        for (Birthable b: birthables) {
            if (b.getBirthDate().endsWith(year)){
                System.out.println(b.getBirthDate());
            }
        }
       /* birthables.stream()
                .map(Birthable::getBirthDate)
                .filter(e->e.endsWith(year))
                .forEach(System.out::println);*/
    }
}
