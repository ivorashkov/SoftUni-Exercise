package FundamentalsBasicSyntax.ClassAndObject;

import java.util.*;

public class OrderByAge {

    static class Person {
        String name;
        String id;
        int age;

        Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        int getAge() {
            return this.age;
        }

        String getInfo() {
            return String.format("%s with ID: %s is %d years old.", this.name, this.id, this.age);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Person> listOfPeople = new ArrayList<>();
        while (!input.equals("End")) {
            String[] info = input.split("\\s+");

            listOfPeople.add(new Person(info[0], info[1], Integer.parseInt(info[2])));

            input = scanner.nextLine();
        }

        //{listName}.sort(Comparator.comparing({ClassName}::{getMethodName}));
        listOfPeople.sort(Comparator.comparing(Person::getAge));

        for (Person p:listOfPeople) {
            System.out.println(p.getInfo());
        }
    }
}
