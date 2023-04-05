package org.example;

public class Circle extends GeometricShape{
    private double radius;


    public Circle(String color, int size, double radius) {
        super(color, size);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public int getSize() {
        return super.getSize();
    }

    @Override
    public void setSize(int size) {
        super.setSize(size);
    }


    @Override
    public void draw() {
        System.out.println("Draw circle");
    }

    @Override
    public void rotate(int degree) {
        System.out.println("Rotate circle");
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Move circle");
    }
}
