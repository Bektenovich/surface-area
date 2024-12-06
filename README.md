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
Cube (Side: 2.24)
Surface Area: 30.18
Volume: 11.28
------------
Cube (Side: 9.44)
Surface Area: 534.34
Volume: 840.43
------------
Cube (Side: 9.40)
Surface Area: 530.38
Volume: 831.10
------------
Cylinder (Radius: 6.49, Height: 13.66)
Surface Area: 821.23
Volume: 1806.07
------------
Sphere (Radius: 4.48)
Surface Area: 251.78
Volume: 375.66
------------
Cube (Side: 1.82)
Surface Area: 19.96
Volume: 6.07
------------
Cube (Side: 3.39)
Surface Area: 68.96
Volume: 38.96
------------
Cylinder (Radius: 2.76, Height: 13.33)
Surface Area: 279.07
Volume: 319.10
------------
Sphere (Radius: 5.30)
Surface Area: 352.87
Volume: 623.30
------------
Sphere (Radius: 3.84)
Surface Area: 185.72
Volume: 237.99
```
