package day5;

//2. Rectangle Enforced Positive Dimensions
//Encapsulate validation and provide derived calculations.
//•	Build a Rectangle class with private width and height.
//•	Constructor and setters should reject or correct non-positive values (e.g., use default or throw an exception).
//•	Provide getArea() and getPerimeter() methods.
//•	Include displayDetails() method.

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            this.width = 1.0; // default positive value
        }
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            this.height = 1.0; // default positive value
        }
    }

    public double getWidth() { return width; }
    public double getHeight() { return height; }
    public double getArea() { return width * height; }
    public double getPerimeter() { return 2 * (width + height); }

    public void displayDetails() {
        System.out.println("Rectangle - Width: " + width + ", Height: " + height);
        System.out.println("Area: " + getArea() + ", Perimeter: " + getPerimeter());
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5.0, 3.0);
        rect1.displayDetails();

        rect1.setWidth(7.0);
        rect1.setHeight(4.0);
        rect1.displayDetails();

        Rectangle rect2 = new Rectangle(-5.0, 3.0); // width invalid, defaults to 1.0
        rect2.displayDetails();

        rect2.setHeight(-2.0); // height invalid, defaults to 1.0
        rect2.displayDetails();
    }
}
