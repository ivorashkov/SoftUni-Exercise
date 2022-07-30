package FundamentalsBasicSyntax.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> wagonString = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\s+")));
        List<Integer> wagons = new ArrayList<>();
        for (String s : wagonString) {
            wagons.add(Integer.parseInt(s));
        }

        int capacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine().toLowerCase();
        while (!input.equals("end")) {
            String[] command = input.split("\\s+");
            if (command[0].equals("add")) {
                wagons.add(Integer.parseInt(command[1]));
            } else {
//                int people = Integer.parseInt(command[0]);//брой хора
//                int index = 0;//текущ индекс в листа
//                while(index < wagons.size()) { //обхождам листа
//                    if ((wagons.get(index) + people) > capacity){//проверявам дали не надвишава стойността
//                        index++;
//                        continue;
//                    }else{
//                        wagons.set(index, wagons.get(index) + people);//прибавям ако не надвишава
//                        index++;
//                        break;
//                    }
            //}
                for (int index = 0; index < wagons.size(); index++) {
                    if (wagons.get(index) + Integer.parseInt(command[0]) <= capacity) {
                        wagons.set(index, wagons.get(index) + Integer.parseInt(command[0]));
                        break;
                    }


                }
            }

            input = scanner.nextLine().toLowerCase();
        }

        for (int n : wagons) {
            System.out.print(n + " ");
        }
    }
}
