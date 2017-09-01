package com.bg;

import com.bg.word.IWord;

import java.util.List;

/**
 * Based interface, in  which described base functional.
 */
public interface IBG {
    void addWord(IWord word);
    List<IWord> getWords();
}
