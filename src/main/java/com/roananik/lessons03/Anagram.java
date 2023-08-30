package com.roananik.lessons03;

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.equals("") || t.equals("")) {
            return false;
        }
        char[] firstWord = s.toLowerCase().toCharArray();
        char[] secondWord = t.toLowerCase().toCharArray();
        Arrays.sort(firstWord);
        Arrays.sort(secondWord);
        return Arrays.equals(firstWord, secondWord);

    }

}
