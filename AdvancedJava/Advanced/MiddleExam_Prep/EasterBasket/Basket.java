package AdvancedJava.Advanced.MiddleExam_Prep.EasterBasket;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Basket {
    private String material;
    private int capacity;
    private List<Egg> data;

    public Basket(String material, int capacity) {
        this.material = material;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void addEgg(Egg egg) {
        if (this.data.size() < capacity) {
            this.data.add(egg);
        }
    }

    public boolean removeEgg(String color) {
        return this.data.removeIf(s -> s.getColor().equals(color));
        /*Egg egg = this.getEgg(color);
        data.remove(egg);
        return  egg != null;*/
    }

    public Egg getStrongestEgg() {
        return data.stream().max(Comparator.comparing(Egg::getStrength)).orElse(null);
    }

    public Egg getEgg(String color) {
        return data.stream().filter(e -> e.getColor().equals(color))
                .findFirst().orElse(null);
    }

    public int getCount() {
        return this.data.size();
    }

    public String report() {

        /**//*return this.material + " basket contains:" +
                this.data.stream().map(Egg::toString).collect(Collectors.joining(System.lineSeparator()));
  */
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s basket contains:", material));
        data.forEach(egg -> sb.append(System.lineSeparator()).append(egg.toString()));
        return sb.toString().trim();
    }
}
