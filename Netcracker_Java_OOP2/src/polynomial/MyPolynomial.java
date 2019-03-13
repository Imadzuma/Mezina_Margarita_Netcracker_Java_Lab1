package polynomial;

import java.util.Arrays;

public class MyPolynomial {
    // Fields
    private double[] coeffs;

    // Constructors
    public MyPolynomial(double... coeffs) {
        int zero_index = coeffs.length - 1;
        while (zero_index >= 0 && coeffs[zero_index] == 0) zero_index--;
        this.coeffs = new double[zero_index + 1];
        for(int i = 0; i <= zero_index; ++i)
            this.coeffs[i] = coeffs[i];
    }

    // Override metods
    @Override
    public String toString() {
        if (coeffs.length == 0)
            return "0";
        if (coeffs.length == 1)
            return "" + coeffs[0];
        String result = "";
        result += coeffs[coeffs.length-1] + "x^" + (coeffs.length-1);
        for (int i = coeffs.length-2; i>0; --i) {
            if (coeffs[i] == 0)
                continue;
            if (coeffs[i]>0)
                result += "+";
            result += coeffs[i] + "x";
            if (i != 1)
                result += "^" + i;
        }
        if (coeffs[0] != 0) {
            if (coeffs[0]>0)
                result += "+";
            result += coeffs[0];
        }
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof MyPolynomial)) return false;
        MyPolynomial myPolynomial = (MyPolynomial)obj;
        if (coeffs.length != myPolynomial.coeffs.length) return false;
        for (int i = 0; i < coeffs.length; ++i)
            if (coeffs[i] != myPolynomial.coeffs[i]) return false;
            return true;
    }
    @Override
    public int hashCode() {
        int result = 13;
        result = 31 * result + Arrays.hashCode(coeffs);
        return result;
    }

    // New metods
    public int getDegree() {
        return coeffs.length - 1;
    }
    public MyPolynomial add(MyPolynomial right) {
        double[] newCoeffs = new double[Math.max(coeffs.length, right.coeffs.length)];
        for (int i = 0; i < coeffs.length; ++i)
            newCoeffs[i] += coeffs[i];
        for (int i = 0; i < right.coeffs.length; ++i)
            newCoeffs[i] += right.coeffs[i];
        return new MyPolynomial(newCoeffs);
    }
    public MyPolynomial multiply(MyPolynomial right) {
        double[] newCoeffs = new double[coeffs.length + right.coeffs.length];
        for (int i = 0; i < coeffs.length; ++i) {
            for (int j = 0; j < right.coeffs.length; ++j)
                newCoeffs[i + j] += coeffs[i] * right.coeffs[j];
        }
        return new MyPolynomial(newCoeffs);
    }
}
