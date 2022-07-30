package AdvancedJava.OOP.Abstraction.TrafficLights;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> colors = Arrays.asList(scanner.nextLine().split("\\s+"));

                /*Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
                */

        List<TrafficLight> trafficLights = new ArrayList<>();
        for (String color : colors) {
            LightsColor currentColor = LightsColor.valueOf(color);
            TrafficLight currentTrafficLight = new TrafficLight(currentColor);
            trafficLights.add(currentTrafficLight);
        }

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {

            trafficLights.forEach(t -> {
                t.changeColor();
                System.out.print(t.getCurrentColor() + " ");
            });
            System.out.println();
        }

    }
}
