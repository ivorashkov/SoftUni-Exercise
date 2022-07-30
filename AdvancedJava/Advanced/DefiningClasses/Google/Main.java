package AdvancedJava.Advanced.DefiningClasses.Google;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String,Person> personMap = new HashMap<>();
        while (!input.equals("End")){
            String[] details = input.split("\\s+");
            String name = details[0];

            String subClass="";
            if (details.length > 1){
                subClass = details[1];
            }

            personMap.putIfAbsent(name,new Person(name));
            Person person = personMap.get(name);
            if (subClass.equals("company")){
                person.setCompany(new Company(details[2],details[3], Double.parseDouble(details[4])));
            }else if (subClass.equals("pokemon")){
                person.setPokemons(new Pokemon(details[2],details[3]));
            }else if (subClass.equals("parents")){
                person.setParents(new Parent(details[2],details[3]));
            }else if (subClass.equals("children")){
                person.setChildren(new Child(details[2],details[3]));
            }else if (subClass.equals("car")){
                person.setCar(new Car(details[2], Integer.parseInt(details[3])));
            }
            input = scanner.nextLine();
        }
        System.out.println(personMap.get(scanner.nextLine()));

    }
}
