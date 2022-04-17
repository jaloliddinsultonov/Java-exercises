package com.company;

abstract class Animal implements AnimalMove, AnimalName{
    private String name;
    private int weight;
    private int age;

    public Animal(){
        age = weight = 0;
        name = "NN";
    }

    public Animal(String name, int age, int weight){
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public Animal(int age){
        this.age = age;
    }

    public abstract void eat(String foodName);
    public abstract void getVoice();

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }
}
