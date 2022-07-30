package AdvancedJava.Advanced.StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {

        String inPath = "C:\\Users\\User\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outputPath = "C:\\Users\\User\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\04.ExtractIntegersOutput.txt";

        Scanner reader = new Scanner(new FileInputStream(inPath));
        PrintWriter out = new PrintWriter(new FileOutputStream(outputPath));

        while (reader.hasNext()){
            if(reader.hasNextInt()) {
                int numberToOutput = reader.nextInt();
                out.println(numberToOutput);
            }
            reader.next();
        }
        out.close();
    }
}
