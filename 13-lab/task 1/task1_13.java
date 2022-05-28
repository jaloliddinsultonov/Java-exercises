package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class task1_13 {

    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("src/com/company/listt.txt"));
        String line;
        while((line = br.readLine()) != null) {
                list.add(line);
        }
        System.out.println("Size of collection is: " + list.size());
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        for(String one:list){
            System.out.println(one);
        }
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
