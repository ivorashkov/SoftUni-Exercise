package AdvancedJava.Advanced.StreamsFilesAndDirectories;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Objects;

public class GetFolderSize {
    public static void main(String[] args) throws IOException {
        File folder = new File("C:\\Users\\User\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources");
        ArrayDeque<File> dirs = new ArrayDeque<>();
        dirs.offer(folder);

        int sumBytes = 0;
        while (!dirs.isEmpty()) {
            File current = dirs.poll();
            File[] nestedFiles = current.listFiles();
            for (File f : Objects.requireNonNull(nestedFiles)) {
                if (f.isDirectory()) {
                    dirs.offer(f);
                }
                else {
                    sumBytes += f.length();
                }
            }
        }
        System.out.println("Folder size: " + sumBytes);
    }
}
