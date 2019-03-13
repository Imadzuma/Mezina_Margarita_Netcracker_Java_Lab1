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
        Circle equalCircle1 = new Circle(10, "blue");
        Circle equalCircle2 = new Circle(12, "red");
        System.out.println(myCircle.toString());
        System.out.println("\tRadius: " + myCircle.getRadius());
        System.out.println("\tColor: " + myCircle.getColor());
        System.out.println("\tArea: " + myCircle.getArea());
        System.out.println("\tHashCode: " + myCircle.hashCode());
        System.out.println(myCircle.toString() + " equals " + equalCircle1.toString() + ": " + myCircle.equals(equalCircle1));
        System.out.println(myCircle.toString() + " equals " + equalCircle2.toString() + ": " + myCircle.equals(equalCircle2));
        System.out.println();

        // rectangle Example
        Rectangle myRectangle = new Rectangle(10, 15);
        Rectangle equalRectangle1 = new Rectangle(10, 15);
        Rectangle equalRectangle2 = new Rectangle(12, 35);
        System.out.println(myRectangle.toString());
        System.out.println("\tLength: " + myRectangle.getLength());
        System.out.println("\tWidth: " + myRectangle.getWidth());
        System.out.println("\tArea: " + myRectangle.getArea());
        System.out.println("\tPerimeter: " + myRectangle.getPerimeter());
        System.out.println("\tHashCode: " + myRectangle.hashCode());
        System.out.println(myRectangle.toString() + " equals " + equalRectangle1.toString() + ": " + myRectangle.equals(equalRectangle1));
        System.out.println(myRectangle.toString() + " equals " + equalRectangle2.toString() + ": " + myRectangle.equals(equalRectangle2));
        System.out.println();

        // employee Example
        Employee myEmployee = new Employee(1, "Margarita", "Bogatova", 250000);
        Employee equalEmployee1 = new Employee(1, "Margarita", "Bogatova", 250000);
        Employee equalEmployee2 = new Employee(2, "Margarita", "Bogatova", 250000);
        System.out.println(myEmployee.toString());
        System.out.println("\tID: " + myEmployee.getID());
        System.out.println("\tFirst Name: " + myEmployee.getFirstName());
        System.out.println("\tLast Name: " + myEmployee.getLastName());
        System.out.println("\tSalary: " + myEmployee.getSalary());
        System.out.println("\tFull Name: " + myEmployee.getName());
        System.out.println("\tAnnual Salary: " + myEmployee.getAnnualSalary());
        System.out.println("\tRaise Salary: " + myEmployee.raiseSalary(10));
        System.out.println("\tHashCode: " + myEmployee.hashCode());
        System.out.println(myEmployee.toString() + " equals " + equalEmployee1.toString() + ": " + myEmployee.equals(equalEmployee1));
        System.out.println(myEmployee.toString() + " equals " + equalEmployee2.toString() + ": " + myEmployee.equals(equalEmployee2));
        System.out.println();

        // book Example
        Author[] authors = new Author[2];
        authors[0] = new Author("Valery", "valera@gmail.com", 'M');
        authors[1] = new Author("Maria", "maria_11@mail.ru", 'W');
        Book myBook = new Book("First Experience", authors, 1000);
        Book equalBook1 = new Book("First Experience", authors, 1222);
        Book equalBook2 = new Book("Second Experience", authors, 1000);
        System.out.println(myBook.toString());
        System.out.println("\tName: " + myBook.getName());
        System.out.println("\tAuthors: " + myBook.getAuthorNames());
        System.out.println("\tPrice: " + myBook.getPrice());
        System.out.println("\tQty: " + myBook.getQty());
        System.out.println("\tHashCode: " + myBook.hashCode());
        System.out.println(myBook.toString() + " equals " + equalBook1.toString() + ": " + myBook.equals(equalBook1));
        System.out.println(myBook.toString() + " equals " + equalBook2.toString() + ": " + myBook.equals(equalBook2));
        System.out.println();

        // point Example
        MyPoint myPoint = new MyPoint(10, 10);
        MyPoint equalPoint1 = new MyPoint(10, 10);
        MyPoint equalPoint2 = new MyPoint(5, 5);
        System.out.println(myPoint.toString());
        System.out.println("\tX: " + myPoint.getX());
        System.out.println("\tY: " + myPoint.getY());
        System.out.println("\tDistance to (15,15): " + myPoint.distance(15, 15));
        System.out.println("\tDistance to " + equalPoint2.toString() + ": " + myPoint.distance(equalPoint2));
        System.out.println("\tDistance to (0,0): " + myPoint.distance());
        System.out.println("\tHashCode: " + myPoint.hashCode());
        System.out.println(myPoint.toString() + " equals " + equalPoint1.toString() + ": " + myPoint.equals(equalPoint1));
        System.out.println(myPoint.toString() + " equals " + equalPoint2.toString() + ": " + myPoint.equals(equalPoint2));
        System.out.println();

        // triangle Example
        MyPoint first = new MyPoint(0, 0);
        MyPoint second = new MyPoint(5, 5);
        MyPoint third = new MyPoint(-5, 5);
        MyTriangle myTriangle = new MyTriangle(first, second, third);
        MyTriangle equalTriangle1 = new MyTriangle(first, second, third);
        MyTriangle equalTriangle2 = new MyTriangle(first, second, myPoint);
        System.out.println(myTriangle.toString());
        System.out.println("\tPerimeter: " + myTriangle.getPerimeter());
        System.out.println("\tType: " + myTriangle.getType());
        System.out.println("\tHashCode: " + myTriangle.hashCode());
        System.out.println(myTriangle.toString() + " equals " + equalTriangle1.toString() + ": " + myTriangle.equals(equalTriangle1));
        System.out.println(myTriangle.toString() + " equals " + equalTriangle2.toString() + ": " + myTriangle.equals(equalTriangle2));
    }
}
