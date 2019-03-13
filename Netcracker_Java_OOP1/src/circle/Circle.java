package circle;

public class Circle {
    // Fields
    private double radius = 1.0;
    private String color = "red";

    // Constructors
    public Circle() {}
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(String color) {
        this.color = color;
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getters & Setters
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // Override metods
    @Override
    public String toString() {
        return "circle[radius=" + radius + ",color=\"" + color + "\"]";
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Circle)) return false;
        Circle circle = (Circle)obj;
        return (Double.compare(radius, circle.radius) == 0) && (color == circle.color);
    }
    @Override
    public int hashCode() {
        int result = 124;
        result = 31 * result + (int)Double.doubleToLongBits(radius);
        result = 31 * result + color.hashCode();
        return result;
    }

    // New metods
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
