package com.roananik.lessons04;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AreaFigure[] areaFigure = {new Circle(3)
                , new Triangle(4, 6, 5)
                , new Square(4)};
        double areaAll = Arrays.stream(areaFigure).map(e -> e.area()).reduce((a, b) -> a + b).get();
        System.out.println(areaAll);
    }
}
