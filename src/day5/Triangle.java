package day5;

public class Triangle implements Polygon {
    private double base, height;
    private double side1, side2, side3;

    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        return 0.5 * base * height;
    }

    public int[] getSides() {
        // Changed return type to int[] for compatibility with Polygon default method
        return new int[] {(int)side1, (int)side2, (int)side3};
    }

    public static void main(String[] args) {
        RectanglePolygon rect = new RectanglePolygon(5, 3);
        Triangle triangle = new Triangle(4, 6, 3, 4, 5);

        System.out.println(Polygon.shapeInfo());
        System.out.println();

        System.out.println("Rectangle:");
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter(new int[] {5, 3, 5, 3}));

        System.out.println("\nTriangle:");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter(triangle.getSides()));
    }
}
