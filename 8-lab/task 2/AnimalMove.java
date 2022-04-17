package com.company;

public interface AnimalMove {
    default void move(){
        System.out.println("Animals move");
    }
}
