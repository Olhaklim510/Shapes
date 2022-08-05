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

