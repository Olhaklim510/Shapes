package com.company;

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

            PrintName printName=new PrintName();
            System.out.println("Shape is " + printName.printName(shapes[i]) + ",\t style is " + shapes[i].getStyle() +
                    ",\t color is " + shapes[i].getColor() + ",\t area is " + shapes[i].area());
        }


    }
}
