package de.beefcafe.oop.basics.polymorphism;

public class AnimalShelter {

    private Animal animal1;
    private Animal animal2;
    private Animal animal3;

    public AnimalShelter(Animal animal1, Animal animal2, Animal animal3) {
        this.animal1 = animal1;
//        System.out.println("1 " + (animal1 instanceof Dog));
        this.animal2 = animal2;
//        System.out.println("2 " + (animal2 instanceof Dog));
        this.animal3 = animal3;
//        System.out.println("3 " + (animal3 instanceof Dog));
    }

    public void visit() {
        animal1.makeNoise();
        // Achtung: Polymorphie (poly=viel, morphie=gestalt)
        // 1. Es gibt eine Methode, die von Subklassen überschrieben wird
        // 2. Die Methode wird auf der Oberklassen aufgerufen
        animal2.makeNoise();
        animal3.makeNoise();
    }

}

