package rectangle;

public class Rectangle {
    // Fields
    private float length = 1.0f;
    private float width = 1.0f;

    // Constructors
    public Rectangle() {}
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    // Getters & Setters
    public float getLength() {
        return length;
    }
    public float getWidth() {
        return width;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public void setWidth(float width) {
        this.width = width;
    }

    // Override metods
    @Override
    public String toString() {
        return "rectangle[length=" + length + ",width=" + width + "]";
    }

    // New metods
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
