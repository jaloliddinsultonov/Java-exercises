package com.company;

public class Fish extends Animal{
    public String scaleColor;

    public Fish(){
        super();
        scaleColor = "NN";
    }

    public Fish(String name, int age, int weight, String scaleColor){
        super(name, age, weight);
        this.scaleColor = scaleColor;
    }

    public Fish(int age, String scaleColor){
        super(age);
        this.scaleColor = scaleColor;
    }

    public void drinWater(){
        System.out.println("Siup Siup");
    }

    @Override
    public void getVoice() {
        System.out.println("Fish is making sounds");
    }

    @Override
    public void eat(String foodName) {
        System.out.println("Mammal is eating:" + foodName);
    }

    public String getScaleColor(){
        return scaleColor;
    }

    public void setScaleColor(String order){
        this.scaleColor = scaleColor;
    }

    @Override
    public String toString(){
        return "Mammal{" + "order='" + scaleColor + '\'' + '}';
    }




}
