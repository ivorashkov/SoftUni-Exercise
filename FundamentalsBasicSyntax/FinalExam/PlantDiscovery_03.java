package FundamentalsBasicSyntax.FinalExam;

import java.util.*;

public class PlantDiscovery_03 {

    static class Plant {
        String name;
        int rarity;
        List<Double> ratings;

        public Plant(String name, int rarity, List<Double> ratings) {
            this.name = name;
            this.rarity = rarity;
            this.ratings = ratings;
        }

        public int getRarity() {
            return rarity;
        }

        public void setRarity(int rarity) {
            this.rarity = rarity;
        }

        public void setRatings(double ratings) {
            this.ratings.add(ratings);
        }

        public void setRatings(List<Double> ratings) {
            this.ratings = ratings;
        }

        public double getAverageRating() {
            if (this.ratings.size() > 0) {
                int count = this.ratings.size();
                double sum = 0;
                for (Double rate : this.ratings) {
                    sum = sum + rate;
                }
                return sum / count;
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Plant> plantInformation = new LinkedHashMap<>();
        int discovered = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < discovered; i++) {
            String input = scanner.nextLine();
            String[] plantInfo = input.split("<->");
            String plantName = plantInfo[0];
            int rarity = Integer.parseInt(plantInfo[1]);

            Plant keyValue = plantInformation.get(plantName);//дали има такъв мап
            if (keyValue != null) {//ако има такова растение
                keyValue.setRarity(rarity);//обновяваме неговата срещаност
            } else {//ако няма
                //създаваме нов обект
                Plant plant = new Plant(plantName, rarity, new ArrayList<>());
                //добавяме го в мапа
                plantInformation.put(plantName, plant);
            }

        }
        String com = scanner.nextLine();
        while (!com.equals("Exhibition")) {
            String[] commands = com.split(":\\s+");
            String command = commands[0];

            String[] info = commands[1].split("\\s+-\\s+");
            String plantName = info[0];
            //проверка дали е празно
            if (plantInformation.get(plantName) == null) {
                System.out.println("error");
            } else {
                if (command.equals("Rate")) {
                    double rate = Double.parseDouble(info[1]);
                    Plant value = plantInformation.get(plantName);//вземаме обекта
                    value.setRatings(rate);//добавяме стойност в листа

                } else if (command.equals("Update")) {
                    int rarity = Integer.parseInt(info[1]);

                    Plant value = plantInformation.get(plantName);
                    value.setRarity(rarity);

                } else if (command.equals("Reset")) {

                    Plant value = plantInformation.get(plantName);
                    value.setRatings(new ArrayList<>());
                }
            }
            com = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Plant> entry : plantInformation.entrySet()) {
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", entry.getKey(), entry.getValue().getRarity(), entry.getValue().getAverageRating());
        }

    }
}
