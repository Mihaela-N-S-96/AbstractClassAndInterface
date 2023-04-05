package org.example;public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        CarnivorAnimal carnivorAnimal = new CarnivorAnimal("brown", 20);
        IerbivorAnimal ierbivorAnimal = new IerbivorAnimal("white", 10);

        carnivorAnimal.eatMeat();
        System.out.println(carnivorAnimal.getAge());
        System.out.println(carnivorAnimal.getColor());
        ierbivorAnimal.eatGrass();

        Animal animal = new CarnivorAnimal("brown", 21);
        animal.sound();
        System.out.println(animal.getAge());


    }
}