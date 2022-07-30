package AdvancedJava.Advanced.StreamsFilesAndDirectories;

import java.io.*;

public class AllCapitals {
    public static void main(String[] args) throws IOException {
        String inPath = "C:\\Users\\User\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String outputPath = "C:\\Users\\User\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";

        BufferedReader reader = new BufferedReader(new FileReader(inPath));
        PrintWriter writer = new PrintWriter(new FileWriter(outputPath));

        String line;
        while ((line = reader.readLine()) != null) {
            line = line.toUpperCase();
            writer.println(line);
        }
        writer.close();
    }
}
