package FundamentalsBasicSyntax.ClassAndObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue {

    static class Vehicle {
        String type;
        String model;
        String color;
        int power;

        Vehicle(String type, String model, String color, int power) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.power = power;
        }

        String getInfo() {
            return String.format("Type: %s%n" +
                    "Model: %s%n" +
                    "Color: %s%n" +
                    "Horsepower: %d%n", this.type.substring(0,1).toUpperCase()+this.type.substring(1), this.model, this.color, this.power);

        }
        boolean isModel(String model) {
            return this.model.equals(model);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        double hpTruck = 0, hpCar = 0;
        int carCount = 0, truckCount = 0;
        List<Vehicle> vehicles = new ArrayList<>();
        while (!input.equals("End")) {
            String[] commands = input.split("\\s+");
            vehicles.add(new Vehicle(commands[0], commands[1], commands[2], Integer.parseInt(commands[3])));

            if (commands[0].equals("truck")) {
                hpTruck += Integer.parseInt(commands[3]);
                truckCount++;
            } else {
                hpCar += Integer.parseInt(commands[3]);
                carCount++;
            }
            input = scanner.nextLine();
        }

        String carCommands = scanner.nextLine();
        while (!carCommands.equals("Close the Catalogue")) {
            for (Vehicle vehicle : vehicles) {
                if (vehicle.isModel(carCommands)) {
                    System.out.print(vehicle.getInfo());
                }
            }
            carCommands = scanner.nextLine();
        }

        if (carCount > 0){
            System.out.printf("Cars have average horsepower of: %.2f.%n",Math.abs(hpCar / carCount));
        }else{
            System.out.println("Cars have average horsepower of: 0.00.");
        }

        if (truckCount>0){
            System.out.printf("Trucks have average horsepower of: %.2f.%n", Math.abs(hpTruck/truckCount));
        }else{
            System.out.println("Trucks have average horsepower of: 0.00.");
        }
    }
}
