package complex;

public class MyComplex {
    // Fields
    private double real = 0.0;
    private double imag = 0.0;

    // Constructors
    public MyComplex() {}
    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Getters & Setters
    public double getReal() {
        return real;
    }
    public double getImag() {
        return imag;
    }
    public void setReal(double real) {
        this.real = real;
    }
    public void setImag(double imag) {
        this.imag = imag;
    }

    // Override metods
    @Override
    public String toString() {
        String result = "(" + real;
        if (imag >= 0)
            result += "+";
        return result + imag + "i)";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyComplex myComplex = (MyComplex) o;
        return (myComplex.real == real) && (myComplex.imag == imag);
    }
    public boolean equals(double real, double imag) {
        return (this.real == real) && (this.imag == imag);
    }

    // New metods
    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public boolean isReal() {
        return (real != 0);
    }
    public boolean isImagine() {
        return (imag != 0);
    }
    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }
    public double argument() {
        return Math.atan(imag/real);
    }
    public MyComplex add(MyComplex right) {
        real += right.real;
        imag += right.imag;
        return this;
    }
    public MyComplex subtract(MyComplex right) {
        real -= right.real;
        imag -= right.imag;
        return this;
    }
    public MyComplex multiply(MyComplex right) {
        double newReal = real * right.real - imag * right.imag;
        double newImag = real * right.imag + imag * right.real;
        real = newReal;
        imag = newImag;
        return this;
    }
    public MyComplex divide(MyComplex right) {
        double newReal = (real * right.real + imag * right.imag) /
                         (right.real * right.real + right.imag * right.imag);
        double newImag = (right.real * imag - real * right.imag) /
                         (right.real * right.real + right.imag * right.imag);
        real = newReal;
        imag = newImag;
        return this;
    }
    public MyComplex conjugate() {
        return new MyComplex(real, -imag);
    }
    public MyComplex addNew(MyComplex right) {
        return new MyComplex(real + right.real, imag + right.imag);
    }
    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(real - right.real, imag-right.imag);
    }
}
