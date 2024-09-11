package Problem_2;

/**
 * ES234317 - Algorithms and Data Structures
 * Gasal | 2024-2025
 * Coursework   : 02
 * Student ID   : 5026231174
 * Full Name    : Muhammad Razan Parisya Putra
 * Class        : C
 */

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString() {
        return "Circle{center=" + center + ", radius=" + radius + '}';
    }

    @Override
    public void moveUp(){
        center.moveUp();
    }

    @Override
    public void moveDown(){
        center.moveDown();
    }

    @Override
    public void moveLeft(){
        center.moveLeft();
    }

    @Override
    public void moveRight(){
        center.moveRight();
    }
}
