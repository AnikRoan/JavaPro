package com.roananik.lessons06;

import java.util.*;

public class Tasks {
    public boolean isPalindrome(String s) {
        //not fast but short
        // if ( s.equals(" ")) {
        //        return true;
        //    }
        //
        //    s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        //    return s.equals(new StringBuilder(s).reverse().toString());


        if (s.equals(" ")) {
            return true;
        }

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));

            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } else if (leftChar != rightChar) {
                return false;
            } else {
                left++;
                right--;
            }
        }

        return true;
    }


    public boolean containsDuplicate(int[] nums) {
        //not fast
        //     int []distinct = Arrays.stream(nums).distinct().toArray();
        //     if(Arrays.equals(distinct,nums)){
        //         return false;
        //     }
        //     return true;

        Set<Integer> distinct = new HashSet<>();
        for (int number : nums) {
            if (distinct.contains(number)) {
                return true;
            }
            distinct.add(number);
        }
        return false;


    }


    public int[] twoSum(int[] nums, int target) {
        // not fast (((
//        int[] result = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    result[0] = i;
//                    result[1] = j;
//
//                }
//            }
//        }
//        return result;


        Map<Integer, Integer> suitable = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int required = target - current;
            if (suitable.containsKey(required)) {
                return new int[]{suitable.get(required), i};

            }
            suitable.put(current, i);
        }
        return null;


    }
}
