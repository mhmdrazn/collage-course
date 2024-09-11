package Problem_2;

/**
 * ES234317 - Algorithms and Data Structures
 * Gasal | 2024-2025
 * Coursework   : 02
 * Student ID   : 5026231174
 * Full Name    : Muhammad Razan Parisya Putra
 * Class        : C
 */

 public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return "MovablePoint{" + "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "}";
    }

    @Override
    public void moveUp(){
        this.y -= ySpeed;
    }

    @Override
    public void moveDown(){
        this.y -= ySpeed;
    }

    @Override
    public void moveRight(){
        this.x += xSpeed;
    }

    @Override
    public void moveLeft(){
        this.x -= xSpeed;
    }
}
