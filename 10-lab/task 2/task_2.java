package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class task_2 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis;
        int bajt;

        try{
            fis = new FileInputStream("test123.text");
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }

        try{
            do {
                bajt = fis.read();
                if (bajt != -1) System.out.print((char) bajt);
            } while (bajt != -1);
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
