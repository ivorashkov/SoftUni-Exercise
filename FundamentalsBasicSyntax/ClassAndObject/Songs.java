package FundamentalsBasicSyntax.ClassAndObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Songs {

    static class Song {
        private String typeList;
        private String name;
        private String time;

        Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        boolean isType(String typeList) {
            return this.typeList.equals(typeList);
        }

        String getName() {
            return this.name;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Song> songs = new ArrayList<>();

        int numberOfSongs = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        for (int i = 0; i < numberOfSongs; i++) {
            String[] elements = input.split("_");
            String typeList = elements[0];
            String name = elements[1];
            String time = elements[2];

            songs.add(new Song(typeList, name, time));

            input = scanner.nextLine();
        }

        //lastRowCommand
        if (input.equals("all")) {
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songs) {

                //song.getTypeList().equals.(input)
                if (song.isType(input)) {
                    System.out.println(song.getName());
                }
            }

        }
    }
}
