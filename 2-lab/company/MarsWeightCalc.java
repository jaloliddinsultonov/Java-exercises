package com.company;

public class MarsWeightCalc {
    public static void main(String[] args) {
        float earthWeight;
        float marsWeight;
        double marsWeightInDouble;
        int marsWeightInInt;

        earthWeight = 84;
        marsWeight = (earthWeight * 0.38F);
        System.out.println(earthWeight + " kg on Earth is " + marsWeight + "kg on Mars");

        //assigment (compatible types) from float to double
        marsWeightInDouble = marsWeight;
        System.out.println("Kilograms on Mars after converting to double " + marsWeightInDouble);

        //printing a variable limiting the length of printing to 4 decimal places
        System.out.printf("Kilograms on Mars displayed to four decimal places: %.4f %n", marsWeightInDouble);

        //a floating point type cast to integer
        marsWeightInInt = (int)marsWeightInDouble;
        System.out.println("Kilograms on Mars when casted to integer " + marsWeightInInt);

        //casting an int type to char
        char c  = (char)marsWeightInInt;
        System.out.println("The ASCII table equivalent of marsWeightInInt is: " + c);

        //assign the value of performing some mathematical operation on the char character to the int variable
        int exampleOfMathOnChar = c* c;
        System.out.println("An example of a mathematical operation on the char type: "+ exampleOfMathOnChar);

    }
}
