//package FundamentalsBasicSyntax.RegularExpressions;
//
//import java.util.LinkedHashMap;
//import java.util.Map;
//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class NetherRealms {
//    static class Demon{
//        String name;
//        double health;
//        double damage;
//
//        public Demon(String name, double health, double damage) {
//            this.name = name;
//            this.health = health;
//            this.damage = damage;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public double getHealth() {
//            return health;
//        }
//
//        public void setHealth(double health) {
//            this.health = health;
//        }
//
//        public double getDamage() {
//            return damage;
//        }
//
//        public void setDamage(double damage) {
//            this.damage = damage;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String[] input = scanner.nextLine().split(",\\s+");
//        Map<String,Demon> listOfDemons = new LinkedHashMap<>();
//
//        //todo calculate health -> sum of All ASCI w/out [^0-9+-*/.]
//        for (int i = 0; i < input.length; i++) {
//            int totalHealth = 0;
//            Pattern HealthPattern = Pattern.compile("[^0-9+\\-*/.]");
//            Matcher healthMatcher = HealthPattern.matcher(input[i]);
//            while (healthMatcher.find()){
//                String currentChar = healthMatcher.group();
//                int valueOfChar = currentChar.toCharArray();
//            }
//
//        }
//
//
//
//    }
//}
