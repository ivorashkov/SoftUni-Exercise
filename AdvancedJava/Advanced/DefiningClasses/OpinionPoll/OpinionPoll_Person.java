package AdvancedJava.Advanced.DefiningClasses.OpinionPoll;

public class OpinionPoll_Person {
    private String name;
    private int age;

    public OpinionPoll_Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String personInfo(){
        return String.format("%s - %d",this.name, this.age);
    }

}
