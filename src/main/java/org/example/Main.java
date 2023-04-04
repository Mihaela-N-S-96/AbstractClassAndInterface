package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        Animal animal = new Cat();
//        animal.eat();
//        animal.sleep(6000);
//
//        Animal dog = new Dog();
//        dog.move();
//        dog.sleep(2000);
List<Animal> animalList = new ArrayList<>();
animalList.add(new Cat());
animalList.add(new Dog());

        Zoo zooAnimal = new Zoo(
                List.of(
                        new Cat(),
                        new Dog()
                )
        );

        zooAnimal.feedAnimals();
        zooAnimal.sounds();

        AnimalShelter animals = new AnimalShelter(
                List.of(
                        new Cat(),
                        new Dog()
                )
        );
        animals.moveAnimalsToNewLocation();

    }
}