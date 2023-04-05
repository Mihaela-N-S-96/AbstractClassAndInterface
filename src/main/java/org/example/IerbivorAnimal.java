package org.example;

public class IerbivorAnimal extends Animal implements Ierbivor{

    public IerbivorAnimal(String color, int age){
        super(color, age);
    }

    public void sound(){
        System.out.println("Sound of this animal is not so strong");
    }

    public void eatGrass(){
        System.out.println("This animal is ierbivor and eat grass");
    }

}
