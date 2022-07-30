package FundamentalsBasicSyntax.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManipulatorAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = stringToIntArrayList(scanner.nextLine().toLowerCase());

        String commands = scanner.nextLine().toLowerCase();
        while (!commands.equals("end")) {
            String[] token = commands.split("\\s+");

            if (token[0].equals("contains")) {
                //todo
                int contains = numbers.indexOf(Integer.parseInt(token[1]));
                if (contains == -1) {
                    System.out.println("No such number");
                } else {
                    System.out.println("Yes");
                }

            } else if (token[0].equals("print")) {
                //todo
                if (token[1].equals("even")) {
                    for (int number : numbers) {
                        if (number % 2 == 0) {
                            System.out.print(number + " ");
                        }
                    }
                    System.out.println();
                } else if (token[1].equals("odd")) {
                    for (int number : numbers) {
                        if (number % 2 != 0) {
                            System.out.print(number + " ");
                        }
                    }
                    System.out.println();
                }
            } else if (token[0].equals("get")) {
                //todo
                int sum = 0;
                for (int number : numbers) {
                    sum += number;
                }
                System.out.println(sum);
            } else if (token[0].equals("filter")) {
                int number = Integer.parseInt(token[2]);
                //todo
                List<Integer> filtered = new ArrayList<>();
                if (token[1].equals("=")) {
                    filtered = filteredEqualNumbers(numbers,number);
                } else if (token[1].equals(">=")) {
                    filtered = filteredBiggerOrEqualNumbers(numbers,number);
                } else if (token[1].equals("<=")) {
                    filtered = filteredSmallerOrEqualNumbers(numbers,number);
                } else if (token[1].equals("<")) {
                    filtered = filteredSmallerNumbers(numbers,number);
                } else if (token[1].equals(">")) {
                    filtered = filteredBiggerNumbers(numbers,number);
                }
                for (int n:filtered) {
                    System.out.print(n + " ");
                }
                System.out.println();
            }

            commands = scanner.nextLine().toLowerCase();
        }
    }

    private static List<Integer> filteredEqualNumbers(List<Integer> numbers, int number) {
//най-лесния вариант е да създадем нов лист и да тъпчем стойности в него;
        List<Integer> filteredNumbers = new ArrayList<>();
        for (int n : numbers) {
            if (n == number) {
                filteredNumbers.add(n);
            }
        }
        return filteredNumbers;
    }
    private static List<Integer> filteredBiggerOrEqualNumbers(List<Integer> numbers, int number) {
//най-лесния вариант е да създадем нов лист и да тъпчем стойности в него;
        List<Integer> filteredNumbers = new ArrayList<>();
        for (int n : numbers) {
            if (n >= number) {
                filteredNumbers.add(n);
            }
        }
        return filteredNumbers;
    }
    private static List<Integer> filteredSmallerOrEqualNumbers(List<Integer> numbers, int number) {
//най-лесния вариант е да създадем нов лист и да тъпчем стойности в него;
        List<Integer> filteredNumbers = new ArrayList<>();
        for (int n : numbers) {
            if (n <= number) {
                filteredNumbers.add(n);
            }
        }
        return filteredNumbers;
    }
    private static List<Integer> filteredSmallerNumbers(List<Integer> numbers, int number) {
//най-лесния вариант е да създадем нов лист и да тъпчем стойности в него;
        List<Integer> filteredNumbers = new ArrayList<>();
        for (int n : numbers) {
            if (n < number) {
                filteredNumbers.add(n);
            }
        }
        return filteredNumbers;
    }
    private static List<Integer> filteredBiggerNumbers(List<Integer> numbers, int number) {
//най-лесния вариант е да създадем нов лист и да тъпчем стойности в него;
        List<Integer> filteredNumbers = new ArrayList<>();
        for (int n : numbers) {
            if (n > number) {
                filteredNumbers.add(n);
            }
        }
        return filteredNumbers;
    }
    private static List<Integer> stringToIntArrayList(String input) {

        String[] stringNumbers = input.split("\\s+");
        List<Integer> numbers = new ArrayList<>();

        for (String s : stringNumbers) {
            numbers.add(Integer.parseInt(s));//insert from Array to List
        }
        return numbers;
    }
}
