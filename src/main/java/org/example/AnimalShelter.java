package org.example;

import java.util.List;

public class AnimalShelter {

    private List<Animal> animals;

    public AnimalShelter(List<Animal> animals) {
        this.animals = animals;
    }

    public void moveAnimalsToNewLocation(){
        for (Animal animal:
             animals) {
            animal.move();
        }
    }
}
