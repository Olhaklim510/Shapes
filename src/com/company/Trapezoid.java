package com.company;

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
