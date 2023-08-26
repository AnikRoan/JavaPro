package com.roananik.lessons03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnagramTest {
    @Test
    public void anagramTrue(){
        Assertions.assertTrue(Anagram.isAnagram("anagram","nagaram"));
    }
    @Test
    public void  anagramFalse(){
        Assertions.assertFalse(Anagram.isAnagram("rat","car"));
    }
    @Test
    public void nullString(){
        Assertions.assertFalse(Anagram.isAnagram("car",null));

    }
}
