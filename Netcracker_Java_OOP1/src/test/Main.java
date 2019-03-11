package test;

import book.Author;
import book.Book;
import circle.Circle;
import employee.Employee;
import point.MyPoint;
import rectangle.Rectangle;
import triangle.MyTriangle;

public class Main {
    public static void main(String[] args) {
        // circle Example
        Circle myCircle = new Circle(10, "blue");
        System.out.println(myCircle.toString());
        System.out.println("\tRadius: " + myCircle.getRadius());
        System.out.println("\tColor: " + myCircle.getColor());
        System.out.println("\tArea: " + myCircle.getArea());
        System.out.println();

        // rectangle Example
        Rectangle myRectangle = new Rectangle(10, 15);
        System.out.println(myRectangle.toString());
        System.out.println("\tLength: " + myRectangle.getLength());
        System.out.println("\tWidth: " + myRectangle.getWidth());
        System.out.println("\tArea: " + myRectangle.getArea());
        System.out.println("\tPerimeter: " + myRectangle.getPerimeter());
        System.out.println();

        // employee Example
        Employee myEmployee = new Employee(1, "Margarita", "Bogatova", 250000);
        System.out.println(myEmployee.toString());
        System.out.println("\tID: " + myEmployee.getID());
        System.out.println("\tFirst Name: " + myEmployee.getFirstName());
        System.out.println("\tLast Name: " + myEmployee.getLastName());
        System.out.println("\tSalary: " + myEmployee.getSalary());
        System.out.println("\tFull Name: " + myEmployee.getName());
        System.out.println("\tAnnual Salary: " + myEmployee.getAnnualSalary());
        System.out.println("\tRaise Salary: " + myEmployee.raiseSalary(10));
        System.out.println();

        // book Example
        Author[] authors = new Author[2];
        authors[0] = new Author("Valery", "valera@gmail.com", 'M');
        authors[1] = new Author("Maria", "maria_11@mail.ru", 'W');
        Book myBook = new Book("First Experience", authors, 1000);
        System.out.println(myBook.toString());
        System.out.println("\tName: " + myBook.getName());
        System.out.println("\tAuthors: " + myBook.getAuthorNames());
        System.out.println("\tPrice: " + myBook.getPrice());
        System.out.println("\tQty: " + myBook.getQty());
        System.out.println();

        // point Example
        MyPoint myPoint = new MyPoint(10, 10);
        System.out.println(myPoint.toString());
        System.out.println("\tX: " + myPoint.getX());
        System.out.println("\tY: " + myPoint.getY());
        System.out.println("\tDistance to (15,15): " + myPoint.distance(15, 15));
        MyPoint another = new MyPoint(5, 5);
        System.out.println("\tDistance to " + another.toString() + ": " + myPoint.distance(another));
        System.out.println("\tDistance to (0,0): " + myPoint.distance());
        System.out.println();

        // triangle Example
        MyPoint first = new MyPoint(0, 0);
        MyPoint second = new MyPoint(5, 5);
        MyPoint third = new MyPoint(-5, 5);
        MyTriangle myTriangle = new MyTriangle(first, second, third);
        System.out.println(myTriangle.toString());
        System.out.println("\tPerimeter: " + myTriangle.getPerimeter());
        System.out.println("\tType: " + myTriangle.getType());
    }
}
