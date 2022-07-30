package AdvancedJava.OOP.Polymorphism.Vehicles_Extension;

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

        tokens = scanner.nextLine().split("\\s+");
        Vehicle bus = extractVehicle(tokens);

        Map<String, Vehicle> vehicles = new LinkedHashMap<>();
        vehicles.put("Car", car);
        vehicles.put("Truck", truck);
        vehicles.put("Bus", bus);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        while (numberOfCommands-- > 0) {
            tokens = scanner.nextLine().split("\\s+");
            String command = tokens[0];
            String vehicleType = tokens[1];

            if ("Drive".equals(command)) {
                double distance = Double.parseDouble(tokens[2]);
                Vehicle vehicle  = vehicles.get(vehicleType);

                if (vehicle instanceof Bus){
                    bus.setFuelConsumption(bus.getFuelConsumption() + Bus.SUMMER_CONSUMPTION);
                    System.out.println(bus.drive(distance));
                    bus.setFuelConsumption(bus.getFuelConsumption() - Bus.SUMMER_CONSUMPTION);
                    continue;
                }

                System.out.println(vehicle.drive(distance));
            } else if ("Refuel".equals(command)) {
                double fuelAmount = Double.parseDouble(tokens[2]);
                vehicles.get(vehicleType).refuel(fuelAmount);

            }else if ("DriveEmpty".equals(command)){
                double distance = Double.parseDouble(tokens[2]);
                System.out.println(bus.drive(distance));

            }
        }

        vehicles.entrySet().forEach(e -> System.out.printf("%s: %.2f%n",e.getKey(),e.getValue().getFuelQuantity()));

    }

    private static Vehicle extractVehicle(String[] tokens) {
        String vehicleType = tokens[0];
        Vehicle vehicle = null;
        if ("Car".equals(vehicleType)) {
            vehicle = new Car(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]),Double.parseDouble(tokens[3]));
        } else if ("Truck".equals(vehicleType)) {
            vehicle = new Truck(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]),Double.parseDouble(tokens[3]));
        }else if ("Bus".equals(vehicleType)){
            vehicle = new Bus(Double.parseDouble(tokens[1]),Double.parseDouble(tokens[2]),Double.parseDouble(tokens[3]));
        }
        return vehicle;
    }

}
