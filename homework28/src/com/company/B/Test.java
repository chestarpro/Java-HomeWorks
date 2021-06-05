package com.company.B;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        Song song = new Song("Молмолум", "Малик Аликеев", "Кыргызский фольклор",
                """
                        Беттин көркү нур менен ай
                        Белдин көркү кур менен
                        Биз сүйгөн сулуу мөлмөлүм ай белгилүү болсун ыр менен
                        Эки илебиң кызыл гүл
                        Ачылгандай мөлмөлүм
                        Бир карасам жүрөккө от чачылгандай мөлмөлүм
                        Магдай чачың маргалаң жибегиңдей мөлмөлүм
                        Сенин ышкың баланын ай тилегиңдей мөлмөлүм
                        Өтүмдүүсүң өзгөндүн күрүчүндөй мөлмөлүм
                        Созулганың зергердин күмүшүндөй мөлмөлүм
                        Майиңдигиң жоргонун жүрүшүндөй мөлмөлүм
                        Гүлзар кылчы жүрөктүн ай какшып жаткан чөлдөрдүн
                        Гүлзар кылчы жүрөктүн ай какшып жаткан чөлдөрдүн
                        Гүлзар кылчы жүрөктүн ай какшып жаткан чөлдөрдүн
                        Гүлзар кылчы жүрөктүн ай какшып жаткан чөлдөрдүн
                        Гүлзар кылчы жүрөктүн ай какшып жаткан чөлдөрдүн
                        Гүйдүм мөлмөп аппагым ааламда сендей таппадым
                        Издеп-издеп күнү-түн "мөлмөлүм"-деп какшадым
                        Секин баскан бутуңдан сейдана мончок…""");

        FileWriter fileWriter = new FileWriter("Молмолум.txt");
        fileWriter.write("Name song: " + song.getName() + "\n");
        fileWriter.write("Singer: " + song.getSinger() + "\n");
        fileWriter.write("Genre: " + song.getGenre() + "\n");
        fileWriter.write("Lyrics: \n" + song.getLyrics() + "\n");
        fileWriter.close();

        FileReader fileReader = new FileReader("Молмолум.txt");
        Scanner sc = new Scanner(fileReader);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        fileReader.close();
    }
}
