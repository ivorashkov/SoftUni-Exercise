package FundamentalsBasicSyntax.FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PIrates_03 {

    static class City {
        String name;
        int population;
        int gold;

        public City(String name, int population, int gold) {
            this.name = name;
            this.population = population;
            this.gold = gold;
        }

        public String getName() {
            return name;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public int getGold() {
            return gold;
        }

        public void setGold(int gold) {
            this.gold = gold;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, City> cityMap = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("Sail")) {
            String[] generalInfo = input.split("\\|\\|");
            String cityName = generalInfo[0];
            int population = Integer.parseInt(generalInfo[1]);
            int gold = Integer.parseInt(generalInfo[2]);

            City city = cityMap.get(cityName);
            if (city != null) {
                city.setPopulation(city.getPopulation() + population);
                city.setGold(city.getGold() + gold);
            } else {
                cityMap.put(cityName, new City(cityName, population, gold));
            }
            input = scanner.nextLine();
        }

        String events = scanner.nextLine();
        while (!events.equals("End")) {
            String[] cms = events.split("=>");
            String command = cms[0];
            String cityName = cms[1];
            City city = cityMap.get(cityName);

            if (command.equals("Plunder")) {
                int people = Integer.parseInt(cms[2]);
                int gold = Integer.parseInt(cms[3]);

                plunderCity(cityMap,cityName,city,people,gold);


            } else if (command.equals("Prosper")) {
                int gold = Integer.parseInt(cms[2]);

                prosperCity(cityName, city, gold);

            }
            events = scanner.nextLine();
        }

        printCities(cityMap);


    }

    private static void printCities(Map<String, City> cityMap) {
        if (cityMap.size() > 0){
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n",cityMap.size());
            for (Map.Entry<String,City> entry: cityMap.entrySet()) {
                City currentCity = entry.getValue();
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n"
                        ,currentCity.getName(), currentCity.getPopulation(),currentCity.getGold());
            }
        }else{
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }

    private static void plunderCity(Map<String, City> cityMap, String cityName, City city, int people, int gold) {
        if (city != null) {
            city.setPopulation(city.getPopulation() - people);
            city.setGold(city.getGold() - gold);
            System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", cityName, gold, people);

            if (city.getGold() <= 0 || city.getPopulation() <= 0) {
                cityMap.remove(cityName);
                System.out.printf("%s has been wiped off the map!%n", cityName);
            }
        }
    }


    private static void prosperCity(String cityName, City city, int gold) {
        if (city != null){
            if (gold > 0) {
                city.setGold(city.getGold() + gold);
                System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",gold,cityName,city.getGold());
            } else {
                System.out.println("Gold added cannot be a negative number!");
            }
        }
    }
}
