package AdvancedJava.OOP.Inheritance.HierarchicalInheritance;

public class Dog extends Animal{

    @Override
    public void eat(){
        System.out.println("Sharo is ");
        super.eat();//викаме базовия клас и логиката му като добавяме допълнителна логика чрез Override
    }


    public void bark(){
        System.out.println("barking...");
    }
}
