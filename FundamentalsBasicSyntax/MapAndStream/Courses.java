package FundamentalsBasicSyntax.MapAndStream;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" : ");
        Map<String, List<String>> listOfCourses = new LinkedHashMap<>();

        while (!input[0].equals("end")){
            String courseKey = input[0];
            String nameValue = input[1];


            if (listOfCourses.get(courseKey) != null){
                listOfCourses.get(courseKey).add(nameValue);
            }else{
                listOfCourses.put(courseKey, new ArrayList<>());
                listOfCourses.get(courseKey).add(nameValue);
            }

            input = scanner.nextLine().split(" : ");
        }

        for (Map.Entry<String, List<String>> entry: listOfCourses.entrySet()) {

            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());

            for (String string: entry.getValue()) {
                System.out.printf("-- %s%n",string);
            }

        }
    }
}
