package com.company;

public class Main {

    public static void main(String[] args) {

	System.out.println('a' + 'A');
    System.out.println("\"");
    System.out.println("what will be the result of this addition? " + 1 + 2 + 3);
    System.out.println(1 + 2 + 3 + " and what the resul of this addition?");
    System.out.println("what will be the result of this addition?" + (1 + 2 + 3));
    boolean boolExample = !(true);
    System.out.println(boolExample);

    //byte data type, so 8 bit integer
    //
    byte by = (byte)135;
    System.out.println(by);

    byte bySecond = (byte)256;
    System.out.println(bySecond);

    //why is there a mistake here?
   // int i = 12345678901234567;

    //why is there a mistake here?
   // long lg = 12345678901234567;

    //what's going on here
    char c = 0x6d;
    char d = 0155;
    System.out.println(c + " = " + d);

    double roundingExample = 2.0 - 1.9;
    System.out.println(roundingExample);

    //find the value of a variable
    int a = 1000000000;
    System.out.println("Here the variable has a value: " + a);

    a += 1000000000;
    System.out.println("Here the variable has a value: " + a);

    a += 1000000000;
    System.out.println("Here the variable has a value: " + a);

    a += 1000000000;
    System.out.println("Here the variable has a value: " + a);

    //what will be printed to the console after this program runs:
    System.out.println(2147483647 + 1);
    System.out.println(2147483647L + 1);

    int value = 123_45_67_89;
    System.out.println("Value of a variable is:" + value);

    int x1 = 40;
    int y1 = 10;

    x1 += y1;
    System.out.println("Now x1 has value: " + x1);

    x1 =+ y1;
    System.out.println("Now x1 has value: " + x1);

    int x = 899;
    short y = 10;

    x = y;
    }

}

