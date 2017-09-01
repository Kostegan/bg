package com.bg.word;

public class Word implements IWord {
    private final String word;

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }
}
