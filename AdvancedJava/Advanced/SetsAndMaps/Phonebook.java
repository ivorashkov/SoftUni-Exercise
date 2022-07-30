package AdvancedJava.Advanced.SetsAndMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("-");
        Map<String, String> info = new HashMap<>();
        while (!input[0].equals("search")) {
            String name = input[0];
            String phone = input[1];

            String phoneInfo = info.get(name);
            info.put(name,phone);

            // if (phoneInfo != null){
           //}else{

          //  }
            input = scanner.nextLine().split("-");
        }

        String searchedName = scanner.nextLine();
        while (!searchedName.equals("stop")){
            String get = info.get(searchedName);
            if (get != null){
                System.out.println(searchedName + " -> " + get);
            }else{
                System.out.println("Contact " + searchedName + " does not exist.");
            }
            searchedName = scanner.nextLine();
        }

    }
}
