package FundamentalsBasicSyntax.FinalExam;

import java.util.*;

public class TEST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> playList = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] information = scanner.nextLine().split("\\|");
            String name = information[0];
            String composer = information[1];
            String key = information[2];
            List<String> pieceData = new ArrayList<>();
            pieceData.add(composer);
            pieceData.add(key);
            playList.put(name, pieceData);
        }

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            String[] instructions = input.split("\\|");
            String command = instructions[0];
            String name = instructions[1];

            switch (command) {
                case "Add":
                    if (playList.containsKey(name)){
                        System.out.printf("%s is already in the collection!%n", name);
                    }else {
                        String composer = instructions[2];
                        String key = instructions[3];
                        List<String> pieceData = new ArrayList<>();
                        pieceData.add(composer);
                        pieceData.add(key);
                        playList.put(name,pieceData);

                        System.out.printf("%s by %s in %s added to the collection!%n", name,composer,key);
                    }
                    break;
                case "Remove":
                    if (playList.containsKey(name)){
                        playList.remove(name);
                        System.out.printf("Successfully removed %s!%n", name);
                    }else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", name);
                    }
                    break;
                case "ChangeKey":
                    String newKey = instructions[2];
                    if (playList.containsKey(name)){
                        playList.get(name).set(1,newKey);
                        System.out.printf("Changed the key of %s to %s!%n", name,newKey);
                    }else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", name);
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        playList.forEach((k,v) ->  System.out.printf("%s -> Composer: %s, Key: %s%n",k,v.get(0), v.get(1)));

        // for(Map.Entry<String,List<String>> entry: playList.entrySet()){
        //     System.out.println(entry.getKey() + " -> ");
        //     for (String w: entry.getValue()){
        //         System.out.println("Composer: "+ w + ", Key: "+ w);
        //     }
        // }
    }
    }

