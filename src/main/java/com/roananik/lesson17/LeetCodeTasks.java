package com.roananik.lesson17;

import java.util.*;

public class LeetCodeTasks {

    public int numJewelsInStones(String jewels, String stones) {

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
        int bCount = 0;
        int aCount = 0;
        int lCount = 0;
        int oCount = 0;
        int nCount = 0;

        int quantityballoons = 0;

        for (char letter : text.toCharArray()) {
            switch (letter) {
                case 'b' -> bCount++;
                case 'a' -> aCount++;
                case 'l' -> lCount++;
                case 'o' -> oCount++;
                case 'n' -> nCount++;

            }
            if (bCount >= 1 && aCount >= 1 && lCount >= 2 && oCount >= 2 && nCount >= 1) {
                quantityballoons++;
                bCount -= 1;
                aCount -= 1;
                lCount -= 2;
                oCount -= 2;
                nCount -= 1;
            }
        }


        return quantityballoons;
    }
}