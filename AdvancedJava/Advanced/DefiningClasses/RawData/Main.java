package AdvancedJava.Advanced.DefiningClasses.RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines =  Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();
        while (lines -- > 0){
            String[] info = scanner.nextLine().split("\\s+");
            String carModel = info[0];

            int engineSpeed =  Integer.parseInt(info[1]);
            int enginePower =  Integer.parseInt(info[2]);
            Engine engine = new Engine(engineSpeed,enginePower);

            int cargoWeight =  Integer.parseInt(info[3]);
            String cargoType = info[4];
            Cargo cargo = new Cargo(cargoWeight,cargoType);

            List<Tire> tires = new ArrayList<>();
            for (int i = 5; i < info.length; i+=2) {
                double tirePressure =  Double.parseDouble(info[i]);
                int tireAge =  Integer.parseInt(info[i + 1]);
                Tire tire = new Tire(tirePressure,tireAge);
                tires.add(tire);
            }

            Car car = new Car(carModel,engine,cargo,tires);
            cars.add(car);

        }

        String command = scanner.nextLine();

        if (command.equals("fragile")){
            cars.stream()
                    .filter(c -> c.getCargo().getType().equals(command))
                    .filter(c -> c.getTires().stream().anyMatch(tire ->tire.getPressure() < 1))
                    .forEach(c-> System.out.println(c.getModel()));
        }else{
            cars.stream()
                    .filter(c -> c.getCargo().getType().equals(command))
                    .filter(c -> c.getEngine().getPower() > 250)
                    .forEach(c-> System.out.println(c.getModel()));
        }
    }
}
