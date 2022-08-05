package com.company;

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
