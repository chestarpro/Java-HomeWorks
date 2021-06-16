package com.company.A;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла: ");
        String name = scanner.nextLine();
        File file = new File(name);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write("some text");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null)
                    fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Введите новое расширение: ");
        String expansion = scanner.nextLine();
        int index = 0;
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == '.') {
                count++;
                index = i;
            }
        }
        if (count == 0) {
            file.renameTo(new File(name + "." + expansion));
            try {
                fileWriter = new FileWriter(file);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fileWriter != null)
                        fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } file.delete();
        } else {
            String oldExpansion = "";
            String name2 = "";
            for (int i = 0; i < index; i++) {
                name2 += name.charAt(i);
            }
            for (int i = index + 1; i < name.length(); i++) {
                oldExpansion += name.charAt(i);
            }
            if (!oldExpansion.equals(expansion)) {
                file.renameTo(new File(name2 + "." + expansion));
                try {
                    fileWriter = new FileWriter(file);
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if (fileWriter != null)
                            fileWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } file.delete();
            }
        }
    }
}
