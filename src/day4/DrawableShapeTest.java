package day4;

//Q)•	Interface Drawable with method draw()
//•	Abstract class Shape with abstract method area()
//Subclasses: Circle, Rectangle, and Triangle.
//•	Calculate area using appropriate formulas.
//•	Demonstrate how interface and abstract class work together.

interface Drawable {
    void draw();
}

abstract class AbstractShape {
    abstract double area();
}

class Circle2 extends AbstractShape implements Drawable {
    double radius;
    Circle2(double r) { 
    	radius = r;
    	}
    public void draw() { 
    	System.out.println("Drawing Circle"); 
    	}
    double area() { 
    	return Math.PI * radius * radius;
    	}
}

class Rectangle2 extends AbstractShape implements Drawable {
    double length, width;
    Rectangle2(double l, double w) {
    	length = l; 
    	width = w;
    	}
    public void draw() { 
    	System.out.println("Drawing Rectangle");
    	}
    double area() {
    	return length * width;
    	}
}

class Triangle2 extends AbstractShape implements Drawable {
    double base, height;
    Triangle2(double b, double h) { base = b; height = h; }
    public void draw() { System.out.println("Drawing Triangle"); }
    double area() { return 0.5 * base * height; }
}

public class DrawableShapeTest {
    public static void main(String[] args) {
        Drawable[] shapes = {new Circle2(3), new Rectangle2(4, 5), new Triangle2(6, 3)};
        AbstractShape[] shapeObjs = {(AbstractShape)shapes[0], (AbstractShape)shapes[1], (AbstractShape)shapes[2]};
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].draw();
            System.out.println("Area: " + shapeObjs[i].area());
        }
    }
}
