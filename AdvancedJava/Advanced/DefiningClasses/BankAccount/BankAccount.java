package AdvancedJava.Advanced.DefiningClasses.BankAccount;

public class BankAccount {
    //while static does not include in object creation
    private static double interestRate = 0.02;
    private static int nextId = 1;

    private int id;
    private double balance;

    public BankAccount() {
        this.id = nextId;
        nextId++;
    }

    public static void setInterestRate(double interest){
        //if we want to change static variable we should use static method
        //we cannot refer this.variabName from static methods [this.balance]
        interestRate = interest; //when we want to change the interestRate value
    }

    public double getInterestRate(int years){
        return  interestRate * years * this.balance;
    }

    public void setDeposit(double amount){
        this.balance += amount;
    }

    public int getId() {
        return id;
    }
}
