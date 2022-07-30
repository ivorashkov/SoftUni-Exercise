package AdvancedJava.Advanced.DefiningClasses.Google;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private Company company;
    private List<Pokemon> pokemons;
    private List<Parent> parents;
    private List<Child> children;
    private Car car;

    public Person(String name) {
        this.name = name;
        this.pokemons = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    @Override
    public String toString() {
        return name + System.lineSeparator() +
                "Company:" + System.lineSeparator() +
                (getCompany() == null ? "" : getCompany() + System.lineSeparator()) +
                "Car:" + System.lineSeparator() +
                (getCar() == null ? "" : getCar() + System.lineSeparator()) +
                "Pokemon:" + System.lineSeparator() +
                ((getPokemons().isEmpty()) ? "" : getPokemons().stream().map(Pokemon::toString)
                        .collect(Collectors.joining(System.lineSeparator())) + System.lineSeparator()) +
                "Parents:" +
                ((getParents().isEmpty()) ? "" : System.lineSeparator() + getParents().stream().map(Parent::toString)
                        .collect(Collectors.joining(System.lineSeparator()))) + System.lineSeparator() +
                "Children:" + System.lineSeparator() +
                (getChildren().isEmpty() ? "" : getChildren().stream().map(Child::toString)
                        .collect(Collectors.joining(System.lineSeparator()))) + System.lineSeparator();
    }

    /*
    @Override
    public String toString() {
        return String.format("%s%nCompany:%n%s%nCar:%n%s%nPokemon:%n%s%nParents:%n%s%nChildren:%n%s%n",getName(),
                getCompany() == null ? "" : getCompany().toString(),
                getCar() == null ? "" : getCar().toString(),
                (getPokemons().isEmpty()) ? "" : getPokemons().stream()
                        .map(Pokemon::toString).collect(Collectors.joining(System.lineSeparator())),
                (getParents().isEmpty()) ? "" :  getParents().stream()
                        .map(Parent::toString).collect(Collectors.joining(System.lineSeparator())),
                getChildren().isEmpty() ? "" : getChildren().stream().map(Child::toString)
                        .collect(Collectors.joining(System.lineSeparator())));

    }*/


    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }

    public List<Parent> getParents() {
        return parents;
    }

    public void setParents(Parent parent) {
        this.parents.add(parent);
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(Child child) {
        this.children.add(child);
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
