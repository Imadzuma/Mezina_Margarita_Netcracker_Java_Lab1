package ball;

public class Ball {
    // Fields
    float x;
    float y;
    int radius;
    float xDelta;
    float yDelta;

    // Constructors
    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        xDelta = (float)(Math.cos(Math.PI * direction / 180.0) * speed);
        yDelta = (float)(Math.sin(Math.PI * direction / 180.0) * speed);
    }

    // Getters & Setters
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public int getRadius() {
        return radius;
    }
    public float getXDelta() {
        return xDelta;
    }
    public float getYDelta() {
        return yDelta;
    }
    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }
    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    // Override metods
    @Override
    public String toString() {
        return "Ball[(" + x + "," + y + "),radius=" + radius + ",speed=(" + xDelta +"," + yDelta + ")]";
    }

    // New metods
    public void move() {
        x += xDelta;
        y += yDelta;
    }
    public void reflectHorizontal() {
        xDelta = -xDelta;
    }
    public void reflectVertical() {
        yDelta = -yDelta;
    }
}
