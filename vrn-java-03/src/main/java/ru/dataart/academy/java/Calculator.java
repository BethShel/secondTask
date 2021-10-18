package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.Figure;

public class Calculator {
    public Calculator() {
    }

    public double Calculate(Figure[] array) {
        double result=0;
        int len=array.length;
        for(int i=0;i<len;i++){
            result+=array[i].Area();
        }
        return result;
    }

    ;

}
