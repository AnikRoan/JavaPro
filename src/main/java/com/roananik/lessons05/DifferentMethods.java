package com.roananik.lessons05;

import java.util.*;


public class DifferentMethods {
    public int countOccurance(List<String> list, String string) {
        return Collections.frequency(list,string);

    }


    public List<Integer> toList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (Integer lists : array) {
            list.add(lists);
        }
        return list;

    }

    public List<String> toList(String[] array) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, array);
        return list;
    }

    public List<Double> toList(double[] array) {
        List<Double> list = new ArrayList<>();
        for (Double lists : array) {
            list.add(lists);
        }
        return list;
    }

    public List<Character> toList(char[] array) {
        List<Character> list = new ArrayList<>();
        for (Character lists : array) {
            list.add(lists);
        }
        return list;
    }

    public List<Float> toList(float[] array) {
        List<Float> list = new ArrayList<>();
        for (Float lists : array) {
            list.add(lists);
        }
        return list;
    }

    public List<Byte> toList(byte[] array) {
        List<Byte> list = new ArrayList<>();
        for (Byte lists : array) {
            list.add(lists);
        }
        return list;
    }

    public List<Boolean> toList(boolean[] array) {
        List<Boolean> list = new ArrayList<>();
        for (Boolean lists : array) {
            list.add(lists);
        }
        return list;
    }

    public <T> List<T> toList(T[] array) {
        List<T> list = new ArrayList<>();
        Collections.addAll(list, array);
        return list;
    }


    public List<Integer> findUnique(List<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("list is Empty");
        }

        return list.stream().distinct().toList();

    }


    public void calcOccurance(List<String> list) {


        if (list.isEmpty()) {
            System.out.println("list is Empty");
        }
        Set<String> setWords = new HashSet<>();

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            for (String s : list) {
                if (list.get(i).equals(s)) {
                    count++;
                }
            }
            setWords.add(list.get(i) + ": " + count);
            count = 0;

        }
        for (String stringResult : setWords) {
            System.out.println(stringResult);
        }

    }


    public List<String> findOccurance(List<String> list) {
        if (list.isEmpty()) {
            System.out.println("list is Empty");
        }
        Set<String> result = new HashSet<>();


        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            for (String s : list) {
                if (list.get(i).equals(s)) {
                    count++;
                }
            }

            result.add("{name: \"" + list.get(i) + "\", occurrence: " + count + "}");
            count = 0;
        }
        return new ArrayList<>(result);


    }

}
