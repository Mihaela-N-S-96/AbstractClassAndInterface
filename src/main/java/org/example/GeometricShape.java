package org.example;

public abstract class GeometricShape implements Shape {

    private String color;
    private int size;

    public GeometricShape(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public abstract double area();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
