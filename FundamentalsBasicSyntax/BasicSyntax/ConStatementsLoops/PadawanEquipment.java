package FundamentalsBasicSyntax.BasicSyntax.ConStatementsLoops;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double availableMoney = Double.parseDouble(scanner.nextLine());
        int studentsNumber = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());
        double freeBelts=0;

        for (int i = 1; i <=studentsNumber ; i++) {
            if (i % 6 ==0){
                freeBelts +=1;
            }
        }

        double totalPrice = lightsaberPrice * (studentsNumber + Math.ceil(studentsNumber * 0.10))
                + robePrice * (studentsNumber) + beltPrice * (studentsNumber - freeBelts);

        if (totalPrice <= availableMoney){

            System.out.printf("The money is enough - it would cost %.2flv.%n",totalPrice);

        }else if (totalPrice > availableMoney){

            System.out.printf("George Lucas will need %.2flv more.", Math.abs(totalPrice - availableMoney));
        }
    }
}
