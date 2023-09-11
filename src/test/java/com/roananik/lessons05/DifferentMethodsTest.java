package com.roananik.lessons05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class DifferentMethodsTest {

    DifferentMethods diff = new DifferentMethods();
    @Test
    public void findUniqueTest(){
        List<Integer>list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        Assertions.assertEquals(list,diff.findUnique(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5)));
    }
}
