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
    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Container)) return false;
        Container container = (Container)obj;
        return (x1 == container.x1) && (x2 == container.x2) & (y1 == container.y1) && ( y2 == container.y2);
    }
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + x1;
        result = 31 * result + x2;
        result = 31 * result + y1;
        result = 31 * result + y2;
        return  result;
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
        if (Double.compare(ball.getX() - ball.getRadius(), x1) < 0 || Double.compare(x2, ball.getX() + ball.getRadius()) < 0)
            return false;
        if (Double.compare(ball.getY() - ball.getRadius(), y1) < 0 || Double.compare(y2, ball.getY() + ball.getRadius()) < 0)
            return false;
        return true;
    }
}
