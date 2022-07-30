package FundamentalsBasicSyntax.MapAndStream;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {

    static class Users {
        String name;
        String licensePlateNumber;

        public Users() {

        }

        public Users(String name, String licensePlateNumber) {
            this.name = name;
            this.licensePlateNumber = licensePlateNumber;
        }

        public String getName() {
            return name;
        }

        public String getLicensePlateNumber() {
            return licensePlateNumber;
        }


    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Users> parkingRegister = new LinkedHashMap<>();

        int registrationsCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < registrationsCount; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String command = input[0];
            String comName = input[1];


            if (command.equals("register") && parkingRegister.get(comName) != null){
                System.out.printf("ERROR: already registered with plate number %s%n",parkingRegister.get(comName).getLicensePlateNumber());
                //.getLicensePlateNumber() -> важно за да достъпим елемента в обекта
            }else if (command.equals("register") && parkingRegister.get(comName) == null){
                String plate = input[2];
                parkingRegister.put(comName, new Users(comName, plate));
                System.out.printf("%s registered %s successfully%n",comName,plate);

            }else if (command.equals("unregister") && parkingRegister.get(comName) == null){
                System.out.printf("ERROR: user %s not found%n", comName);
            }else if (command.equals("unregister") && parkingRegister.get(comName) != null){
                System.out.printf("%s unregistered successfully%n",comName);
                //parkingRegister.get(comName)
                parkingRegister.remove(comName);
            }
        }

        for (Map.Entry<String, Users>entry: parkingRegister.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue().getLicensePlateNumber());
            //.getLicensePlateNumber() -> важно е да достъпим стойността на дадения обект
        }

    }
}
