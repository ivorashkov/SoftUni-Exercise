package AdvancedJava.Advanced.DefiningClasses.PokemonTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Trainer> listOfTrainers = new LinkedHashMap<>();
        while (!input.equals("Tournament")) {
            String info[] = input.split("\\s+");
            String trainer = info[0];
            String pokemon = info[1];
            String element = info[2];
            int health = Integer.parseInt(info[3]);

            listOfTrainers.putIfAbsent(trainer, new Trainer(trainer));
            Trainer singleTrainer = listOfTrainers.get(trainer);
            singleTrainer.setPokemons(new Pokemon(pokemon, element, health));
            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("End")){
            String element = input;
            listOfTrainers.values().forEach(t -> t.applyCommand(element));
            input = scanner.nextLine();
        }
        listOfTrainers.values().stream().sorted(Comparator.comparing(Trainer::getBadges).reversed()).forEach( t->{
            System.out.println(String.format("%s %s %s", t.getName(),
                    t.getBadges(),t.getPokemons().size()));

                });

    }
}
