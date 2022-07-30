package FundamentalsBasicSyntax.ClassAndObject;

import java.util.*;

public class OpinionPoll {

    static class Person {
        private String name;
        private int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        String getInfo() {
            return String.format("%s - %d", this.name, this.age);
        }

        int getAge() {
            return this.age;
        }

        String getName() {
            return this.name;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> persons = new ArrayList<>();
        int numberOfPeople = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfPeople; i++) {
            List<String> information = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\s+")));

            Person person = new Person(information.get(0), Integer.parseInt(information.get(1)));
            if (person.getAge() > 30) {
                persons.add(person);
            }

        }
        //SortByAge persons.sort(Comparator.comparing(AdvancedJava.OOP.Encapsulation.SortByNameAndAge.AdvancedJava.OOP.Encapsulation.SalaryIncrease.AdvancedJava.OOP.Encapsulation.ValidationData.AdvancedJava.OOP.Encapsulation.FirstAndReserveTeam.AdvancedJava.OOP.Inheritance.Person::getAge));
        persons.sort(Comparator.comparing(Person::getName));

        for (Person pr : persons) {
            System.out.println(pr.getInfo());
        }
    }
}
