package FundamentalsBasicSyntax.ArrayList;

import java.sql.Array;
import java.util.*;

public class AppendArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> inputRow = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\|+")));

//        List<String> getRow = new ArrayList<>();
//        for (int i = inputRow.size() - 1; i >= 0; i--) {
//            String[] nums = inputRow.get(i).split("\\s+");
//            for (int j = 0; j < nums.length; j++) {
//                getRow.add(nums[j]);
//            }
//        }
//
//        int i = 0;
//        while (i < getRow.size()){
//            if (getRow.get(i).equals("")){
//                getRow.remove(i);
//            }else{
//                i++;
//            }
//        }

        //getRow.forEach(number-> System.out.print(number + " "));
        Collections.reverse(inputRow);
        System.out.println(inputRow.toString().replaceAll("\\[+", "")
                .replaceAll("]", "")
                .replaceAll("\\|+", "")
                .replaceAll(",", "").trim()
                .replaceAll("\\s+"," ")
                );
    }
}

