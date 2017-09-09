package com.bg;

import com.bg.db.IDB;
import com.bg.word.IWord;
import com.bg.word.Word;

import java.util.ArrayList;
import java.util.List;

public class BGOnArrayList implements IBG {
    private List<IWord> words;
    private IDB db;
    private boolean markNewWordsInDB = false;

    public BGOnArrayList( IDB db) {
         this.words = new ArrayList<>();
    }

    @Override
    public void addWord(String word) {
        words.add(new Word(word));
    }

    @Override
    public List<IWord> getWords() {
        /**todo
         * To write a logic,which will be to check if db has new words,
         * and if db has new words then the markNewWordsInDB must be set on true.
         * And write tests for this method.
         * Implement the method, must do - check the db on new words if the mark is true.
         */

        if (markNewWordsInDB) {
            db.receiveData();
        }
        return words;
    }

    /**
     * To change method, must be able to save more one word on one moment to db.
     * @param db
     */
    @Override
    public void saveWordsToDB(IDB db) {
        markNewWordsInDB = true;
        for(IWord word : words){
            db.storeData(word.getWord());
        }
    }

    /**
     * Todo create a method, which will be parse the string to IWord list.
     */
    private List<IWord> parseString(){
        return null;
    }

}
