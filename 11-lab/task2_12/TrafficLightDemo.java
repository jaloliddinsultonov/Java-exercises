package com.company;

enum TrafficLightColor {
    RED, GREEN, YELLOW
}

class TrafficLightSimulator {
    TrafficLightColor tlc  = TrafficLightColor.RED;

    public void changeColor(){
        switch (tlc){
            case RED:
                tlc = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor.RED;
                break;
            case GREEN:
                tlc = TrafficLightColor.YELLOW;
                break;
        }
    }
    public String toString() {
        return " " + tlc;
    }
}

public class TrafficLightDemo {
    public static void main(String[] args) {
        TrafficLightSimulator t1 = new TrafficLightSimulator();
        for(int i = 0; i < 9; i++){
            System.out.println(t1);
            t1.changeColor();
        }
    }
}
