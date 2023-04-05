package org.example;

public class Square extends GeometricShape{
    private double length;

    public Square(String color, int size, double length) {
        super(color, size);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    @Override
    public double area() {
        return length * length;
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
        System.out.println("Draw square");
    }

    @Override
    public void rotate(int degree) {
        System.out.println("Rotate square");
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Move square");
    }
}
