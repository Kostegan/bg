package com.bg.db;

import com.bg.word.IWord;

import java.util.List;

/**
 * Represents a simple database, stores data in txt file.
 */
public interface IDB {
    void storeData(String str);
    String receiveData();
}
