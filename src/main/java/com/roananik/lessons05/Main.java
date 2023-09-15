package com.roananik.lessons05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        DifferentMethods dif = new DifferentMethods();
        dif.calcOccurance(new ArrayList<>(Arrays.asList("bird", "bird", "fox", "cat")));
        List<String> l = dif.findOccurance(new ArrayList<>(Arrays.asList("pop", "pop", "cot", "wolli", "wolli", "wolli", "wolli")));
        System.out.println(l);
        int[] i = {1, 2, 3, 4, 5, 6, 7, 8};
        List<Integer> list = dif.toList(i);
        System.out.println(list);
        System.out.println(dif.countOccurance(Arrays.asList("pop", "pop", "cot", "wolli", "wolli", "wolli", "wolli"), "wolli"));
        List<Integer> unikumList = dif.findUnique(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4)));


        System.out.println(unikumList);
    }

}
