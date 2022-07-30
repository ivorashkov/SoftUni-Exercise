package AdvancedJava.Advanced.FunctionalProgramming;

import java.util.*;
import java.util.function.Predicate;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guests = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\s+")));

        String input = scanner.nextLine();
        while (!input.equals("Party!")) {
            String[] commands = input.split("\\s+");
            String command = commands[0];
            Predicate<String> predicate = getPredicate(commands);

            if (command.equals("Remove")) {
                guests.removeIf(predicate);
            } else if (command.equals("Double")) {
                List<String> peopleToAdd = new ArrayList<>();
                guests.stream().filter(predicate).forEach(p -> peopleToAdd.add(p));
                guests.addAll(peopleToAdd);
            }
            input = scanner.nextLine();
        }

        if (guests.size() == 0 ){
            System.out.println("Nobody is going to the party!");
        }else{
            Collections.sort(guests);
            String result = String.join(", ", guests) + " are going to the party!";
            System.out.println(result);
        }

    }

    public static Predicate<String> getPredicate(String[] commands){
        Predicate<String> predicate = null;
        String filterName = commands[1];
        String filterCriteria = commands[2];

        if (filterName.equals("StartsWith")){
            predicate = name -> name.startsWith(filterCriteria);
        }else if (filterName.equals("EndsWith")){
            predicate = name -> name.endsWith(filterCriteria);
        }else if (filterName.equals("Length")){
           predicate = name -> name.length() ==  Integer.parseInt(filterCriteria);
        }

        return predicate;
    }
}
