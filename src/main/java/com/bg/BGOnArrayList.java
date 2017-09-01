package com.bg;

import com.bg.IBG;
import com.bg.word.IWord;

import java.util.ArrayList;
import java.util.List;

public class BGOnArrayList implements IBG {
    private List<IWord> words;

    public BGOnArrayList() {
        this.words = new ArrayList<>();
    }

    @Override
    public void addWord(IWord word) {
        words.add(word);
    }

    @Override
    public List<IWord> getWords() {
        return words;
    }
}
