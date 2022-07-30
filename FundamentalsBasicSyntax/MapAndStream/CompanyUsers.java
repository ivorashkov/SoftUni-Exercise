package FundamentalsBasicSyntax.MapAndStream;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> listOfEmployees = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] incomingInfo = input.split(" -> ");
            String companyName = incomingInfo[0];
            String employeeID = incomingInfo[1];

            List<String> getInfo = listOfEmployees.get(companyName);
            if (getInfo != null) {
                //булевата проверява от списъка с данни за дадения ключ дали съществува тази стойност
               // boolean contains = listOfEmployees.get(companyName).stream().anyMatch(s -> s.equals(employeeID));
                /*if (!contains) {
                    listOfEmployees.get(companyName).add(employeeID);
                }*/
                if (!getInfo.contains(employeeID)) {
                    listOfEmployees.get(companyName).add(employeeID);
                }

            } else {
                listOfEmployees.put(companyName, new ArrayList<>());
                listOfEmployees.get(companyName).add(employeeID);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : listOfEmployees.entrySet()) {

            List<String> currentListOfEmployees = entry.getValue();
            System.out.println(entry.getKey());
            for (String s : currentListOfEmployees) {
                System.out.printf("-- %s%n", s);
            }
        }
    }
}
