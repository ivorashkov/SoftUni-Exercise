package AdvancedJava.Advanced.MiddleExam_Prep;

import java.util.*;

public class Blacksmith_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //first IN first OUT -steel - Queue
        ArrayDeque<Integer> steelInfo = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).forEach(steelInfo::offer);

        //first IN last OUT - carbon - Stack
        ArrayDeque<Integer> carbonInfo = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).forEach(carbonInfo::push);

        Map<String, Integer> swords = new TreeMap<>();
        swords.put("Sabre", 0);
        swords.put("Katana", 0);
        swords.put("Shamshir", 0);
        swords.put("Gladius", 0);

        boolean isEmpty = true;
        int count = 0;
        while (steelInfo.size() > 0 && carbonInfo.size() > 0) {
            int cSteel = steelInfo.poll();
            int cCarbon = carbonInfo.pop();
            if (cSteel + cCarbon == 70) {
                count++;
                isEmpty = false;
                swords.put("Gladius", swords.get("Gladius") + 1);
            } else if (cSteel + cCarbon == 80) {
                count++;
                isEmpty = false;
                swords.put("Shamshir", swords.get("Shamshir") + 1);
            } else if (cSteel + cCarbon == 90) {
                count++;
                isEmpty = false;
                swords.put("Katana", swords.get("Katana") + 1);
            } else if (cSteel + cCarbon == 110) {
                count++;
                isEmpty = false;
                swords.put("Sabre", swords.get("Sabre") + 1);
            } else {
                cCarbon += 5;
                carbonInfo.push(cCarbon);
            }
        }
        String msg = isEmpty ? "You did not have enough resources to forge a sword." : "You have forged " + count + " swords.";
        System.out.println(msg);
        msg = steelInfo.size() == 0 ? "Steel left: none" : "Steel left: " + steelInfo.toString().replaceAll("[\\[\\]]","");
        System.out.println(msg);
        msg = carbonInfo.size() == 0 ? "Carbon left: none" : "Carbon left: " + carbonInfo.toString().replaceAll("[\\[\\]]","");
        System.out.println(msg);
        swords.forEach((k,v) -> {
            if (v > 0){
                System.out.printf("%s: %d%n",k,v);
            }
        });


    }
}
// names.addAll(Arrays.asList(scanner.nextLine().split(" ")));
//ArrayDeque<String> names = new ArrayDeque<>(Arrays.asList(scanner.nextLine().split(" ")));->Queue
//int sum = swords.values().stream().mapToInt(Integer::intValue).sum();
//steelInfo.stream().map(String::valueOf).collect(Collectors.joining(", "));
        /*swords.entrySet().stream()
                .filter(e -> e.getValue() != 0)
                .forEach(s -> System.out.println(s.getKey() + ": " + s.getValue()));*/