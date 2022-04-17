package com.company;


public class Pigeon extends Bird implements AnimalBehavior, AnimalMove{
    private String species;

    Pigeon(){
        super();
        species = "NN";
    }

    public Pigeon(String name, int age, int weight, String featherColor, String species){
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public void aport(){
        System.out.println("The bird is flying");
    }

    @Override
    public void drinkWater(){
        System.out.println("The bird is drinking water");
    }

    @Override
    public void getVoice(){
        System.out.println("The bird is chirping");
    }

    @Override
    public void eat(String foodName){
        System.out.println("The bird is eating" + foodName);
    }

    public String getSpecies(){
        return species;
    }

    public void setSpecies(String breed){
        this.species = species;
    }

    @Override
    public String toString(){
        return "Pigeon{" + "breed='" + species + '}';
    }

    @Override
    public void sleep() { System.out.println("Pigeon sleeps from 10 to 12 hours."); }

    @Override
    public void move() { System.out.println("Pigeons fly"); }
}
