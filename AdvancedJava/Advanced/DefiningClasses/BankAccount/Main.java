package AdvancedJava.Advanced.DefiningClasses.BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<Integer, BankAccount> bankAccounts = new HashMap<>();

        while (!input.equals("End")) {
            String[] commands = input.split("\\s+");

            String output = null;
            if (commands[0].equals("Create")) {
                BankAccount bankAccount = new BankAccount();
                int id = bankAccount.getId();
                bankAccounts.put(id, bankAccount);
                output = "Account ID" + id + " created";

            } else if (commands[0].equals("Deposit")) {
                int id = Integer.parseInt(commands[1]);
                int amount = Integer.parseInt(commands[2]);

                BankAccount currentAccount = bankAccounts.get(id);
                if (currentAccount != null) {
                    currentAccount.setDeposit(amount);
                    output = "Deposited " + amount + " to ID" + currentAccount.getId();
                } else {
                    output = "Account does not exist";
                }

            } else if (commands[0].equals("SetInterest")) {
                double interest = Double.parseDouble(commands[1]);
                //since the method is static we call it through the ClassName
                BankAccount.setInterestRate(interest);

            } else if (commands[0].equals("GetInterest")) {
                int id = Integer.parseInt(commands[1]);
                int years = Integer.parseInt(commands[2]);
                BankAccount currentAccount = bankAccounts.get(id);

                if (currentAccount != null){
                    output = String.format("%.2f",currentAccount.getInterestRate(years));
                }else{
                    output = "Account does not exist";
                }
            }

            if (output != null){
                System.out.println(output);
            }
            input = scanner.nextLine();
        }
    }
}
