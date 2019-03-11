package point;

public class MyPoint {
    // Fields
    private int x = 0;
    private int y = 0;

    // Constructors
    public MyPoint() {}
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters & Setters
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    // Override metods
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    @Override
    public MyPoint clone() {
        return new MyPoint(x, y);
    }

    // New metods
    public int[] getXY() {
        int[] coords = {x, y};
        return coords;
    }
    public void setXY(int[] coords) {
        if (coords != null && coords.length >= 2) {
            x = coords[0];
            y = coords[1];
        }
    }
    public double distance(int x, int y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }
    public double distance(MyPoint another) {
        return distance(another.x, another.y);
    }
    public double distance() {
        return distance(0, 0);
    }
}
