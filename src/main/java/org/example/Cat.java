package org.example;

public class Cat implements Animal{


    public void eat() {
        System.out.println("Cat eat fish");
    }


    public void move() {
        System.out.println("Cat can climb");
    }


    public void maKeSound() {
        System.out.println("Cat make mew");
    }

    public void sleep(long milliseconds) {
        System.out.println("Cat sleeps.");
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("Cat wakes up!");
        }
    }

    public void mew(){
        System.out.println("Cat mew");
    }
}
