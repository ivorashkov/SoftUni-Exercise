package FundamentalsBasicSyntax.DataTypesAndVariables;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int Y = Integer.parseInt(scanner.nextLine());

        int initialN = N;
        int pokeCount = 0;
        while (N >= M) {
            N -= M;
            pokeCount++;

            double halfNCheck = initialN / 2;
            if (N == halfNCheck && Y != 0) {
                N /= Y;
            }
        }
        System.out.println(N);
        System.out.println(pokeCount);

    }
}
