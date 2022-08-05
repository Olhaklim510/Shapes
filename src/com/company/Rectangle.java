package com.company;

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
