package AdvancedJava.Advanced.DefiningClasses.PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private int badges = 0;
    final private List<Pokemon> pokemons;

    public Trainer(String name) {
        this.name = name;
        this.badges = badges;
        this.pokemons = new ArrayList<>();
    }

    public boolean hasElement(String element){
        return  this.pokemons.stream().anyMatch(p->p.getElement().equals(element));
    }

    public void applyCommand(String element){
        if (hasElement(element)){
            this.badges++;
        }else{
            this.pokemons.forEach(p -> p.loseHealth());
            this.pokemons.removeIf(p->p.isDead());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBadges() {
        return badges;
    }

    public void setBadges(int badges) {
        this.badges = badges;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(Pokemon pokemons) {
        this.pokemons.add(pokemons);
    }
}
