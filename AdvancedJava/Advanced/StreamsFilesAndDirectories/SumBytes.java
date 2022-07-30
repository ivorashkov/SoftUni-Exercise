package AdvancedJava.Advanced.StreamsFilesAndDirectories;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SumBytes {
    public static void main(String[] args) throws IOException {
        Path inPath = Paths.get("C:\\Users\\User\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");
        BufferedReader reader = Files.newBufferedReader(inPath);

        String line;
        long sum = 0;
        while ((line = reader.readLine()) != null) {
            for (char c : line.toCharArray()) {
                sum += c;
            }
        }
        System.out.println(sum);
    }
}
