package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class task_3 {
    public static void main(String[] args) {
        int a;
        try (FileInputStream fs = new FileInputStream("new6.txt)"); FileOutputStream fot = new FileOutputStream("new6_remastered.txt")){
            do {
            a = fs.read();
            if(a == ' '){
                a = '-';
            }
            if(a != -1){
                fot.write(a);
            }
        } while (a != -1);
    } catch (IOException e) {
            System.out.println("Error!");
            e.printStackTrace();
        }
        }
}
