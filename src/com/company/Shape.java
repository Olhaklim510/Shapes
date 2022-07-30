package com.company;

abstract class Shape {
    //declaration fields
    private String name;
    private String style;
    private String color;
    private double width;
    private double height;


    //default constructor
    public Shape() {
        name = "none";
        style = "simple";
        color = "white";
        width = height = 0;
    }

    //parameterized constructor
    public Shape(String name, String style, String color, double width, double height) {
        this.name = name;
        this.style = style;
        this.color = color;
        this.width = width;
        this.height = height;
    }

    //Creating an object with the same values
    //instance variables width and height
    Shape(String n, String st, String col, double x) {
        name = n;
        style = st;
        color = col;
        width = height = x;
    }

    //creating one object on the basis of another
    Shape(Shape ob) {
        name = ob.name;
        style = ob.style;
        color = ob.color;
        width = ob.height;
        height = ob.height;
    }

    //methods access to variables width and height
    public double getWidth() {
        return width;
    }

    public void setWidth(double w) {
        width = w;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        this.height = h;
    }

    //methods access to variables name, style and color
    public String getName() {
        return name;
    }

    public String getStyle() {
        return style;
    }

    public String getColor() {
        return color;
    }

    //method area()
    abstract double area();
}

class Circle extends Shape {
    private final static double pi = 3.14159265359;
    private double radius;

    //default constructor
    public Circle() {
        super();
        radius = 0;
    }

    //constructor class Circle
    public Circle(String name, String style, String color, double r) {
        super("circle", style, color, r);
        radius = r;
    }

    //creating one object on the basis of another
    Circle(Circle ob) {
        super(ob);
        radius = ob.radius;
    }

    @Override
    double area() {
        return Math.round(pi * Math.pow(radius,2));
    }
}

class Quadrate extends Shape {
    //default constructor
    public Quadrate() {
        super();
    }

    //constructor class Quadrate
    public Quadrate(String name, String style, String color, double w) {
        super("quadrate", style, color, w);
    }

    //creating one object on the basis of another
    Quadrate(Quadrate ob) {
        super(ob);
    }

    @Override
    double area() {
        return Math.round(Math.pow(getWidth(),2));
    }
}

class Rectangle extends Shape {
    //default constructor
    public Rectangle() {
        super();
    }

    //constructor class Rectangle
    public Rectangle(String name, String style, String color, double w, double h) {
        super("rectangle", style, color, w, h);
    }

    //creating one object on the basis of another
    Rectangle(Rectangle ob) {
        super(ob);
    }

    @Override
    double area() {
        return Math.round(getWidth() * getHeight());
    }
}

class Triangle extends Shape {
    //default constructor
    public Triangle() {
        super();
    }

    //constructor class Triangle
    public Triangle(String name, String style, String color, double w, double h) {
        super("triangle", style, color, w, h);
    }

    //creating one object on the basis of another
    Triangle(Triangle ob) {
        super(ob);
    }

    @Override
    double area() {
        return Math.round(getWidth() * getHeight() / 2);
    }
}

class Trapezoid extends Shape {
    //default constructor
    public Trapezoid() {
        super();
    }

    //constructor class Trapezoid
    public Trapezoid(String name, String style, String color, double h) {
        super("trapezoid", style, color, h);
    }

    //creating one object on the basis of another
    Trapezoid(Trapezoid ob) {
        super(ob);
    }

    @Override
    double area() {
        return Math.round(getHeight() * getHeight());
    }
}

class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle("circle", "in a moon", "purple", 2.0);
        shapes[1] = new Quadrate("quadrate", "in a leaf", "black", 5.0);
        shapes[2] = new Rectangle("rectangle", "in a point", "yellow", 3.0, 8.0);
        shapes[3] = new Triangle("triangle", "in a flower", "green", 3.0, 8.0);
        shapes[4] = new Trapezoid("trapezoid", "in a star", "orange", 8.0);

        for (int i = 0; i < shapes.length; i++) {
//            Shape is circle,	     style is in a moon,	 color is purple,	 area is 13.0
//            Shape is quadrate,	 style is in a leaf,	 color is black,	 area is 25.0
//            Shape is rectangle,	 style is in a point,	 color is yellow,	 area is 24.0
//            Shape is triangle,	 style is in a flower,	 color is green,	 area is 12.0
//            Shape is trapezoid,	 style is in a star,	 color is orange,	 area is 64.0
            System.out.println("Shape is " + shapes[i].getName() + ",\t style is " + shapes[i].getStyle() +
                    ",\t color is " + shapes[i].getColor() + ",\t area is " + shapes[i].area());
        }
    }
}

