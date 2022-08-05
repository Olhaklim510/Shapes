package com.company;

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
        return Math.round(Math.pow(getWidth(), 2));
    }
}
