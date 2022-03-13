package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BMIcalculator {
    public static void main(String[] args) throws IOException {

        float height, weight, bmi;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("This program will calculate your BMI(Body mass index)");
        System.out.println("Enter your height(cm):");
        height = Float.parseFloat(br.readLine())/100;
        System.out.println("Enter your weight(kg):");
        weight = Float.parseFloat((br.readLine()));

        bmi = (float) (weight / (Math.pow(height, 2)));
        System.out.printf("Your BMI is: " + "%2.2f, \n", bmi);

        if(bmi < 16){
            System.out.println("You are starving");
        } else if((bmi >= 16) && (bmi < 16.99)){
            System.out.println("You're emaciated");
        } else if((bmi >= 17) && (bmi < 18.49)) {
            System.out.println("You're underweight");
        } else if((bmi >= 18.50) && (bmi < 22.99)){
            System.out.println("Normal, low range");
        } else if((bmi >= 23) && (bmi < 24.99)){
            System.out.println("Normal, high range");
        } else if((bmi >= 25) && (bmi < 27.49)){
            System.out.println("Overweight, low range");
        } else if((bmi >= 27.50) && (bmi < 29.99)){
            System.out.println("Overweight, high range");
        } else if((bmi >= 30) && (bmi < 34.9)){
            System.out.println("1st degree obesity");
        } else if((bmi >= 35) && (bmi < 39.9)){
            System.out.println("2nd degree obesity");
        } else if(bmi >= 40){
            System.out.println("3rd dergree obesity");
        }


    }
}
