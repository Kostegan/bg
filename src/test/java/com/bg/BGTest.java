package com.bg;

import com.bg.word.Word;
import org.junit.Test;
import static org.junit.Assert.*;
public class BGTest {
    private IBG createBG(){
        return new BGOnArrayList();
    }

    @Test
    public void addGetWord(){
        IBG bg = createBG();
        bg.addWord(new Word("Cat"));
        assertEquals("Word has inner word: ","Cat",bg.getWords().get(0).getWord());
    }
}
