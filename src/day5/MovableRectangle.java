package day5;

//Moveable Shapes Simulation
// •	Define an interface Movable with methods: moveUp(), moveDown(), moveLeft(), moveRight().
// •	Implement classes:
// o	MovablePoint(x, y, xSpeed, ySpeed) implements Movable
// o	MovableCircle(radius, center: MovablePoint)
// o	MovableRectangle(topLeft: MovablePoint, bottomRight: MovablePoint) (ensuring both points have same speed)

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        if (topLeft.getXSpeed() != bottomRight.getXSpeed() || topLeft.getYSpeed() != bottomRight.getYSpeed())
            throw new IllegalArgumentException("Both points must have same speed");
        this.topLeft = topLeft; this.bottomRight = bottomRight;
    }
    public void moveUp() { topLeft.moveUp(); bottomRight.moveUp(); }
    public void moveDown() { topLeft.moveDown(); bottomRight.moveDown(); }
    public void moveLeft() { topLeft.moveLeft(); bottomRight.moveLeft(); }
    public void moveRight() { topLeft.moveRight(); bottomRight.moveRight(); }
    public String toString() {
        return String.format("Rectangle(topLeft=%s, bottomRight=%s)", topLeft, bottomRight);
    }
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 1, 1);
        MovableCircle circle = new MovableCircle(5, new MovablePoint(10, 10, 2, 2));
        MovableRectangle rectangle = new MovableRectangle(new MovablePoint(0, 0, 1, 1), new MovablePoint(5, 5, 1, 1));
        System.out.println("Initial positions:");
        System.out.println(point);
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println("\nAfter moving right:");
        point.moveRight();
        circle.moveRight();
        rectangle.moveRight();
        System.out.println(point);
        System.out.println(circle);
        System.out.println(rectangle);
    }
}
