package com.bg;

import com.bg.db.IDB;
import com.bg.word.IWord;

import java.util.List;

/**
 * Based interface, in  which described base functional.
 */
public interface IBG {
    void addWord(String word);
    List<IWord> getWords();
    void saveWordsToDB(IDB db);
}
