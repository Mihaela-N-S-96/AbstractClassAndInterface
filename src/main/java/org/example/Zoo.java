package org.example;

import java.util.List;

public class Zoo {

    private List<Animal> animals;

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public void feedAnimals(){
        for (Animal animal: animals) {
            animal.eat();
        }
    }

    public void sounds(){
        for (Animal animal: animals) {
            animal.maKeSound();
        }
    }
}
