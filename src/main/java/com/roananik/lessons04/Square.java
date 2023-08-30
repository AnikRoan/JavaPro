package com.roananik.lessons04;

public class Square implements AreaFigure {

    private double sideLength;

    @Override
    public double area() {
        if (sideLength <= 0) {
            return 0;
        }
        return sideLength * sideLength;
    }

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }
}
