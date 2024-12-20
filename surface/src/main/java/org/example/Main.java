package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Shape3DInterface> shapes = new ArrayList<>();
        Random random = new Random();

        // Generate random shapes
        for (int i = 0; i < 10; i++) {
            int shapeType = random.nextInt(3); // 0 = Sphere, 1 = Cylinder, 2 = Cube
            switch (shapeType) {
                case 0 -> shapes.add(new Sphere());
                case 1 -> shapes.add(new Cylinder());
                case 2 -> shapes.add(new Cube());
            }
        }

        // Display shape details
        for (Shape3DInterface shape : shapes) {
            System.out.println(shape);
            System.out.printf("Surface Area: %.2f%n", shape.surfaceArea());
            System.out.printf("Volume: %.2f%n", shape.volume());
            System.out.println("------------");
        }
    }
}
