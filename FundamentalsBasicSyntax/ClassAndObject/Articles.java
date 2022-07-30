package FundamentalsBasicSyntax.ClassAndObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Articles {

    static class Article {
        private String title;
        private String content;
        private String author;

        Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        void setTitle(String title) {
            this.title = title;
        }

        void setContent(String content) {
            this.content = content;
        }

        void setAuthor(String author) {
            this.author = author;
        }

        String getInfo() {
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> initialContent = new ArrayList<>(Arrays.asList(scanner.nextLine().split(",\\s")));
        int commandCount = Integer.parseInt(scanner.nextLine());
        Article article = new Article(initialContent.get(0), initialContent.get(1), initialContent.get(2));
        for (int i = 0; i < commandCount; i++) {
            String input = scanner.nextLine();
            String[] elements = input.split(":\\s");
            String command = elements[0];
            String condition = elements[1];

            if (command.equals("Edit")) {
                article.setContent(condition);
            } else if (command.equals("ChangeAuthor")) {
                article.setAuthor(condition);
            } else if (command.equals("Rename")) {
                article.setTitle(condition);
            }
        }

        System.out.println(article.getInfo());

    }
}
