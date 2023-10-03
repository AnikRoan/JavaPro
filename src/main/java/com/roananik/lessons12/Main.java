package com.roananik.lessons12;



public class Main {

    public static void main(String[] args) {
        String[][] data = new String[][]{
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };


        try {
            System.out.println("sum: "+ArrayValueCalculator.doCalc(data));
        } catch (ArrayDataException | ArraySizeException e) {
            System.out.println(e.getMessage());
        }



    }
}
