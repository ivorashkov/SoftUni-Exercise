package FundamentalsBasicSyntax.MidExam.ActualExam;

import java.util.Scanner;


public class Test {

    static class Student {
        int age;
        private int ID;
        private String name;
        private String gender;





    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int a = 10;
//        int b = 2;
//
//        print(a,b);
//        int result = a + b;
//        System.out.println(result);

//        int[] array = new int[]{1, 2, 3, 5};
//
//        for (int num: array) {
//            System.out.print(num);
//        }
//        System.out.println();
//
//        printArray(array);
//
//        System.out.println();
//
//        for (int num: array) {
//            System.out.print(num);
//        }

//        String[] names = new String[]{"Ivo", "Alex", "Koce", "Nemi"};
//        String name = "IvayloNeStava";
//
//        System.out.println(name);
//
//
//        printString(name);
//
//        System.out.println(name);


    }


    static void printString(String name) {
        name = "KoStaBrat";
        System.out.println(name);
    }

    static void printArray(int[] array) {
        array[0] = 66;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    static void print(int a, int b) {
        a = 11;
        b = 12;
        System.out.println(a + b);
    }
}
