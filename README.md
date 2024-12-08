# 3D Shapes Polymorphism Project

## Description

This project demonstrates the concept of **polymorphism** in Java by creating an interface for 3D shapes and implementing it in different classes. The application performs the following tasks:

1. **Define an Interface:**  
   The `Shape3DInterface` defines two methods:  
   - `surfaceArea()`: Calculates and returns the surface area of the shape.  
   - `volume()`: Calculates and returns the volume of the shape.  

2. **Implement Classes for 3D Shapes:**  
   - `Sphere`: Implements the formulas for a sphere's surface area and volume.  
     - Surface Area: \( 4\pi r^2 \)  
     - Volume: \( \frac{4}{3}\pi r^3 \)  
   - `Cylinder`: Implements the formulas for a cylinder's surface area and volume.  
     - Surface Area: \( 2\pi r(r + h) \)  
     - Volume: \( \pi r^2 h \)  
   - `Cube`: Implements the formulas for a cube's surface area and volume.  
     - Surface Area: \( 6a^2 \)  
     - Volume: \( a^3 \)  

3. **Polymorphism:**  
   - Polymorphism is showcased by using a common interface reference (`Shape3DInterface`) to refer to different shape objects (`Sphere`, `Cylinder`, and `Cube`).  
   - This enables the program to dynamically invoke the `surfaceArea()` and `volume()` methods, regardless of the specific type of the object.  

4. **Random Object Generation:**  
   - The program generates random dimensions for shapes and creates an array of random 3D shape objects.  

5. **Output:**  
   - The program calculates and displays the surface area and volume of each shape.  

## How Polymorphism is Used

Polymorphism allows the program to handle multiple 3D shape objects (Sphere, Cylinder, and Cube) through a single reference type (`Shape3DInterface`). The program dynamically determines which method to invoke (specific to the shape) at runtime. This reduces redundancy and increases flexibility, as the code can be easily extended to include more shapes without modifying the core logic.

For example:
```java
Shape3DInterface shape = new Sphere(5);
System.out.println("Surface Area: " + shape.surfaceArea());
System.out.println("Volume: " + shape.volume());

Shape: Sphere
Radius: 4.2
Surface Area: 221.67
Volume: 310.06

Shape: Cylinder
Radius: 3.5, Height: 8.2
Surface Area: 263.89
Volume: 316.67

Shape: Cube
Side Length: 6.0
Surface Area: 216.0
Volume: 216.0
