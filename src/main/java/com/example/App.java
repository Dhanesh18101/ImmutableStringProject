package com.example;

import java.io.FileReader;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {

        // Immutable String Example
        String s1 = "Hello";
        String s2 = s1.concat(" World");

        System.out.println("Original String: " + s1);
        System.out.println("New String: " + s2);

        // Copy text from source.txt to destination.txt
        FileReader fr = new FileReader("source.txt");
        FileWriter fw = new FileWriter("destination.txt");

        int ch;

        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }

        fr.close();
        fw.close();

        System.out.println("File copied successfully");
    }
}
