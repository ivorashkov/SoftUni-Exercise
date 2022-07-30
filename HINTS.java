public class HINTS {
//******** percentage **************
        // System.out.printf("%.2f%%%n", small / total * 100);

        //calculating total - percentage of it
      //  total = (int) Math.ceil(total - (total / 100.0 * percentage));
        //double removingPercent = total * ( percentInput / 100.0);


    //************** String/number input **********************
//      double currentPiece = 0; -> could be configured outside in case of math
    //actions outside the while loop;
//    String input = scanner.nextLine();
//        while(!input.equals("STOP")){
//         currentPiece = Double.parseDouble(input);
//          .....
//        input = scanner.nextLine();
//    }

    //**************another String/number input option***********
    //while ( a>b){
    //String input = scanner.nextLine();
    //if(input.equals("String"){
//    break;
//      }
    //int somethingElse = Integer.parseInt(input);
    //{do something}
//}
    //****************

    //************need Continue example**********************

//        String firstNum = scanner.nextLine();
//        String secondNum = scanner.nextLine();
//2345
// 6789

    //        for (int i = firstNum.charAt(0); i <= secondNum.charAt(0); i++) {
//            if (i % 2 == 0) continue;
//            for (int j = firstNum.charAt(1); j <= secondNum.charAt(1); j++) {
//                if (j % 2 == 0) continue;
//                for (int k = firstNum.charAt(2); k <= secondNum.charAt(2); k++) {
//                    if (k % 2 == 0) continue;
//                    for (int l = firstNum.charAt(3); l <= secondNum.charAt(3); l++) {
//                        if (l % 2 == 0) continue;
//
//                        System.out.printf("%c%c%c%c ", i, j, k, l);

    //need char example.
    //
    // *************************** charAt  ********************************
        //definirame - chakame string - iskame daden simvol ot daden string
    //char symbol = scanner.nextLine().charAt(0,1,2...etc)
    //int num = symbol - mojem da zapazim stoinostta v int


//        Scanner scanner = new Scanner(System.in);
//        char symbol = scanner.nextLine().charAt({position of});
//        int sum = symbol;
//        System.out.println(num);
//
//        String text = scanner.nextLine();
//
//        for (int i = 0; i <text.length() ; i++) {
//            char symbol = text.charAt(i);
//            if (symbol < 'A' && symbol > 'Z')//not latin alphabet
//                ((symbol >= 'A' && symbol <= 'Z') || (symbol >= 'a' && symbol <= 'z'))
//                //chars from latin alphabet
//                System.out.println(symbol); -> ignores non-alphabetic chars
//            }


    //+++++++++++++++++ continue example *************
//    String name = scanner.nextLine();
//
//    double sum = 0;
//    int y = 1;
//    int excluded = 0;
//        while (y <= 12) {
//        if (excluded > 1) {
//            break;
//        }
//
//        double grade = Double.parseDouble(scanner.nextLine());
//
//        if (grade < 4) {
//            excluded++;
//            continue;
//        }
//
//        sum = sum + grade;
//
//        y++;
//    }
//
//        if (excluded > 1) {
//        System.out.printf("%s has been excluded at %d grade%n", name, y);
//    } else {
//        double avgGrade = sum / 12;
//        System.out.printf("%s graduated. Average grade: %.2f%n", name, avgGrade);
//    }
//}


        // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//                      FIND ODD NUMBER for AMOUNT OF ITERATIONS
//        int number = Integer.parseInt(scanner.nextLine());
//        int sum = 0;
//
//
//        for (int i = 1; i <= number; i++) {
//                //important formula for oddNumber for each iteration
//                int oddNumber = 2 * i - 1;
//                System.out.println(oddNumber);
//                sum += oddNumber;
//
//
//        }
//        System.out.printf("Sum: %d", sum);


        //***********************REVERSE STRING *****************************

//        String input = scanner.nextLine();
//        String reverse = "";
//        for (int position = input.length() - 1; position >= 0; position--) {
//
//                char currentSymbol = input.charAt(position);
//                reverse += currentSymbol;
//        }



}