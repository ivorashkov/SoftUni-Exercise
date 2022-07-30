package AdvancedJava.Advanced.SetsAndMaps;

import java.util.*;

public class CitiesByContinentAndCountry {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        //Europe Bulgaria {Sofia, Byala, Ruse}
        Map<String, Map<String, List<String>>> generalMap = new LinkedHashMap<>();
        for (int countryCount = 0; countryCount < count; countryCount++) {
            String[] input = scanner.nextLine().split("\\s+");

            String continent = input[0];
            String country = input[1];
            String city = input[2];//разбиваме на парчета

            generalMap.putIfAbsent(continent, new LinkedHashMap<>());
            Map<String, List<String>> countryWithCities = generalMap.get(continent);
            countryWithCities.putIfAbsent(country, new ArrayList<>());
            List<String> cities = countryWithCities.get(country);
            cities.add(city);

        }
            generalMap.entrySet()
                    .forEach(entry->{
                        String continent = entry.getKey();
                        Map<String,List<String>> countryWithCities = entry.getValue();

                        System.out.println(continent + ":");

                        countryWithCities.entrySet()
                                .forEach(e->{
                                    System.out.println("  " + e.getKey() + " -> " + String.join(", ",e.getValue()));
                                });
                    });
    }

}

