package BasicExercises.NestedLoops;

public class MultiplicationTable {
    public static void main(String[] args) {

        //Output - 11 12 13 14..21 22 23 24...
        for (int firstNum = 1; firstNum <= 10; firstNum++) {
            for (int secondNum = 1; secondNum <= 10; secondNum++) {
                System.out.printf("%d * %d = %d%n",
                        firstNum, secondNum, firstNum *secondNum);
            }
        }


    }
}
