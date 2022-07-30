package AdvancedJava.OOP.Encapsulation.ShoppingSpree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] people = extractInfo(scanner);
        String[] products = extractInfo(scanner);

        Map<String, Person> listOfPeople = new LinkedHashMap<>();
        Map<String, Product> listOfProducts = new LinkedHashMap<>();
        try {
            peopleToList(people, listOfPeople);
            productsToList(products, listOfProducts);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        String commands = scanner.nextLine();
        while (!("END").equals(commands)) {
            String[] command = commands.split("\\s+");//name product

            Person currentPerson = listOfPeople.get(command[0]);
            Product product = listOfProducts.get(command[1]);

            try{
                currentPerson.buyProduct(product);
                System.out.printf("%s bought %s%n", currentPerson.getName(), product.getName());
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

            commands = scanner.nextLine();
        }

        for (Person p:listOfPeople.values()){
            System.out.println(p.getProductsList());
        }

    }

    private static void peopleToList(String[] people, Map<String, Person> listOfPeople) {
        for (String s : people) {
            String[] info = s.split("=");
            try{
                Person person = new Person(info[0], Double.parseDouble(info[1]));
                listOfPeople.put(info[0], person);
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
                break;
            }
        }
    }

    private static void productsToList(String[] products, Map<String, Product> listOfProducts) {
        for (String s : products) {
            String[] info = s.split("=");
            try{
                Product product = new Product(info[0], Double.parseDouble(info[1]));
                listOfProducts.put(info[0], product);
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
                break;
            }
        }
    }

    private static String[] extractInfo(Scanner scanner) {
        return scanner.nextLine().split(";");
    }
}
