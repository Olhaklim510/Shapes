package com.company;

class Circle extends Shape {
    private final static double pi = 3.14159265359;
    private double radius;

    //default constructor
    public Circle(String circle) {
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