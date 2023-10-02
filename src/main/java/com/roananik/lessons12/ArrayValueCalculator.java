package com.roananik.lessons12;

import java.util.Arrays;

public class ArrayValueCalculator {
   // private static int arrayLineIndex = 0;


    public static void main(String[] args) throws ArraySizeException {
        String[][] s = new String[][]{
                {"1", "1", "1","1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", ".", "1"}
        };


        try {
            System.out.println("sum:"+doCalc(s));
        } catch (ArrayDataException | ArraySizeException e){
            System.out.println(e.getMessage());
        }


    }

    public static int doCalc(String[][] data) throws ArraySizeException {
        sizeCheck(data);
        int sum = 0;
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data[i].length;j++){
                sum+=convertSymbol(data[i][j],i,j);

            }
        }
return sum;

    }

    private static int convertSymbol(String symbol,int height, int index){
        int sum=0;
        try {
            sum+=Integer.parseInt(symbol);
        }catch (NumberFormatException e){
            // System.out.println("wrong sumbol --"+symbol+ "-- position:"+"["+line+"]"+"["+hige+"]");
           throw new ArrayDataException("wrong sumbol --"+symbol+ "-- position:"+"["+height+"]"+"["+index+"]");
        }
        return sum;
    }

//    public static int doCalc(String[][] data) throws ArraySizeException {
//        sizeCheck(data);
//
//        return Arrays.stream(data).mapToInt(ArrayValueCalculator::getConvertDataLineSum).sum();
//
//    }

    private static void sizeCheck(String[][] data) throws ArraySizeException {
        if (data.length != 4) throw new ArraySizeException("wrong size!!");
        for (String[] datum : data) {
            if (datum.length != 4) throw new ArraySizeException("wrong size!!");
        }

    }

//    private static int getConvertDataLineSum(String[] line) throws ArrayDataException {
//         int lineSum = 0;
//
//        for (int i = 0; i < line.length; i++) {
//
//            try {
//                lineSum += Integer.parseInt(line[i]);
//            } catch (ArrayDataException e) {
//             // System.out.println("wrong index " + "[" + arrayLineIndex + "]" + "[" + i + "]");
//               throw new ArrayDataException("wrong index ");
//
//            }catch (NumberFormatException e){
//                System.out.println("wrong index " + "[" + arrayLineIndex + "]" + "[" + i + "]");
//
//            }
//        }
//        arrayLineIndex++;
//
//
//        return lineSum;
//
//    }


}
