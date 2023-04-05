package org.example;

public class CarnivorAnimal extends Animal implements Carnivor{

    public CarnivorAnimal(String color, int age){
        super(color, age);
    }

    public void eatMeat(){
        System.out.println("This animal is carnivor and eat meat");
    }

    @Override
    public void sound(){
        System.out.println("This animal has a strong sound");
    }



}
