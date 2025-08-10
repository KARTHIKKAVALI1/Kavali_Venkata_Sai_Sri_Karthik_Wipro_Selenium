package day5;

public interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}
//Moveable Shapes Simulation
//•	Define an interface Movable with methods: moveUp(), moveDown(), moveLeft(), moveRight().
//•	Implement classes:
//o	MovablePoint(x, y, xSpeed, ySpeed) implements Movable
//o	MovableCircle(radius, center: MovablePoint)
//o	MovableRectangle(topLeft: MovablePoint, bottomRight: MovablePoint) (ensuring both points have same speed)
//•	Provide toString() to display positions.
//•	In main(), create a few objects and call move methods to simulate motion
