package com.company;

import java.awt.*;
import java.net.spi.URLStreamHandlerProvider;

enum ShapeType{
    SQUARE, RECTANGLE, CIRCLE, TRAPEZIUM, RHOMBUS, TRIANGLE, OVAL, HEXAGON
}

public class ShowEnum {
    public static void main(String[] args){
        for(ShapeType s : ShapeType.values()){
            System.out.println(s + " for the value" + s.ordinal() + "\n");
        }
    }
}
