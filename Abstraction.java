// Abstract class — the TEMPLATE
abstract class Shape {
    // Fields (allowed in abstract class)
    String color;

    // Constructor (allowed in abstract class)
    Shape(String color) {
        this.color = color;
    }

    // Abstract method — NO body
    // Every subclass MUST implement this differently
    abstract double area();
    abstract double perimeter();

    // Concrete method — HAS body
    // Shared by ALL subclasses — no need to repeat
    void displayInfo() {
        System.out.println("Color  : " + color);
        System.out.println("Area   : " + area());        // calls subclass version
        System.out.println("Perim  : " + perimeter());   // calls subclass version
    }
}

// Concrete class 1 — MUST implement all abstract methods
class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);          // calls abstract class constructor
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;   // Circle's OWN formula
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// Concrete class 2 — its OWN implementation
class Rectangle extends Shape {
    double length, width;

    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width  = width;
    }

    @Override
    double area() {
        return length * width;   // Rectangle's OWN formula
    }

    @Override
    double perimeter() {
        return 2 * (length + width);
    }
}

// Triangle — another different implementation
class Triangle extends Shape {
    double a, b, c;  // three sides

    Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a; this.b = b; this.c = c;
    }

    @Override
    double area() {
        double s = (a + b + c) / 2;   // Heron's formula
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    @Override
    double perimeter() { return a + b + c; }
}

// Main
public class Abstraction {
    public static void main(String[] args) {

        // Shape s = new Shape("red");   // COMPILE ERROR — abstract!

        Shape c = new Circle("Red", 7);
        Shape r = new Rectangle("Blue", 5, 3);
        Shape t = new Triangle("Green", 3, 4, 5);

        c.displayInfo();
        System.out.println("circle---");
        r.displayInfo();
        System.out.println("rect---");
        t.displayInfo();
        System.out.println("triangle---");

        // Polymorphism — same reference type, different behaviour
        Shape[] shapes = { c, r, t };
        for (Shape s : shapes) {
            System.out.println("\nArea of each (circle,rect,triangle)= " + s.area());  // each calls its own
        }
    }
}
