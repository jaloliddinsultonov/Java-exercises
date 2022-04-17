package com.company;

public abstract class Bird extends Animal implements AnimalMove, AnimalName{
    String featherColor;

    Bird(){
        super();
        featherColor = "NN";
    }
    public Bird(String name, int age, int weight, String featherColor){
        super(name, age, weight);
        this.featherColor = featherColor;
    }
    public Bird(int age, String featherColor){
        super(age);
        this.featherColor = featherColor;
    }

    public void drinkWater(){
        System.out.println("Shshp Shshp");
    }

    @Override
    public void getVoice() {
        System.out.println("Bird is making sounds");
    }

    @Override
    public void eat(String foodName) {
        System.out.println("Bird is eating:" + foodName);
    }
}
