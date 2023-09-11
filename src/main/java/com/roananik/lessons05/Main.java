package com.roananik.lessons05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DifferentMethods dif = new DifferentMethods();
        dif.calcOccurance(new ArrayList<>(Arrays.asList("popa", "popa", "cot", "wolli", "wolli", "wolli")));
        List<String> l = dif.findOccurance(new ArrayList<>(Arrays.asList("popa", "popa", "cot", "wolli", "wolli", "wolli")));
        System.out.println(l);
        int[] i = {1, 2, 3, 4, 5, 6, 7, 8};
        List<Integer> lister = dif.toList(i);
    }

}
