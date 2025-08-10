package day6;

//: Shape Area Calculator
//Define enum Shape (CIRCLE, SQUARE, RECTANGLE, TRIANGLE) where each constant:
//•	Overrides a method double area(double... params) to compute its area.
//•	E.g., CIRCLE expects radius, TRIANGLE expects base and height.
//Loop over all constants with sample inputs and print results.

public class ShapeAreaDemo {
    enum Shape {
        CIRCLE {
            double area(double... params) {
                double radius = params[0];
                return 3.141592653589793 * radius * radius;
            }
        },
        SQUARE {
            double area(double... params) {
                double side = params[0];
                return side * side;
            }
        },
        RECTANGLE {
            double area(double... params) {
                double length = params[0];
                double breadth = params[1];
                return length * breadth;
            }
        },
        TRIANGLE {
            double area(double... params) {
                double base = params[0];
                double height = params[1];
                return 0.5 * base * height;
            }
        };

        abstract double area(double... params);
    }

    public static void main(String[] args) {
        System.out.println("Circle area: " + Shape.CIRCLE.area(5));
        System.out.println("Square area: " + Shape.SQUARE.area(4));
        System.out.println("Rectangle area: " + Shape.RECTANGLE.area(5, 3));
        System.out.println("Triangle area: " + Shape.TRIANGLE.area(4, 6));
    }
}
