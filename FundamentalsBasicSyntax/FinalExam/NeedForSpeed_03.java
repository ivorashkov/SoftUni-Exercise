package FundamentalsBasicSyntax.FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NeedForSpeed_03 {
    private static class Car {
        String carModel;
        int mileage;
        int fuel;

        public String getCarModel() {
            return carModel;
        }

        public void setCarModel(String carModel) {
            this.carModel = carModel;
        }

        public int getMileage() {
            return mileage;
        }

        public void setMileage(int mileage) {
            this.mileage = mileage;
        }

        public int getFuel() {
            return fuel;
        }

        public void setFuel(int fuel) {
            this.fuel = fuel;
        }


        public Car(String carModel, int mileage, int fuel) {
            this.carModel = carModel;
            this.mileage = mileage;
            this.fuel = fuel;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCars = Integer.parseInt(scanner.nextLine());
        Map<String, Car> mapOfCars = new LinkedHashMap<>();

        for (int i = 0; i < numberOfCars; i++) {
            String[] input = scanner.nextLine().split("\\|");
            String carModel = input[0];

            Car car = mapOfCars.get(carModel);
            if (car == null) {
                int mileage = Integer.parseInt(input[1]);
                int fuel = Integer.parseInt(input[2]);
                mapOfCars.put(carModel, new Car(carModel, mileage, fuel));
            }
        }

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String[] cms = input.split(" : ");
            String command = cms[0];

            if (command.equals("Drive")) {
                String car = cms[1];
                int distance = Integer.parseInt(cms[2]);
                int fuelNeeded = Integer.parseInt(cms[3]);

                Car currentCar = mapOfCars.get(car);

                if (currentCar.getFuel() < fuelNeeded) {
                    System.out.println("Not enough fuel to make that ride");
                } else {
                    currentCar.setFuel((int) currentCar.getFuel() - fuelNeeded);
                    currentCar.setMileage(currentCar.getMileage() + distance);
                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n"
                            , currentCar.getCarModel(), distance, fuelNeeded);

                    if (currentCar.getMileage() >= 100000) {
                        System.out.println("Time to sell the " + currentCar.getCarModel() + "!");
                        mapOfCars.remove(car);
                    }
                }

            } else if (command.equals("Refuel")) {
                String car = cms[1];
                int fuel = Integer.parseInt(cms[2]);

                Car currentCar = mapOfCars.get(car);
                int currentFuel =  currentCar.getFuel();
                int newFuel = Math.min(currentCar.getFuel() + fuel, 75);
                currentCar.setFuel(newFuel);
                int amountRecovered = newFuel - currentFuel;
                System.out.printf("%s refueled with %d liters%n", currentCar.getCarModel(), amountRecovered);


            } else if (command.equals("Revert")) {
                String car = cms[1];
                int kms =  Integer.parseInt(cms[2]);

                Car currentCar = mapOfCars.get(car);
                if (currentCar != null){
                    int oldMileage = currentCar.getMileage();
                    int newMileage = currentCar.getMileage() - kms;
                    currentCar.setMileage(newMileage);

                    if (oldMileage > 10000 && currentCar.getMileage() < 10000){
                        currentCar.setMileage(10000);
                        //ignore
                    }else{
                        System.out.printf("%s mileage decreased by %d kilometers%n",currentCar.getCarModel(),kms);
                    }
                }
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String,Car>entry: mapOfCars.entrySet()) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n"
            ,entry.getKey(),entry.getValue().getMileage(),entry.getValue().getFuel());
        }

    }

}
