package AdvancedJava.Advanced.MiddleExam_Prep.Hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
   private List<Person> roster;
   private String name;
   private int capacity;

    public Hotel(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new ArrayList<>();
    }

    public void add(Person person){
        if (getRoster().size() < capacity){
            this.roster.add(person);
        }
    }

    public boolean remove(String name){
        for (Person p: this.roster){
            if (p.getName().equals(name)){
                return roster.remove(p);
            }
        }
        return false;
    }

    public Person getPerson(String name,String hometown){
        return this.roster.stream().filter(person -> person.getName().equals(name)
                && person.getHometown().equals(hometown)).findAny().orElse(null);
    }

    public int getCount(){
        return this.roster.size();
    }

    public String getStatistics(){
        StringBuilder str = new StringBuilder();
        str.append("The people in the hotel " + getName() + " are:");
                getRoster().forEach(p ->str.append(String.format("%n%s", p.toString())));
                return str.toString();
    }

    public List<Person> getRoster() {
        return roster;
    }

    public void setRoster(List<Person> roster) {
        this.roster = roster;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
