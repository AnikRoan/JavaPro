package com.roananik.lessons05;

import java.util.*;
import java.util.stream.Stream;

public class DifferentMethods {
    public int countOccurance(List<String> list, String string) {
        int count = 0;

        if (list.isEmpty() || string.isEmpty()) {
            return count;
        }
        String[] words = string.split(" ");
        for (String listWord : list) {
            for (String stringWord : words) {

                if (listWord.equals(stringWord)) {
                    count++;
                }
            }

        }
        return count;

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
        for (String lists : array) {
            list.add(lists);
        }
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
        for (T lists : array) {
            list.add(lists);
        }
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
        Set<String> setWords = new LinkedHashSet<>();

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
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
        Set<String> result = new LinkedHashSet<>();


        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                }
            }

           result.add("{name: \"" + list.get(i) + "\", occurrence: " + count + "}");

            count = 0;
        }
        return new ArrayList<>(result);
        //*** Створити метод findOccurance, що приймає на вхід рядковий
        // список як параметр. Список заповнений довільними словами 10-20 штук,
        // які можуть повторюватись у необмеженій кількості. Обчислити скільки разів
        // трапляється кожне слово. Результат повернути у вигляді списку структур,
        // що описують повторення кожного окремого взятого слова.

    }

}
