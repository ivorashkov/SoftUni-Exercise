package AdvancedJava.Advanced.DefiningClasses.CarConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> carList = new ArrayList<>();
        int number = Integer.parseInt(scanner.nextLine());

        while (number-- > 0) {
            String[] info = scanner.nextLine().split("\\s+");

            if (info.length == 1) {
                String brand = info[0];
                carList.add(new Car(brand));
            } else if (info.length == 2) {
                String brand = info[0];
                String model = info[1];
                carList.add(new Car(brand, model));
            } else if (info.length == 3) {
                String brand = info[0];
                String model = info[1];
                int hp =  Integer.parseInt(info[2]);
                carList.add(new Car(brand,model,hp));
            }
        }

        carList.forEach(car -> System.out.println(car.getInfo()));
    }
}

