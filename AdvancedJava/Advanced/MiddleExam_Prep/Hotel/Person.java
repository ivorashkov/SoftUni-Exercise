package AdvancedJava.Advanced.MiddleExam_Prep.Hotel;

public class Person {
    private String name;
    private int id;
    private int age;
    private String hometown = "n/a";

    public Person(String name, int id, int age, String hometown) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.hometown = hometown;
    }

    @Override
    public String toString() {
        return String.format("AdvancedJava.OOP.Encapsulation.SortByNameAndAge.AdvancedJava.OOP.Encapsulation.SalaryIncrease.AdvancedJava.OOP.Encapsulation.ValidationData.AdvancedJava.OOP.Encapsulation.FirstAndReserveTeam.AdvancedJava.OOP.Inheritance.Person %s: %d, Age: %d, Hometown: %s", getName(), getId(), getAge(), getHometown());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }
}
