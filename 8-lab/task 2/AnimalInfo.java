package com.company;

public class AnimalInfo {
    public static void main(String[] args){
        Animal animal[] = new Animal[6];

        animal[0] = new Dog("Alabay", 3, 20, "Carnivora", "Bo'ribosar");



        AnimalBehavior AnimalBehavior[] = new AnimalBehavior[3];

        AnimalBehavior[0] = new Dog("Alabay", 4, 23, "Carnivora", "Bo'ribosar");
        AnimalBehavior[1] = new Pigeon("Pablo", 18, 2, "Black", "spain");
        AnimalBehavior[2] = new BlowFish("Blowfish", 3, 4, "grey and white", 11);

        for (Animal a : animal) {
            a.move();
        }

        for (Animal a : animal) {
            AnimalName.name(a.getName());
        }
    }
}
