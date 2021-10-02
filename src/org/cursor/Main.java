package org.cursor;


public class Main {
    public static void main(String[] args) {
        Shape[] s = {new Triangle(new Vertex(1.0, 2.0), new Vertex(2.0, 3.0), new Vertex(3.0, 1.0)),
                new Rectangle(new Vertex(1.0, 2.0)), new Circle(new Vertex(1.0, 2.0)),
                new SquarePyramid(new Vertex3D(1.0, 2.0, 3.0)), new Cuboid(new Vertex3D(1.0, 2.0, 3.0)),
                new Sphere(new Vertex3D(1.0, 2.0, 3.0))};

        for (Shape shape : s) {
            System.out.println(shape.toString());
        }
    }
}

class Vertex {
    public double x, y;

    public Vertex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(Vertex v) {
        return Math.sqrt(Math.pow(this.x - v.x, 2) + Math.pow(this.y - v.y, 2));
    }
}

class Vertex3D extends Vertex {
    public double z;

    public Vertex3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }
}

interface PerimeterMeasurable {
    double getPerimeter();

}

interface AreaMeasurable {
    double getArea();
}

interface VolumeMeasurable {
    double getVolume();
}

abstract class Shape {
    public double area;
}

abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {
    public Vertex[] v;
    public double perimetr;
}

abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {
    public Vertex3D[] v;
    public double volume;
}

class Triangle extends PlaneShape {
    public Triangle(Vertex v1, Vertex v2, Vertex v3) {
        v = new Vertex[3];
        v[0] = v1;
        v[1] = v2;
        v[2] = v3;
        perimetr = getPerimeter();
        area = getArea();
    }

    @Override
    public String toString() {
        return "Shape: Triangle {" +
                "vertex1: " + v[0].x + "," + v[0].y +
                " vertex2: " + v[1].x + "," + v[1].y +
                " vertex3: " + v[2].x + "," + v[2].y +
                " Perimetr = " + perimetr + " Area = " + area +
                '}';
    }

    @Override
    public double getPerimeter() {
        return (v[0].x + v[0].y) + (v[1].x + v[1].y) + (v[2].x + v[2].y);
    }

    @Override
    public double getArea() {
        double p = ((v[0].x + v[0].y) + (v[1].x + v[1].y) + (v[2].x + v[2].y)) / 2;
        return Math.sqrt(p * (p - (v[0].x + v[0].y)) * (p - (v[1].x + v[1].y)) * (p - (v[2].x + v[2].y)));
    }
}

class Rectangle extends PlaneShape {
    double width = 4;
    double heigth = 2;

    public Rectangle(Vertex v1) {
        v = new Vertex[1];
        v[0] = v1;
        perimetr = getPerimeter();
        area = getArea();
    }

    @Override
    public String toString() {
        return "Shape: Rectangle {" +
                "vertex1: " + v[0].x + "," + v[0].y +
                " Perimetr = " + perimetr + " Area = " + area +
                '}';
    }

    @Override
    public double getPerimeter() {
        return (2 * (width + heigth));
    }

    @Override
    public double getArea() {
        return (width * heigth);
    }
}

class Circle extends PlaneShape {
    double radius = 5;

    public Circle(Vertex v1) {
        v = new Vertex[1];
        v[0] = v1;
        perimetr = getPerimeter();
        area = getArea();
    }

    @Override
    public String toString() {
        return "Shape: Circle {" +
                "vertex1: " + v[0].x + "," + v[0].y +
                " Perimetr = " + perimetr +
                " Area = " + area +
                '}';
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class SquarePyramid extends SpaceShape {
    double width = 5;
    double height = 8;
    double sheight;

    public SquarePyramid(Vertex v1) {
        v = new Vertex3D[1];
        v[0] = (Vertex3D) v1;
        area = getArea();
        volume = getVolume();
    }

    @Override
    public double getArea() {
        sheight = Math.sqrt(Math.pow(height, 2)) + (Math.pow(width / 2, 2));
        return Math.pow(width, 2) + 2 * width * sheight;
    }

    @Override
    public String toString() {
        return "Shape: SquarePyramid {" +
                "vertex1: " + v[0].x + "," + v[0].y + "," + v[0].z +
                " Area = " + area +
                " Volume = " + volume +
                '}';
    }

    @Override
    public double getVolume() {
        return Math.pow(width, 2) * height / 3;
    }
}

class Cuboid extends SpaceShape {
    double width = 5;
    double height = 7;
    double depht = 4;

    public Cuboid(Vertex3D v1) {
        v = new Vertex3D[1];
        v[0] = v1;
        area = getArea();
        volume = getVolume();
    }


    @Override
    public String toString() {
        return "Shape: Cuboid {" +
                "vertex1: " + v[0].x + "," + v[0].y + "," + v[0].z +
                " Area = " + area +
                " Volume = " + volume +
                '}';
    }

    @Override
    public double getArea() {
        return 2 * width * depht + 2 * width * height + 2 * depht * height;
    }

    @Override
    public double getVolume() {
        return width * depht * height;
    }
}

class Sphere extends SpaceShape {
    double r = 5;

    public Sphere(Vertex3D v1) {
        v = new Vertex3D[1];
        v[0] = v1;
        area = getArea();
        volume = getVolume();
    }

    @Override
    public String toString() {
        return "Shape: Sphere {" +
                "vertex1: " + v[0].x + "," + v[0].y + "," + v[0].z +
                " Area = " + area +
                " Volume = " + volume +
                '}';
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    @Override
    public double getVolume() {
        return 4 * Math.PI * Math.pow(r, 3) / 3;
    }
}
