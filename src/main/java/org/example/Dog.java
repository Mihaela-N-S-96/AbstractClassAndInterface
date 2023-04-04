package org.example;

public class Dog implements Animal{


    public void eat() {
        System.out.println("Dog eat meet");
    }


    public void move() {
        System.out.println("Dog run faster that cat");
    }

    public void maKeSound() {
        System.out.println("Dog make wof");
    }

    public void sleep(long milliseconds) {
        System.out.println("Dog sleeps.");
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("Dog wakes up!");
        }
    }

    public void ham() {
        System.out.println("Dog ham!");
    }
}
