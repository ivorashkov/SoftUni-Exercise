package AdvancedJava.Advanced.MiddleExam_Prep.Aquarium;

import java.util.HashMap;
import java.util.Map;

public class Aquarium {
    private Map<String, Fish> fishInPool;
    private String name;
    private int capacity;
    private int size;

    public Aquarium(String name, int capacity, int size) {
        this.name = name;
        this.capacity = capacity;
        this.size = size;
        this.fishInPool = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }

    public int getFishInPool() {
        return this.fishInPool.size();
    }

    public void add(Fish fish) {
        Fish current = this.fishInPool.get(fish.getName());
        if (current == null && this.fishInPool.size() < getCapacity()) {
            this.fishInPool.put(fish.getName(), fish);
        }
    }

    public boolean remove(String name) {
        Fish current = this.fishInPool.get(name);
        if (current != null) {
            this.fishInPool.remove(name);
            return true;
        }
        return false;
    }

    public Fish findFish(String name) {
        return this.fishInPool.get(name);
    }

    public String report() {
        StringBuilder str = new StringBuilder();
        str.append("Aquarium: " + this.name + " ^ Size: " + this.size);
        this.fishInPool.entrySet()
                .forEach(f ->
                        str.append(String.format(System.lineSeparator() + f.getValue().toString())));
        return str.toString();

    }


}
