package ru.dataart.academy.java.figures;

public class Circle extends Figure {
    private int Radius=0;

    public void setRadius(int radius) {
        this.Radius = radius;
    }

    public int getRadius() {
        return Radius;
    }

    public Circle(int radius) {
        this.Radius = radius;
    }

    public double Perimeter() {
        return 2 * Radius * Math.PI;
    }

    ;

    public double Area() {
        return Math.PI * Radius * Radius;
    }

    ;
}
