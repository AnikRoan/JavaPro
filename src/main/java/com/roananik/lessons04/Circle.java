package com.roananik.lessons04;

public class Circle implements AreaFigure {
    private double radius;


    @Override
    public double area() {
        if (radius <= 0) {
            return 0;
        }
        return Math.PI * radius * radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
