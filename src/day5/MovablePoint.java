package day5;

//Moveable Shapes Simulation
// •	Define an interface Movable with methods: moveUp(), moveDown(), moveLeft(), moveRight().
// •	Implement classes:
// o	MovablePoint(x, y, xSpeed, ySpeed) implements Movable
// o	MovableCircle(radius, center: MovablePoint)
// o	MovableRectangle(topLeft: MovablePoint, bottomRight: MovablePoint) (ensuring both points have same speed)

public class MovablePoint implements Movable {
    private int x, y;
    private int xSpeed, ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public void moveUp() { 
    	y -= ySpeed; 
    	}
    public void moveDown() {
    	y += ySpeed;
    	}
    public void moveLeft() {
    	x -= xSpeed;
    	}
    public void moveRight() {
    	x += xSpeed;
    	}
    public int getX() { 
    	return x; 
    	}
    public int getY() {
    	return y; 
    	}
    public int getXSpeed() {
    	return xSpeed;
    	}
    public int getYSpeed() {
    	return ySpeed; 
    	}
    public String toString() {
        return String.format("Point(%d, %d) speed(%d, %d)", x, y, xSpeed, ySpeed);
    }
}
