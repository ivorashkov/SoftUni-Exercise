package FundamentalsBasicSyntax.RegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> racers = Arrays.stream(scanner.nextLine().split(",\\s+")).collect(Collectors.toList());
        Map<String, Integer> racersInfo = new LinkedHashMap<>();
        racers.forEach(racer->racersInfo.put(racer,0));//прехвърляме записите

        String input = scanner.nextLine();
        while (!input.equals("end of race")){
            Pattern name = Pattern.compile("[A-Za-z]+");
            Matcher matcherName = name.matcher(input);
            StringBuilder nameBuilder = new StringBuilder();

            while (matcherName.find()){
                nameBuilder.append(matcherName.group());
            }
            int distance = 0;
            Pattern distancePattern = Pattern.compile("[1-9]");
            Matcher matcherDistance = distancePattern.matcher(input);
            while (matcherDistance.find()){
                distance += Integer.parseInt(matcherDistance.group());
            }

            String currentName = nameBuilder.toString();
            if (racersInfo.containsKey(currentName)){
                int currentRacer = racersInfo.get(currentName);
                racersInfo.put(currentName, currentRacer + distance);
            }

            input = scanner.nextLine();
        }
        //{listName}.sort(Comparator.comparing({ClassName}::{getMethodName}));
       //сортираме мапа по стойности и го обръщаме на обратно
        List<String> firstThree = racersInfo.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .map(entry -> entry.getKey()).collect(Collectors.toList());

        System.out.printf("1st place: %s%n",firstThree.get(0));
        System.out.printf("2nd place: %s%n",firstThree.get(1));
        System.out.printf("3rd place: %s%n",firstThree.get(2));
    }

}
