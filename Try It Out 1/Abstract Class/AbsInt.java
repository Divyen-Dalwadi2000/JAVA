// Abstract class  

package abstractVSinterface;

abstract class Shape {
    String objectName = "";

    Shape(String name) {
        this.objectName = name;
    }

    abstract public double area();

    abstract public void draw();

}

class Rectangle extends Shape {
    int length, width;

    // here we pass = 20 , 30 and Rectangle
    Rectangle(int length, int width, String name) {
        // we expli.. call the parent or super class constructor
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle is drawn");

    }

    @Override
    public double area() {
        return (double) (length * width);
    }
}

class Circle extends Shape {
    double pi = 3.14;
    int radius;

    // here we pass 20 and circle
    Circle(int radius, String name) {
        // we expli.. call the parent or super class constructor
        super(name);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle is drawn");

    }

    @Override

    public double area() {
        return (double) ((pi * radius * radius) / 2);
    }
}

public class AbsInt {
    public static void main(String[] args) {

        // here we create reference variable of "Shape" class
        Shape rect = new Rectangle(20, 30, "Rectangle");
        System.out.println("Area of rectangle : " + rect.area());

        Shape circle = new Circle(20, "circle");
        System.out.println("Area of Circle : " + circle.area());

    }
}

/*
 * ===================
 * Output
 * ===================
 * javac -d . AbsInt.java
 * java abstractVSinterface.AbsInt
 * 
 * Area of rectangle : 600.0
 * Area of Circle : 628.0
 */