package de.beefcafe.oop.basics.polymorphism;

public class Main {

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Dog dog1 = new Dog();
        Animal animal2 = new Animal();
        AnimalShelter shelter = new AnimalShelter(animal1, dog1, animal2);
        shelter.visit();
    }
}
