package com.roananik.lessons05;

import java.util.*;
import java.util.stream.Stream;

public class DifferentMethods {
    public static int countOccurance(List<String> list, String string) {
        int count = 0;
        if (list.isEmpty() || string.isEmpty()) {
            return count;
        }
        for (String lists : list) {
            if (lists.equals(string)) {
                count++;
            }
        }
        return count;
        //Створити метод countOccurance, що приймає на вхід рядковий
        // список як параметр і довільний рядок. Список заповнений довільними
        // словами 10-20 штук, які можуть повторюватись у необмеженій кількості.
        // Порахувати скільки разів зустрічається переданий рядок як другий аргумент.


    }

    public  List<Integer> toList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (Integer lists : array) {
            list.add(lists);
        }
        return list;

    }
    public  List<String> toList(String[] array) {
        List<String> list = new ArrayList<>();
        for (String lists : array) {
            list.add(lists);
        }
        return list;
    }
    public  List<Double> toList(double[] array) {
        List<Double> list = new ArrayList<>();
        for (Double lists : array) {
            list.add(lists);
        }
        return list;
    }
    public  List<Character> toList(char[] array) {
        List<Character> list = new ArrayList<>();
        for (Character lists : array) {
            list.add(lists);
        }
        return list;
    }
    public  List<Float> toList(float[] array) {
        List<Float> list = new ArrayList<>();
        for (Float lists : array) {
            list.add(lists);
        }
        return list;
    }
    public  List<Byte> toList(byte[] array) {
        List<Byte> list = new ArrayList<>();
        for (Byte lists : array) {
            list.add(lists);
        }
        return list;
    }
    public  List<Boolean> toList(boolean[] array) {
        List<Boolean> list = new ArrayList<>();
        for (Boolean lists : array) {
            list.add(lists);
        }
        return list;
    }
    public  <T>List<T> toList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T lists : array) {
            list.add(lists);
        }
        return list;
    }

    public static List<Integer> findUnique(List<Integer> list) {
        List<Integer> newList = list.stream().distinct().toList();
        return newList;
        //Створити метод findUnique, що приймає на вхід числовий
        // список, що складається з довільних значень, які можуть
        // повторюватися в необмеженій кількості. Необхідно повернути
        // новий числовий список, що містить тільки унікальні числа.

    }

    public static void calcOccurance(List<String> list) {
        List<String> secondList = list;
        Set<String> set = new LinkedHashSet<>();
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < secondList.size(); j++) {
                if (list.get(i).equals(secondList.get(j))) {
                    count++;
                }
            }
            set.add(list.get(i)+": "+count);
            count = 0;
        }
       for(String s:set){
           System.out.println(s);
       }
        //** Створити метод calcOccurance, який приймає на вхід рядковий
        // список як параметр. Список заповнений довільними словами 10-20 штук,
        // які можуть повторюватись у необмеженій кількості. Обчислити скільки
        // разів трапляється кожне слово. Результат вивести у консоль.

    }

    public static List<String> findOccurance(List<String> list) {
        List<String> secondList = list;
        Set<String> result = new LinkedHashSet<>();
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < secondList.size(); j++) {
                if (list.get(i).equals(secondList.get(j))) {
                    count++;
                }
            }
            result.add("name " +list.get(i) + ", occurence: " + count);

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
