package com.bg.word;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordTest {

    @Test
    public void createWord(){
        IWord word = new Word("Cat");
        assertEquals("Word is :","Cat",word.getWord());
    }

}
