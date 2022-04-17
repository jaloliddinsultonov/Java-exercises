package com.company;

public class Dog extends Mammal implements AnimalMove, AnimalBehavior{
    private String breed;

    Dog(){
        super();
        breed = "NN";
    }

    public Dog(String name, int age, int weight, String order, String breed){
        super(name, age, weight, order);
        this.breed = breed;
    }

    public void aport(){
        System.out.println("The dog is retrieving");
    }

    @Override
    public void drinkMilk(){
        System.out.println("The dog is drinking milk");
    }

    @Override
    public void getVoice(){
        System.out.println("The dog is barking");
    }

    @Override
    public void eat(String foodName){
        System.out.println("The dog is eating" + foodName);
    }

    public String getBreed(){
        return breed;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    @Override
    public String toString(){
        return "Dog{" + "breed='" + breed + '}';
    }

    @Override
    public void sleep() { System.out.println("Dogs sleep from 12 to 14 hours"); }

    @Override
    public void move() { System.out.println("Dogs run"); }
}
