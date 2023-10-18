package com.roananik.lesson17;

import java.util.*;

public class LeetCodeTasks {

    public int numJewelsInStones(String jewels, String stones) {
        if (jewels == null || stones == null) {
            return -1;
        }

        Map<Character, Integer> statistics = new HashMap<>();
        for (Character stone : stones.toCharArray()) {

            statistics.put(stone, statistics.getOrDefault(stone, 0) + 1);


        }
        int result = 0;
        for (Character jewel : jewels.toCharArray()) {
            if (statistics.get(jewel) != null)
                result += statistics.get(jewel);

        }
        return result;
    }


    public int numIdenticalPairs(int[] nums) {
        int result = 0;
        Map<Integer, Integer> pairsStatistics = new HashMap<>();
        for (int num : nums) {
            result += pairsStatistics.getOrDefault(num, 0);
            pairsStatistics.put(num, pairsStatistics.getOrDefault(num, 0) + 1);
        }
        return result;
    }


    public int maxNumberOfBalloons(String text) {
        int b = 0;
        int a = 0;
        int l = 0;
        int o = 0;
        int n = 0;

        int count = 0;

        for (char h : text.toCharArray()) {
            switch (h) {
                case 'b' -> b++;
                case 'a' -> a++;
                case 'l' -> l++;
                case 'o' -> o++;
                case 'n' -> n++;

            }
            if (b >= 1 && a >= 1 && l >= 2 && o >= 2 && n >= 1) {
                count++;
                b -= 1;
                a -= 1;
                l -= 2;
                o -= 2;
                n -= 1;
            }
        }


        return count;
    }
}