package com.company;

import java.io.*;

public class DataManagement {
    String fullname;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    void ReadData() throws IOException {
        System.out.println("Fill your full name");
        fullname = br.readLine();
    }

    void WriteDataToFile(){
        try(FileWriter fw = new FileWriter("task4_file.txt")){
            fw.write(fullname);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void ReadDataFromFile(){
        try(BufferedReader br = new BufferedReader(new FileReader("task4_file.txt")){

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
