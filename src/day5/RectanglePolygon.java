package day5;

public class RectanglePolygon implements Polygon {
    private double width, height;
    public RectanglePolygon(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() { return width * height; }
    public double getWidth() { return width; }
    public double getHeight() { return height; }
}
