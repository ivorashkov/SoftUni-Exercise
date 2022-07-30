package AdvancedJava.Advanced.MiddleExam_Prep.Parrot;

import java.util.ArrayList;
import java.util.List;

public class Cage {
    private String name;
    private int capacity;
    private List<Parrot> data;

    public Cage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(Parrot parrot) {
        if (this.data.size() < getCapacity()) {
            data.add(parrot);
        }
    }

    public boolean remove(String name) {
        return this.data.removeIf(p -> p.getName().equals(name));
    }

    public int count() {
        return this.data.size();
    }

    public Parrot sellParrot(String name) {
        Parrot parrot = this.data.stream().filter(p -> p.getName().equals(name))
                .findAny().orElse(null);

        if (parrot != null) {
            parrot.setAvailable(false);
        }
        return parrot;
    }

    public List<Parrot> sellParrotBySpecies(String species) {
        List<Parrot> parrots = new ArrayList<>();
        this.data.stream().filter(p->p.getSpecies().equals(species))
                .forEach(p->{
                    parrots.add(p);
                    p.setAvailable(false);
                });
        return parrots;

      /*  List<Parrot> selledParrots = data.stream().filter(p -> p.getSpecies().equals(species))
                .collect(Collectors.toList());

        for (Parrot p : selledParrots) {
            sellParrot(p.getName());
        }
        return selledParrots;*/
    }

    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Parrots available at %s:", this.getName()));
        data.stream().filter(p -> p.isAvailable()).forEach(p -> sb.append(System.lineSeparator()).append(p.toString()));
        return sb.toString();
    }
}
