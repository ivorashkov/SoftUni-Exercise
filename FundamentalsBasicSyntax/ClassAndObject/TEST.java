package FundamentalsBasicSyntax.ClassAndObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TEST {
    static class Person
    {
        private String name;
        private int age;

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
        public Person(String name, int age)
        {
            this.name = name;
            this.age = age;
        }
        @Override
        public String toString()
        {
            return String.format("%s - %d", this.name, this.age);
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();
        for(int i =0; i<n ; i++)
        {
            String[] data = scanner.nextLine().split("\\s+");

            Person person = new Person(data[0], Integer.parseInt(data[1]));
            people.add(person);

        }
        people.stream()
                .sorted((p1,p2) -> p1.getName().compareTo(p2.getName()))
                .filter(person -> person.getAge() > 30)
                .forEach(p -> System.out.println(p.toString()));

    }
}
