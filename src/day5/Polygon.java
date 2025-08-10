package day5;

//Default and Static Methods in Interfaces
//•	Declare interface Polygon with:
//o	double getArea()
//o	default method default double getPerimeter(int... sides) that computes sum of sides
//o	a static helper static String shapeInfo() returning a description string
//•	Implement classes Rectangle and Triangle, providing appropriate getArea().
//•	In Main, call getPerimeter(...) and Polygon.shapeInfo().

public interface Polygon {
    double getArea();
    
    default double getPerimeter(int[] sides) {
        double perimeter = 0;
        if (sides != null) {
            for (int side : sides) {
                perimeter += side;
            }
        }
        return perimeter;
    }
    
    static String shapeInfo() {
        return "Polygon: A shape with straight sides";
    }
}
