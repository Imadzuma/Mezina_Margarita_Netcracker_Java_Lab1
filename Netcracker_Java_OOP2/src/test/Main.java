package test;

import ball.Ball;
import complex.MyComplex;
import container.Container;
import polynomial.MyPolynomial;

public class Main {
    public static void main(String[] args) {
        // complex example
        MyComplex myComplex = new MyComplex(4, 1);
        MyComplex another = new MyComplex(3, -1);
        System.out.println(myComplex.toString());
        System.out.println("\tReal: " + myComplex.getReal());
        System.out.println("\tImagine: " + myComplex.getImag());
        System.out.println("\tIs Real: " + myComplex.isReal());
        System.out.println("\tIs imagine: " + myComplex.isImagine());
        System.out.println("\tIs equals (3+1i): " + myComplex.equals(new MyComplex(3, 1)));
        System.out.println("\tMantitude: " + myComplex.magnitude());
        System.out.println("\tArgument: " + myComplex.argument());
        myComplex.add(another);
        System.out.println("\tAdd " + another.toString() + ": myComplex=" + myComplex.toString());
        myComplex.subtract(another);
        System.out.println("\tSubtract " + another.toString() + ": myComplex=" + myComplex.toString());
        myComplex.multiply(another);
        System.out.println("\tMultyply " + another.toString() + ": myComplex=" + myComplex.toString());
        myComplex.divide(another);
        System.out.println("\tDivide " + another.toString() + ": myComplex=" + myComplex.toString());
        System.out.println("\tConjugate: " + myComplex.conjugate().toString());
        System.out.println(myComplex.toString() + " + " + another.toString() + " = " + myComplex.addNew(another));
        System.out.println(myComplex.toString() + " - " + another.toString() + " = " + myComplex.subtractNew(another));
        System.out.println();

        // polynomial Example
        MyPolynomial myPolynomial = new MyPolynomial(3, 1, 7, 0);
        MyPolynomial right = new MyPolynomial(4, 5, -7);
        System.out.println(myPolynomial.toString());
        System.out.println("\tDegree: " + myPolynomial.getDegree());
        System.out.println(myPolynomial.toString() + " + " + right.toString() + " = " + myPolynomial.add(right).toString());
        System.out.println(myPolynomial.toString() + " * " + right.toString() + " = " + myPolynomial.multiply(right).toString());
        System.out.println();

        // ball Example
        Ball myBall = new Ball(0, 0, 1, 1, -135);
        System.out.println(myBall.toString());
        System.out.println("\tX: " + myBall.getX());
        System.out.println("\tY: " + myBall.getY());
        System.out.println("\tRadius: " + myBall.getRadius());
        System.out.println("\tdeltaX: " + myBall.getXDelta());
        System.out.println("\tdeltaY: " + myBall.getYDelta());
        myBall.move();
        System.out.println("\tValue after move: " + myBall.toString());
        myBall.reflectHorizontal();
        myBall.reflectVertical();
        myBall.move();
        System.out.println("\tValue after reflect and move: " + myBall.toString());
        System.out.println();

        // container Example
        Container myContainer = new Container(-5, -3, 10, 6);
        System.out.println(myContainer.toString());
        System.out.println("\tX1: " + myContainer.getX1());
        System.out.println("\tY1: " + myContainer.getY1());
        System.out.println("\tX2: " + myContainer.getX2());
        System.out.println("\tY2: " + myContainer.getY2());
        System.out.println("\tWidth: " + myContainer.getWidth());
        System.out.println("\tHeight: " + myContainer.getHeight());
        System.out.println();

        // Test ball inside container
        System.out.println("Test ball inside container");
        while(myContainer.coliders(myBall)) {
            System.out.println("\t" + myBall.toString() + " is inside " + myContainer.toString());
            myBall.move();
        }
        System.out.println("\t" + myBall.toString() + " leave " + myContainer.toString());
    }
}
