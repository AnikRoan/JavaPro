package com.roananik.lessons12;


public class ArrayValueCalculator {


    public static int doCalc(String[][] data) throws ArraySizeException {
        sizeCheck(data);
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {

                sum += convertSymbol(data[i][j], i, j);

            }
        }
        return sum;

    }


    private static int convertSymbol(String symbol, int height, int index) throws ArrayDataException {
        int convertResult;
        try {

            convertResult = Integer.parseInt(symbol);
        } catch (NumberFormatException e) {

            throw new ArrayDataException("wrong symbol --" + symbol +
                    "-- position:" + "[" + height + "]" + "[" + index + "]");
        }
        return convertResult;
    }


    private static void sizeCheck(String[][] data) throws ArraySizeException {
        if (data.length != 4) throw new ArraySizeException("wrong array size!!");
        for (String[] datum : data) {
            if (datum.length != 4) throw new ArraySizeException("wrong array size!!");
        }

    }


}
