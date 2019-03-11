package container;

import ball.Ball;
import com.sun.org.apache.xml.internal.security.algorithms.Algorithm;
import com.sun.org.apache.xml.internal.security.algorithms.JCEMapper;

public class Container {
    // Fields
    int x1, y1;
    int x2, y2;

    // Constructors
    public Container(int x1, int y1, int width, int height) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x1 + width;
        this.y2 = y1 + height;
    }

    // Getters & Setters
    public int getX1() {
        return x1;
    }
    public int getY1() {
        return y1;
    }
    public int getX2() {
        return x2;
    }
    public int getY2() {
        return y2;
    }

    // Override metods
    @Override
    public String toString() {
        return "Container[(" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")]";
    }

    // New metods
    public int getWidth() {
        return x2 - x1;
    }
    public int getHeight() {
        return y2 - y1;
    }
    public boolean coliders(Ball ball) {
        if (ball == null)
            return false;
        if (ball.getX() - ball.getRadius() < x1 || x2 < ball.getX() + ball.getRadius())
            return false;
        if (ball.getY() - ball.getRadius() < y1 || y2 < ball.getY() + ball.getRadius())
            return false;
        return true;
    }
}
