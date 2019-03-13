package test;

import ball.Ball;
import complex.MyComplex;
import container.Container;
import polynomial.MyPolynomial;

public class Main {
    public static void main(String[] args) {
        // complex example
        MyComplex myComplex = new MyComplex(4, 1);
        MyComplex equalComplex1 = new MyComplex(4, 1);
        MyComplex equalComplex2 = new MyComplex(3, -1);
        System.out.println(myComplex.toString());
        System.out.println("\tReal: " + myComplex.getReal());
        System.out.println("\tImagine: " + myComplex.getImag());
        System.out.println("\tIs Real: " + myComplex.isReal());
        System.out.println("\tIs imagine: " + myComplex.isImagine());
        System.out.println("\tIs equals (3+1i): " + myComplex.equals(new MyComplex(3, 1)));
        System.out.println("\tMantitude: " + myComplex.magnitude());
        System.out.println("\tArgument: " + myComplex.argument());
        System.out.println("\tHashCode: " + myComplex.hashCode());
        myComplex.add(equalComplex2);
        System.out.println("\tAdd " + equalComplex2.toString() + ": myComplex=" + myComplex.toString());
        myComplex.subtract(equalComplex2);
        System.out.println("\tSubtract " + equalComplex2.toString() + ": myComplex=" + myComplex.toString());
        myComplex.multiply(equalComplex2);
        System.out.println("\tMultyply " + equalComplex2.toString() + ": myComplex=" + myComplex.toString());
        myComplex.divide(equalComplex2);
        System.out.println("\tDivide " + equalComplex2.toString() + ": myComplex=" + myComplex.toString());
        System.out.println("\tConjugate: " + myComplex.conjugate().toString());
        System.out.println(myComplex.toString() + " equal " + equalComplex1.toString() + ": " + myComplex.equals(equalComplex1));
        System.out.println(myComplex.toString() + " equal " + equalComplex2.toString() + ": " + myComplex.equals(equalComplex2));
        System.out.println(myComplex.toString() + " + " + equalComplex2.toString() + " = " + myComplex.addNew(equalComplex2));
        System.out.println(myComplex.toString() + " - " + equalComplex2.toString() + " = " + myComplex.subtractNew(equalComplex2));
        System.out.println();

        // polynomial Example
        MyPolynomial myPolynomial = new MyPolynomial(3, 1, 7, 0);
        MyPolynomial equalPolynomial1 = new MyPolynomial(3, 1, 7, 0);
        MyPolynomial equalPolynomial2 = new MyPolynomial(4, 5, -7);
        System.out.println(myPolynomial.toString());
        System.out.println("\tDegree: " + myPolynomial.getDegree());
        System.out.println("\tHashCode: " + myPolynomial.hashCode());
        System.out.println(myPolynomial.toString() + " equals " + equalPolynomial1.toString() + ": " + myPolynomial.equals(equalPolynomial1));
        System.out.println(myPolynomial.toString() + " equals " + equalPolynomial2.toString() + ": " + myPolynomial.equals(equalPolynomial2));
        System.out.println(myPolynomial.toString() + " + " + equalPolynomial2.toString() + " = " + myPolynomial.add(equalPolynomial2).toString());
        System.out.println(myPolynomial.toString() + " * " + equalPolynomial2.toString() + " = " + myPolynomial.multiply(equalPolynomial2).toString());
        System.out.println();

        // ball Example
        Ball myBall = new Ball(0, 0, 1, 1, -135);
        Ball equalBall1 = new Ball(1, 3, 1, 4, -15);
        Ball equalBall2 = new Ball(0, 0, 2, 1, -135);
        System.out.println(myBall.toString());
        System.out.println("\tX: " + myBall.getX());
        System.out.println("\tY: " + myBall.getY());
        System.out.println("\tRadius: " + myBall.getRadius());
        System.out.println("\tdeltaX: " + myBall.getXDelta());
        System.out.println("\tdeltaY: " + myBall.getYDelta());
        System.out.println("\tHashCode: " + myBall.hashCode());
        myBall.move();
        System.out.println("\tValue after move: " + myBall.toString());
        myBall.reflectHorizontal();
        myBall.reflectVertical();
        myBall.move();
        System.out.println("\tValue after reflect and move: " + myBall.toString());
        System.out.println(myBall.toString() + " equals " + equalBall1.toString() + ": " + myBall.equals(equalBall1));
        System.out.println(myBall.toString() + " equals " + equalBall2.toString() + ": " + myBall.equals(equalBall2));
        System.out.println();

        // container Example
        Container myContainer = new Container(-5, -3, 10, 6);
        Container equalContainer1 = new Container(-5, -3, 10, 6);
        Container equalContainer2 = new Container(0, 0, 3, 4);
        System.out.println(myContainer.toString());
        System.out.println("\tX1: " + myContainer.getX1());
        System.out.println("\tY1: " + myContainer.getY1());
        System.out.println("\tX2: " + myContainer.getX2());
        System.out.println("\tY2: " + myContainer.getY2());
        System.out.println("\tWidth: " + myContainer.getWidth());
        System.out.println("\tHeight: " + myContainer.getHeight());
        System.out.println("\tHashCode: " + myContainer.hashCode());
        System.out.println(myContainer.toString() + " equals " + equalContainer1.toString() + ": " + myContainer.equals(equalContainer1));
        System.out.println(myContainer.toString() + " equals " + equalContainer2.toString() + ": " + myContainer.equals(equalContainer2));
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
