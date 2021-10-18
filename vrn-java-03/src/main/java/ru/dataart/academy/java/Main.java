package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.Figure;
import ru.dataart.academy.java.figures.Rectangle;
import ru.dataart.academy.java.figures.Circle;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task for Java OOP");
        Figure rectangle1 = new Rectangle(2, 4);
        Figure rectangle2 = new Rectangle(2, 1);
        Figure rectangle3 = new Rectangle(2, 3);
        Figure circle=new Circle(2);
        Calculator calculator = new Calculator();
        System.out.println("Sum of Areas: " + calculator.Calculate(new Figure[]{rectangle1, rectangle2, rectangle3, circle}));
    }
}