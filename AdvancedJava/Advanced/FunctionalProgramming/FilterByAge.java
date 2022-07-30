package AdvancedJava.Advanced.FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterByAge {
    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();
        while (n-- > 0) {
            String[] info = scanner.nextLine().split(", ");
            String name = info[0];
            int age = Integer.parseInt(info[1]);

            people.add(new Person(name, age));
        }

        String condition = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        List<Person> result = getFinalResult(people, condition, age);
        formatPrinter(result,format);
    }

    private static void formatPrinter(List<Person> result,String format) {
        if (format.equals("name")){
            result.forEach(p -> System.out.println(p.getName()));

        }else if (format.equals("age")){
            result.forEach(p -> System.out.println(p.getAge()));
        }else if (format.equals("name age")){
            result.forEach(p -> System.out.printf("%s - %d%n",p.getName(),p.getAge()));
        }
    }

    static List<Person> getFinalResult(List<Person> people, String condition, int age) {
        if (condition.equals("younger")) {
            return people.stream()
                    .filter(p -> p.getAge() <= age)
                    .collect(Collectors.toList());
        } else {
            return people.stream()
                    .filter(p -> p.getAge() >= age)
                    .collect(Collectors.toList());
        }
    }
}
