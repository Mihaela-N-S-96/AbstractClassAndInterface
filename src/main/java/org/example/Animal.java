package org.example;

public abstract class Animal {

    private String color;
    private int age;

    public abstract void sound();

    public Animal(String color, int age){
        this.color=color;
        this.age=age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //fa o lista cu varstele animalelor >20 ani si printeaz-o

}
