import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Shape3DInterface> shapes = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int shapeType = random.nextInt(3); // 0 = Sphere, 1 = Cylinder, 2 = Cube
            switch (shapeType) {
                case 0 -> shapes.add(new Sphere(1 + random.nextDouble() * 9)); // Radius: 1 to 10
                case 1 -> shapes.add(new Cylinder(1 + random.nextDouble() * 9, 5 + random.nextDouble() * 15)); // Radius: 1 to 10, Height: 5 to 20
                case 2 -> shapes.add(new Cube(1 + random.nextDouble() * 9)); // Side: 1 to 10
            }
        }

        // Output the shapes and their properties
        for (Shape3DInterface shape : shapes) {
            System.out.println(shape);
            System.out.printf("Surface Area: %.2f%n", shape.surfaceArea());
            System.out.printf("Volume: %.2f%n%n", shape.volume());
        }
    }
}