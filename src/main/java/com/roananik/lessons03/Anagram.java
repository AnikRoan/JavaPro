package com.roananik.lessons03;

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.equals("") || t.equals("")) {
            return false;
        }
        char[] first = s.toLowerCase().toCharArray();
        char[] second = t.toLowerCase().toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first, second);

    }

}
