package AdvancedJava.Advanced.DefiningClasses.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        List<Car> listOfCars = new ArrayList<>();
        while (number-- > 0){
            String[] carInfo = scanner.nextLine().split("\\s+");
            String brand = carInfo[0];
            String model = carInfo[1];
            int hp =  Integer.parseInt(carInfo[2]);
            listOfCars.add(new Car(brand, model, hp));

        }
        for (Car c:listOfCars) {
            System.out.println(c.getInfo());
        }
    }
}
