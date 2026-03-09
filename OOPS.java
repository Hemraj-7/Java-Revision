import java.util.*;
import bank.*;;

class Pen {
    String color;
    String type; // 1. ballpoint, gel

    public void write() {
        System.out.println("Writing Something through " + color + " " + type);
    }

    public void printColor() {
        System.out.println(color);
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // non parameterized constructor
    Student() {
        System.out.println("Constructor Called.");
    }

    // parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor ->
    Student(Student s3) {
        this.name = s3.name;
        this.age = s3.age;
    }
}

// Run time polymorphism (Method Overloading) ->
class StudentInfo {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

// Inheritance ->
class Shape {
    int l, h, r;

    public void area() {
        System.out.println("Displays Area: ");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println("The area of Triangle is: " + ((0.5) * l * h));
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println("The area of Cirlce is: " + (3.14) * r * r);
    }
}

class EqualateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println("The area of Equalateral Triangle is: " + ((0.5) * l * h));
    }
}

public class OOPS {
    public static void main(String args[]) {
        // creating object of Pen class
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gelpen";

        Pen pen2 = new Pen();
        pen2.color = "red";
        pen2.type = "ballpen";

        pen1.write();
        pen1.printColor();
        pen2.printColor();

        // creating object of Student class and called through non parameterized
        // constructor
        Student s1 = new Student();
        s1.name = "Hem Raj";
        s1.age = 18;

        s1.printInfo();

        // called through parameterized consturctor
        Student s2 = new Student("Hemsa", 21);
        s2.printInfo();

        // called through copy constructor
        Student s3 = new Student(s1);
        s3.printInfo();

        // Run time polymorphism (Method overloading) ->
        StudentInfo std1 = new StudentInfo();
        std1.name = "Raja Shab";
        std1.age = 24;
        std1.printInfo(std1.name);
        std1.printInfo(std1.age);
        std1.printInfo(std1.name, std1.age);

        // Inheriatance ->
        EqualateralTriangle obj = new EqualateralTriangle();
        obj.l = 3;
        obj.h = 5;
        obj.r = 7;

        obj.area(); // calling base class area method
        obj.area(obj.l, obj.h); // calling Equalateral triangle area method

        Circle objCircle = new Circle();
        objCircle.area(); // calling base class area method
        objCircle.area(obj.r); // calling Cirlce area method

        // Package Accessing ->
        // bank.Account account1 = new bank.Account();
        // account1.name = "customer1";

        
    }
}
