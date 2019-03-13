package triangle;

import point.MyPoint;

public class MyTriangle {
    // Fields
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    // Constructors
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1.clone();
        this.v2 = v2.clone();
        this.v3 = v3.clone();
    }

    // Override metods
    @Override
    public String toString() {
        return "MyRectangle[v1=" + v1.toString() + ",v2=" + v2.toString() + ",v3=" + v3.toString() + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof MyTriangle)) return false;
        MyTriangle myTriangle = (MyTriangle)obj;
        return v1.equals(myTriangle.v1) && v2.equals(myTriangle.v2) && v3.equals(myTriangle.v3);
    }
    @Override
    public int hashCode() {
        int result = 15;
        result = 31 * result + v1.hashCode();
        result = 31 * result + v2.hashCode();
        result = 31 * result + v3.hashCode();
        return result;
    }

    // New metods
    public double getPerimeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }
    public String getType() {
        if ((Double.compare(v1.distance(v2), v2.distance(v3)) == 0) &&
                (Double.compare(v2.distance(v3), v3.distance(v1)) == 0))
            return "Equilateral";
        if ((Double.compare(v1.distance(v2), v2.distance(v3)) == 0) ||
                (Double.compare(v2.distance(v3), v3.distance(v1)) == 0) ||
                (Double.compare(v2.distance(v1), v1.distance(v3)) == 0))
            return "Isosceles";
        return "Scalene";
    }
}
