# Polymorphism with 3D Shapes in Java

## Description
This project demonstrates polymorphism in Java by defining an interface for 3D shapes and implementing it in classes for `Sphere`, `Cylinder`, and `Cube`. Each shape calculates its surface area and volume using specific formulas.

## How Polymorphism Is Used
- The `Shape3DInterface` provides a common blueprint for all shapes.
- The `surfaceArea()` and `volume()` methods are implemented differently for each shape class.
- In the `Main` class, a single list of `Shape3DInterface` references is used to store and manage objects of different shapes.

## Usage
Run the `Main` class to generate random shapes and calculate their surface area and volume.

## Sample Output
```
Sphere (Radius: 5.23) Surface Area: 343.36 Volume: 597.95

Cylinder (Radius: 3.45, Height: 12.78) Surface Area: 350.74 Volume: 477.17

Cube (Side: 7.22) Surface Area: 313.51 Volume: 376.03
```
