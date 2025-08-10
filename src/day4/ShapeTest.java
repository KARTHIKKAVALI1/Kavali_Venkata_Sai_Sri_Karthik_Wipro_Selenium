package day4;
// poly 2. 2.	Create a base class Shape with a method area() that prints a message. 
//Then create two subclasses                            
//Circleoverride area() to calculator and print area of circle                                                  
//Rectangle override area() to calculate and print area of a rectangle
class Shape {
    void area() { 
    	System.out.println("Area calculation for shape");
    	}
}
class Circle extends Shape {
	
    double radius;
    Circle(double r) {
    	radius = r;
    	}
    void area() {
    	System.out.println("Area of circle: " + (Math.PI * radius * radius));
    	}
    
}
class Rectangle extends Shape {
	
    double length, width;
    Rectangle(double l, double w) {
    	length = l; 
    	width = w; 
    	}
    void area() { 
    	System.out.println("Area of rectangle: " + (length * width));
    	}
    
}

public class ShapeTest {
    public static void main(String[] args) {
    	
        Shape s1 = new Circle(3);
        Shape s2 = new Rectangle(4, 5);
        s1.area();
        s2.area();
        
    }
}
