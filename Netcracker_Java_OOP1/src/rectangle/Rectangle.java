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
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle)obj;
        return (Float.compare(length, rectangle.length) == 0) && (Float.compare(width, rectangle.width) == 0);
    }
    @Override
    public int hashCode() {
        int result = 401;
        result = 31 * result + Float.floatToIntBits(length);
        result = 31 * result + Float.floatToIntBits(width);
        return result;
    }

    // New metods
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
