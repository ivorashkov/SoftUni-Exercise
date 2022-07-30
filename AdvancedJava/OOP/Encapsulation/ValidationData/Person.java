package AdvancedJava.OOP.Encapsulation.ValidationData;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;



    public Person(String firstName, String lastName, int age) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
    }
    public Person (String firstName, String lastName, int age, double salary){
        this(firstName,lastName,age);
        this.setSalary(salary);
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %.1f leva",firstName,lastName,salary);
    }

    public int getAge() {
        return age;
    }

    public void setSalary(double salary) {
        if (salary < 460){
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }

    public void setAge(int age) {
        if(age < 1){
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() < 3){
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() < 3){
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double bonus) {
        if (age > 30){
            salary = salary + salary * bonus / 100;
        }else {
            salary = salary + salary * bonus / 200;
        }
    }
}
