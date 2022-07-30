package AdvancedJava.Advanced.DefiningClasses.OpinionPoll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num =  Integer.parseInt(scanner.nextLine());
        List<OpinionPoll_Person> listOfPeople = new ArrayList<>();
        while (num-- > 0){
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            int age =  Integer.parseInt(input[1]);

            listOfPeople.add(new OpinionPoll_Person(name, age));

        }
        listOfPeople.stream().filter(p -> p.getAge() > 30)
                .sorted(Comparator.comparing(OpinionPoll_Person::getName))
                .forEach(p-> System.out.println(p.personInfo()));
    }
}
