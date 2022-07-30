package FundamentalsBasicSyntax.FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogic_03 {
    static class Hero {
        String name;
        int hp = 0;//max 100
        int mp = 0;//max 200

        public Hero(String name, int hp, int mp) {
            this.name = name;
            this.hp = hp;
            this.mp = mp;
        }

        public String getName() {
            return name;
        }

        public int getHp() {
            return hp;
        }

        public void setHp(int hp) {
            this.hp = hp;
        }

        public int getMp() {
            return mp;
        }

        public void setMp(int mp) {
            this.mp = mp;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfHeroes = Integer.parseInt(scanner.nextLine());
        Map<String, Hero> mapOfHeroes = new LinkedHashMap<>();
        for (int i = 0; i < numberOfHeroes; i++) {
            String[] heroInfo = scanner.nextLine().split("\\s+");
            String heroName = heroInfo[0];
            int heroHp = Integer.parseInt(heroInfo[1]);
            int heroMana = Integer.parseInt(heroInfo[2]);

            mapOfHeroes.put(heroName, new Hero(heroName, heroHp, heroMana));
        }

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] commands = input.split("\\s-\\s");
            String action = commands[0];
            String heroName = commands[1];

            if (action.equals("CastSpell")) {
                int mp = Integer.parseInt(commands[2]);
                String spellName = commands[3];

                castSpell(mapOfHeroes, heroName, mp, spellName);

            } else if (action.equals("TakeDamage")) {
                int damage = Integer.parseInt(commands[2]);
                String attacker = commands[3];

                takeDamage(mapOfHeroes, heroName, damage, attacker);

            } else if (action.equals("Recharge")) {
                int amountMana = Integer.parseInt(commands[2]);

                recharge(mapOfHeroes, heroName, amountMana);

            } else if (action.equals("Heal")) {
                int amountHp = Integer.parseInt(commands[2]);

                heal(mapOfHeroes, heroName, amountHp);

            }

            input = scanner.nextLine();
        }


        for (Hero hero : mapOfHeroes.values()) {
            System.out.println(hero.getName() + System.lineSeparator() +
                    "  HP: " + hero.getHp() + System.lineSeparator() +
                    "  MP: " + hero.getMp());
        }
        /*for (Map.Entry<String,Hero>entry: mapOfHeroes.entrySet()) {
            System.out.println(entry.getValue().getName());
            System.out.println("  HP: " + entry.getValue().getHp());
            System.out.println("  MP: " + entry.getValue().getMp());
        }*/

    }

    private static void castSpell(Map<String, Hero> mapOfHeroes, String heroName, int manaPoints, String spellName) {
        Hero hero = mapOfHeroes.get(heroName);

        if (hero.getMp() >= manaPoints) {
            hero.setMp(hero.getMp() - manaPoints);
            System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, hero.getMp());
        } else {
            System.out.printf("%s does not have enough MP to cast %s!%n", hero.getName(), spellName);
        }
    }

    private static void takeDamage(Map<String, Hero> mapOfHeroes, String heroName, int damage, String attacker) {
        Hero hero = mapOfHeroes.get(heroName);

        hero.setHp(hero.getHp() - damage);
        if (hero.getHp() > 0) {
            System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, hero.getHp());
        } else {
            System.out.printf("%s has been killed by %s!%n", heroName, attacker);
            mapOfHeroes.remove(heroName);
        }

    }

    private static void recharge(Map<String, Hero> mapOfHeroes, String heroName, int amountMana) {
        Hero hero = mapOfHeroes.get(heroName);

        int oldManaPoints = hero.getMp();
        int newManaPoints = Math.min(hero.getMp() + amountMana, 200);//вземаме по-малкото или ако надскочи вземаме 200.
        hero.setMp(newManaPoints);

        int amountRecovered = newManaPoints - oldManaPoints;
        System.out.printf("%s recharged for %d MP!%n", hero.getName(), amountRecovered);

    }

    private static void heal(Map<String, Hero> mapOfHeroes, String heroName, int amountHp) {
        Hero hero = mapOfHeroes.get(heroName);

        int oldHp = hero.getHp();
        int newHp = Math.min(hero.getHp() + amountHp, 100);//вземаме по-малкото или ако надскочи вземаме 200.
        hero.setHp(newHp);

        int amountRecovered = newHp - oldHp;
        System.out.printf("%s healed for %d HP!%n", heroName, amountRecovered);
    }
}
