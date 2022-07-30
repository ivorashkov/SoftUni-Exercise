package AdvancedJava.OOP.Polymorphism.Vehicles;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");
        Vehicle car = extractVehicle(tokens);

        tokens = scanner.nextLine().split("\\s+");
        Vehicle truck = extractVehicle(tokens);

        Map<String, Vehicle> vehicles = new LinkedHashMap<>();
        vehicles.put("Car", car);
        vehicles.put("Truck", truck);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            tokens = scanner.nextLine().split("\\s+");
            String command = tokens[0];
            String vehicleType = tokens[1];

            if ("Drive".equals(command)) {
                double distance = Double.parseDouble(tokens[2]);
                System.out.println(vehicles.get(vehicleType).drive(distance));
            } else if ("Refuel".equals(command)) {
                double fuelAmount = Double.parseDouble(tokens[2]);
                vehicles.get(vehicleType).refuel(fuelAmount);
            }
        }

        vehicles.entrySet().forEach(e -> System.out.printf("%s: %.2f%n",e.getKey(),e.getValue().getFuelQuantity()));

    }

    private static Vehicle extractVehicle(String[] tokens) {
        String vehicleType = tokens[0];
        Vehicle vehicle = null;
        if ("Car".equals(vehicleType)) {
            vehicle = new Car(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
        } else if ("Truck".equals(vehicleType)) {
            vehicle = new Truck(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
        }
        return vehicle;
    }

}
