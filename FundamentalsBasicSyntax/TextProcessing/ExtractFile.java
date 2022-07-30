package FundamentalsBasicSyntax.TextProcessing;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int indexOfExtension = text.lastIndexOf(".");

        StringBuilder extension = new StringBuilder();
        extension.append(text.substring(indexOfExtension + 1));

        int indexOfFile = text.lastIndexOf("\\");
        StringBuilder fileName = new StringBuilder();
        fileName.append(text.substring(indexOfFile + 1,indexOfExtension));

        System.out.println("File name: "+ fileName.toString());
        System.out.println("File extension: " + extension.toString());
    }
}
