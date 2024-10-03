package oopcodes;

//Interface
interface Drawable {
 void draw();
}

//Abstract class
abstract class Shape {
 abstract double area();
 
 void display() {
     System.out.println("This is a shape.");
 }
}

//Concrete class implementing interface and extending abstract class
class Circle extends Shape implements Drawable {
 double radius;
 
 Circle(double radius) {
     this.radius = radius;
 }
 
 @Override
 public void draw() {
     System.out.println("Drawing a circle");
 }
 
 @Override
 double area() {
     return Math.PI * radius * radius;
 }
}

public class InterfaceAbstract {
 public static void main(String[] args) {
     Circle circle = new Circle(5);
     circle.draw();
     circle.display();
     System.out.println("Area: " + circle.area());
 }
}
