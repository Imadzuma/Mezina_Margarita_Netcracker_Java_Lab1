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

    // New metods
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
