package FundamentalsBasicSyntax.ClassAndObject;

import java.util.*;

public class Articles_2 {

    static class Article {
        private String title;
        private String content;
        private String author;

        Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        String getTitle(){
            return this.title;
        }
        String getContent(){
            return this.content;
        }
        String getAuthor(){
            return this.author;
        }
        String getInfo() {
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Article> article = new ArrayList<>();
        int commandCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < commandCount; i++) {
            List<String> contentInfo = new ArrayList<>(Arrays.asList(scanner.nextLine().split(",\\s")));
            article.add(new Article(contentInfo.get(0), contentInfo.get(1),contentInfo.get(2)));

        }
        String command = scanner.nextLine();

        if (command.equals("title")){
            //{listName}.sort(Comparator.comparing({ClassName}::{getMethodName}));
            article.sort(Comparator.comparing(Article::getTitle));
        }else if (command.equals("content")){
            article.sort(Comparator.comparing(Article::getContent));
        }else if (command.equals("author")){
            //article -> List<Article>
            //(Class)Article::getAuthor(getter)
            article.sort(Comparator.comparing(Article::getAuthor));
        }


        for (Article ar:article) {
            System.out.println(ar.getInfo());
        }

    }
}
