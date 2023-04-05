package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world from Geometric branch project!");

        List<Shape> shapeList = new ArrayList<>();

        Shape shape1 = new Circle("red", 10, 5.0);
        Shape shape2 = new Square("red", 10, 20.0);
        shapeList.add(shape1);
        shapeList.add(shape2);

        for (Shape shape:
                shapeList) {
            shape.draw();
            shape.move(1,2);
            shape.rotate(3);
        }
    }
}