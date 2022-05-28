package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class task2_13 {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("src/com/company/listt.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        System.out.println("Size of collection is: " + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for(String one:list){
            System.out.println(one);
        }
        HashSet<String> set = new HashSet<String>(list);

        List<String> newlist = new ArrayList<>(set);
        System.out.println("----------------------------------");
        System.out.println("List after removing duplicated elements: ");
        for (Object ob:newlist)
            System.out.println(ob);
    }
}
