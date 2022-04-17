package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

interface Salary{
    double salaryToPayJaloliddin56296(double hours, double rate);

    default double salaryForOvertimeJaloliddin56296(double overtimeHours, double rate){
        return 1;
    }

    static int bonus(int yearsOfExperience){
        if(yearsOfExperience >= 5){
            return 400;
        } else{
            return 0;
        }
    }
}

public class Main{

    public static void main(String[] args) throws IOException{
        Staff person = new Staff();
        person.initialize1Jaloliddin56296();
        person.print1Jaloliddin56296();

        double salary = person.salaryToPayJaloliddin56296(180, 25);
        System.out.println("The salary which was received by employee is " + salary);

        double salaryForOvertimeJaloliddin56296 = person.salaryForOvertimeJaloliddin56296(10, 40);
        System.out.println("The salary for overtime which was received by employee is " + salaryForOvertimeJaloliddin56296);

        int bonus = Salary.bonus(6);
        System.out.println("The bonus which was received by employee is " + bonus);
    }
}
class Staff extends Person implements Salary{
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

    @Override
    public double salaryToPayJaloliddin56296(double hours, double rate) {
        return hours * rate;
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