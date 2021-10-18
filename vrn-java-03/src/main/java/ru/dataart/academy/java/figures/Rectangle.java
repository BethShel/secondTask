package ru.dataart.academy.java.figures;

public class Rectangle extends Figure {
    private int firstSide, secondSide;

    public Rectangle(int firstSide, int secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    public double Perimeter() {
        return 2 * (firstSide + secondSide);
    }

    public double Area() {
        return firstSide * secondSide;
    }
}
