package com.roananik.lesson17;

import org.junit.Assert;
import org.junit.Test;



public class LeetCodeTasksTest {
    LeetCodeTasks leetCodeTasks = new LeetCodeTasks();

    @Test
    public void numJewelsInStonesTest() {
        String stones = "aAAbBbbBBb";
        String jewels = "aA";
        int result = leetCodeTasks.numJewelsInStones(jewels, stones);
        int expected = 3;

        Assert.assertEquals(expected, result);
    }

    @Test
    public void numJewelsInStonesNegativeTest() {
        String stones = "ZZ";
        String jewels = "z";
        int result = leetCodeTasks.numJewelsInStones(jewels, stones);
        int expected = 0;

        Assert.assertEquals(expected, result);

    }




    @Test
    public void numIdenticalPairsTest() {
        int[] numbers = new int[]{1, 2, 3, 1, 1, 3};
        int expected = 4;

        Assert.assertEquals(expected, leetCodeTasks.numIdenticalPairs(numbers));
    }

    @Test
    public void numIdenticalPairsNegativeTest() {
        int[] numbers = new int[]{1, 2, 3};
        int expected = 0;

        Assert.assertEquals(expected, leetCodeTasks.numIdenticalPairs(numbers));
    }

    @Test
    public void numIdenticalPairsEmptyTest() {
        int[] numbers = new int[]{};
        int expected = 0;

        Assert.assertEquals(expected, leetCodeTasks.numIdenticalPairs(numbers));
    }

    @Test
    public void maxNumberOfBalloonsTest() {
        String letters = "nlaebolko";
        int expected = 1;

        Assert.assertEquals(expected, leetCodeTasks.maxNumberOfBalloons(letters));


    }

    @Test
    public void maxNumberOfBalloonsNegativeTest() {
        String letters = "leetcode";
        int expected = 0;

        Assert.assertEquals(expected, leetCodeTasks.maxNumberOfBalloons(letters));


    }

    @Test
    public void maxNumberOfBalloonsEmptyTest() {
        String letters = "";
        int expected = 0;
        Assert.assertEquals(expected, leetCodeTasks.maxNumberOfBalloons(letters));


    }


}