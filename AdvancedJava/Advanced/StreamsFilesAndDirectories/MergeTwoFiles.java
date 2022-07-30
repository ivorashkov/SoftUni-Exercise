package AdvancedJava.Advanced.StreamsFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        Path inputOne = Paths.get("C:\\Users\\User\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt");
        Path inputTwo = Paths.get("C:\\Users\\User\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt");
        Path result = Paths.get("C:\\Users\\User\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\result.txt");

        List<String> linesInFiles = new ArrayList<>();
        linesInFiles.addAll(Files.readAllLines(inputOne));
        linesInFiles.addAll(Files.readAllLines(inputTwo));
        Files.write(result, linesInFiles);

    }
}
