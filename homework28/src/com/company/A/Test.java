package com.company.A;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("Bob Marley - Sun Is Shining.txt");
        fileWriter.write("Name song: Sun Is Shining\n");
        fileWriter.write("Singer: Bob Marley\n");
        fileWriter.write("Genre: Reggy\n");
        fileWriter.write("""
                Lyrics:
                Sun is shining, the weather is sweet, yeah
                Make you wanna move your dancing feet now
                To the rescue, here I am
                Want you to know, y'all, can you understand?""");
        fileWriter.close();

        FileReader fileReader = new FileReader("Bob Marley - Sun Is Shining.txt");
        Scanner scanner = new Scanner(fileReader);
        int count = 1;
        String temp = "";
        Song song = new Song();
        while (scanner.hasNextLine()) {
            temp = scanner.nextLine();
            if(count == 1) {
                song.setName(temp);
            }
            if(count == 2) {
                song.setSinger(temp);
            }
            if(count == 3) {
                song.setGenre(temp);
            }
            if(count >= 4) {
                if(song.getLyrics() == null) {
                    song.setLyrics("");
                }
                song.setLyrics(song.getLyrics() + temp + "\n");
            }
            count++;
        }
        fileReader.close();
        System.out.println(song);
    }
}
