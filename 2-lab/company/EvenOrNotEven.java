package com.company;

public class EvenOrNotEven {
    public static void main(String[] args) {

        //generating a random number between 1 and 100
        int randomNumber = (int) (Math.random() * (100 - 1));

        //checking if it is even or odd
        if(randomNumber%2 == 0){
            System.out.println(randomNumber + " is an even number");
        } else {
            System.out.println(randomNumber + " is an odd number");
        }

    }
}
