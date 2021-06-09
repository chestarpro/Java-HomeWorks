package com.company.vb;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("file.txt");
        FileWriter fileWriter = new FileWriter("file4.txt");
        Scanner sc = new Scanner(fileReader);
        String str = null;
        while (sc.hasNextLine()) {
            str = sc.nextLine();
            str = str.replaceAll("\\s+","");
            fileWriter.write(str + "\n");
        }
        fileReader.close();
        fileWriter.close();
    }
}
