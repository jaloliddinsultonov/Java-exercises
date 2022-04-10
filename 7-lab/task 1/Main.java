package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws IOException{
        Staff person = new Staff();
        person.initialize1Jaloliddin56296();
        person.print1Jaloliddin56296();
    }
}
class Staff extends Person{
    String educationJaloliddin56296;
    String positionJaloliddin56296;
    public void initialize1Jaloliddin56296() throws IOException{
        Scanner sc = new Scanner(System.in);
        initializeJaloliddin56296();
        System.out.println("Education: ");
        educationJaloliddin56296 = sc.nextLine();
        System.out.println("Position: ");
        positionJaloliddin56296 = sc.nextLine();
    }

    public void print1Jaloliddin56296()
    {
        printJaloliddin56296();
        System.out.println("Education: " + educationJaloliddin56296);
        System.out.println("Position: " + positionJaloliddin56296);
    }

}

class Person {
    String surnameJaloliddin56296;
    String firstNameJaloliddin56296;
    String streetJaloliddin56296;
    String zipCodeJaloliddin56296;
    String cityJaloliddin56296;

    public void initializeJaloliddin56296() throws IOException
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Surname:");
        surnameJaloliddin56296 = sc.nextLine();
        System.out.println("FirstName:");
        firstNameJaloliddin56296 = sc.nextLine();
        System.out.println("Street:");
        streetJaloliddin56296 = sc.nextLine();
        System.out.println("zipCode:");
        zipCodeJaloliddin56296 = sc.nextLine();
        System.out.println("City:");
        cityJaloliddin56296 = sc.nextLine();
    }
    public void printJaloliddin56296()
    {
        System.out.println("Surname: " + surnameJaloliddin56296);
        System.out.println("Surname: " + surnameJaloliddin56296);
        System.out.println("FirstName: " + firstNameJaloliddin56296);
        System.out.println("Street: " + streetJaloliddin56296);
        System.out.println("zipCode: " + zipCodeJaloliddin56296);
        System.out.println("City: " + cityJaloliddin56296);
    }
}