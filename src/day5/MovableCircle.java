package day5;

//Moveable Shapes Simulation
// •	Define an interface Movable with methods: moveUp(), moveDown(), moveLeft(), moveRight().
// •	Implement classes:
// o	MovablePoint(x, y, xSpeed, ySpeed) implements Movable
// o	MovableCircle(radius, center: MovablePoint)
// o	MovableRectangle(topLeft: MovablePoint, bottomRight: MovablePoint) (ensuring both points have same speed)

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;
    public MovableCircle(int radius, MovablePoint center) {
        this.radius = radius; 
        this.center = center;
    }
    public void moveUp() { center.moveUp(); }
    public void moveDown() { center.moveDown(); }
    public void moveLeft() { center.moveLeft(); }
    public void moveRight() { center.moveRight(); }
    public String toString() {
        return String.format("Circle(radius=%d, center=%s)", radius, center);
    }
}
