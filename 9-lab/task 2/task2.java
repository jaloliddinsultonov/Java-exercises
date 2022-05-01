package com.company;

public class task2 {
    public static void main(int args){
        int array[] = new int[8];
        try {
                arifexception.arifexception1();
        } catch (ArithmeticException e) {
            System.out.println("Division by 0 is an arithmetic exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The index doesn't exist");
        } finally {
            System.out.println("You are done");
        }
    }
}
