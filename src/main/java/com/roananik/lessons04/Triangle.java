package com.roananik.lessons04;

public class Triangle implements AreaFigure {
    private double sideA;
    private double sideB;
    private double sideC;

    private double triangleAreaTwoSide() {
        return 0.5 * sideA * sideB;
    }


    @Override
    public double area() {
        if (sideC <= 0) {
            return triangleAreaTwoSide();
        } else if (sideA <= 0 || sideB <= 0) {
            return 0;
        }


        double sumSidesDividedByTwo = (sideA + sideB + sideC) / 2;
        return Math.sqrt(sumSidesDividedByTwo * (sumSidesDividedByTwo - sideA) * (sumSidesDividedByTwo - sideB) *
                (sumSidesDividedByTwo - sideC));
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle(double base, double height) {
        this.sideA = base;
        this.sideB = height;
    }
}
