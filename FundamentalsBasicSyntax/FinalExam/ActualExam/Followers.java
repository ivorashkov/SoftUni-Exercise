package FundamentalsBasicSyntax.FinalExam.ActualExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Followers {
    static class User {
        int likes;
        int comments;

        public User(int likes, int comments) {
            this.likes = likes;
            this.comments = comments;
        }

        public int getLikes() {
            return likes;
        }

        public void setLikes(int likes) {
            this.likes = likes;
        }

        public int getComments() {
            return comments;
        }

        public void setComments(int comments) {
            this.comments = comments;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, User> mapOfUsers = new LinkedHashMap<>();
        while (!input.equals("Log out")) {
            String[] commands = input.split(": ");
            String command = commands[0];//new followe//Like etc.

            if (command.equals("New follower")) {
            String userName = commands[1];

            User currentUser = mapOfUsers.get(userName);
            if (currentUser == null){//добавяме само когато го няма
                mapOfUsers.put(userName, new User(0,0));
            }

            } else if (command.equals("Like")) {
                String userName = commands[1];
                int likes =  Integer.parseInt(commands[2]);
                User currentUser = mapOfUsers.get(userName);

                if (currentUser == null){
                    mapOfUsers.put(userName,new User(likes, 0));
                }else{
                    currentUser.setLikes(currentUser.getLikes() + likes);
                }

            } else if (command.equals("Comment")) {
                String userName = commands[1];
                User currentUser = mapOfUsers.get(userName);
                if (currentUser == null){
                    mapOfUsers.put(userName,new User(0, 1));
                }else{
                    currentUser.setComments(currentUser.getComments() + 1);
                }

            } else if (command.equals("Blocked")) {
                String userName = commands[1];
                User currentUser = mapOfUsers.get(userName);

                if (currentUser == null){
                    System.out.printf("%s doesn't exist.%n",userName);
                }else{
                    mapOfUsers.remove(userName);
                }

            }
            input = scanner.nextLine();
        }

        System.out.printf("%d followers%n",mapOfUsers.size());
        for (Map.Entry<String,User>entry:mapOfUsers.entrySet()) {
            System.out.printf("%s: %d%n",entry.getKey(),entry.getValue().getLikes() + entry.getValue().getComments());
        }
    }
}
