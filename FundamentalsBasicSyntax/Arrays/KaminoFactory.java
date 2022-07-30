package FundamentalsBasicSyntax.Arrays;

import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int lengthDNA = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        int lineCount = 0;
        int bestStartIndex = Integer.MAX_VALUE;
        int[] bestDNaSample = new int[lengthDNA];
        int bestLineNum = 0;
        int bestOnes = 0;
        int bestSum = 0;
        int sum = 0;
        while (!input.equals("Clone them!")) {

            String[] values = input.split("!+");

            //пълнене на инт масива
            int[] currentLineSample = new int[lengthDNA];
            for (int i = 0; i < currentLineSample.length; i++) {
                currentLineSample[i] = Integer.parseInt(values[i]);
            }


            lineCount++; //ъпдейтваме номера на текущия ред
            int longestOnesInARow = 0; //поредица 1-ци на текущия ред
            int startIndex = Integer.MAX_VALUE;

            for (int i = 0; i < currentLineSample.length; i++) {
                int onesInARow = 0;
                for (int j = i; j < currentLineSample.length; j++) {
                    if (currentLineSample[i] == currentLineSample[j] && currentLineSample[i] == 1) {
                        onesInARow++;
                        if (onesInARow > longestOnesInARow) {
                            longestOnesInARow = onesInARow;
                            startIndex = i; //индекса на 1-ците на текщия ред
                        }
                    } else {
                        break;
                    }
                }
            }

            if (longestOnesInARow > bestOnes) {
                bestOnes = longestOnesInARow; //ъпдейтваме най-добрата последователност от 1-ци от всички редове до момента
                bestDNaSample = currentLineSample;
                bestLineNum = lineCount;
                bestStartIndex = startIndex; //най-добрия индекс 1-ци
            } else if (longestOnesInARow == bestOnes) {
                if (startIndex < bestStartIndex) {
                    bestDNaSample = currentLineSample;
                    bestLineNum = lineCount;
                    bestStartIndex = startIndex;
                } else if (startIndex == bestStartIndex) { //при равни посл. 1-ци и индекси проверяваме сумите на текущия и най-добрия до момента ред
                    for (int i = 0; i < bestDNaSample.length; i++) {
                        bestSum += bestDNaSample[i];
                    }
                    for (int i = 0; i < currentLineSample.length; i++) {
                        sum += currentLineSample[i];
                    }
                    if (sum > bestSum) {
                        bestDNaSample = currentLineSample;
                        bestLineNum = lineCount;
                        bestSum = sum;
                    }
                }
            }


            input = scanner.nextLine();
        }
        bestSum = 0; // да се избегне евентуален ред с по-голяма сума, но по-лоша последователност
        for (int i = 0; i < bestDNaSample.length; i++) {
            bestSum += bestDNaSample[i];
        }

        // проверка за само нулеви редове
        if (bestSum == 0) {
            bestLineNum = 1;
        }

        System.out.println(String.format("Best DNA sample %d with sum: %d.", bestLineNum, bestSum));
        for (int i = 0; i < bestDNaSample.length; i++) {
            System.out.print(bestDNaSample[i] + " ");

        }
    }
}