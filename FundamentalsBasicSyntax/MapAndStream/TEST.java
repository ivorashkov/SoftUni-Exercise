package FundamentalsBasicSyntax.MapAndStream;

import FundamentalsBasicSyntax.ClassAndObject.Students;

import java.util.*;
import java.util.stream.Collectors;

public class TEST {

    static class User {
        int id;
        String firstName;
        String lastName;
        String password;

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }

        User() {
        }

        User(int id, String firstName, String lastName) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        int getId() {
            return this.getId();
        }

        String getFirstname() {
            return this.firstName;
        }

        String getLastName() {
            return this.lastName;
        }

        void setId(int id) {
            this.id = id;
        }

        void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

    }

    static class Login {
        String firstName;
        String password;

        public Login() {
        }

        public Login(String firstName, String password) {
            this.firstName = firstName;
            this.password = password;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        Map<String, List<String>> companyInfo = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] commands = input.split(" -> ");
            String companyName = commands[0];
            String companyPlateNum = commands[1];

            List<String> getInfo = companyInfo.get(companyName);

            if (getInfo != null) {

                if (!getInfo.contains(companyPlateNum)) {
                    companyInfo.get(companyName).add(companyPlateNum);
                }

            } else {
                companyInfo.put(companyName, new ArrayList<>());
                companyInfo.get(companyName).add(companyPlateNum);
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : companyInfo.entrySet()) {

            List<String> currentListOfEmployees = entry.getValue();
            System.out.println(entry.getKey());
            for (String s : currentListOfEmployees) {
                System.out.printf("-- %s%n", s);
            }
        }






/*
        Scanner scanner = new Scanner(System.in);
        Login login = new Login("Ivaylo", "12345");

        List<String> asd = new ArrayList<>(Arrays.asList(scanner.nextLine().toLowerCase().split("\\s+")));
        List<String> result = asd.stream().filter(s -> s.length() < 5 || s.length() > 10).collect(Collectors.toList());
        asd.stream().map(Login,User.class).forEach(System.out::println);
        int[] Array  = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Map<String,List<Students>> obj = new HashMap<>();
        for (Map.Entry<String, List<Students>> entry: obj.entrySet() ) {

           // [0,1,2,3,4] -> < key1,value1>
                            //<key2,value2>
            List<Students> studs= entry.getValue();//Списъка за текущия ключ
            for (Students student: studs) {
                System.out.println(studs.toString());
            }

            //mapName.keySet() -> връща всички ключове
            //mapName.values() -> всички стойности
            //mapName.entrySet() -> всички записи (key -> value)


            entry.getValue().forEach(User::toString);
        }*/
        //List<String> words = Arrays.asList("asd", "hello", "hi", "yes", "am", "war", "study", "pls", "no");
//        Map<Integer, List<String>> wordsByLength = new TreeMap<>();
////бхождаме листа - 1
//        for (String word : words) {
//            //задаваме ключова стойност - 2
//            int key = word.length();//дължината на думата е ключовата стойност
//            //дай ми по тая дължина стойностите
//            //лист от стринг стойности ->  взети от ХешТаблицата с ключ дължината на текущата дума
//            List<String> wordsWithThisLength = wordsByLength.get(key);
//            //Map.computeIfAbsent Method - прави същото като проверката долу
//
//            if (wordsWithThisLength == null) {//ако до сега не сме срещали такъв ключ/дължина
//                wordsWithThisLength = new ArrayList<>();//създаваме списъка
//                wordsByLength.put(key, wordsWithThisLength);
//            }
//            wordsWithThisLength.add(word);
//        }
//
//        for (Map.Entry<Integer, List<String>> entry : wordsByLength.entrySet()) {
//            System.out.print(entry.getKey() + "->");//принтираме ключа на даденото ентри
//
//            for (String word : entry.getValue()) {//правим цикъл за обхождане на всички стойности
//                System.out.print(word + " ");
//            }
//            System.out.println();
//        }

        //о
    }
}
