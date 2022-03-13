package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Calculator {
    public static void main(String[] args) throws IOException {
        float firstNumber, secondNumber, sum, substraction, product, quotient;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The program calculates sum, difference, product and quotient for two numbers.");
        System.out.println("Enter the first Number:");
        firstNumber = Float.parseFloat(br.readLine());
        System.out.println("Enter the second Number:");
        secondNumber = Float.parseFloat(br.readLine());

        sum = firstNumber + secondNumber;
        substraction = firstNumber - secondNumber;
        product = firstNumber * secondNumber;
        quotient = firstNumber / secondNumber;

        System.out.printf("First Number: " + "%2.2f", firstNumber);
        System.out.printf("\nSecond Number: " + "%2.2f", secondNumber);

        System.out.println();

        System.out.printf("Sum = " + "%2.2f, \n", + sum);
        System.out.printf("Subtstractoin = " + "%2.2f, \n", + substraction);
        System.out.printf("Product = " + "%2.2f, \n", + product);
        System.out.printf("Quotient = " + "%2.2f, \n", + quotient);
    }
}
