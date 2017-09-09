package com.bg.ui;

import com.bg.BGOnArrayList;
import com.bg.IBG;
import com.bg.db.IDB;
import com.bg.db.SimpleDB;
import com.bg.word.IWord;
import com.bg.word.Word;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UI {
    private IBG bg = new BGOnArrayList(new SimpleDB());

    public void start() {

        BufferedReader br = null;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                System.out.println("Enter word or command:");
                String line = br.readLine();
                if ("Exit".equals(line)) {
                    System.out.println("Program is stopped!");
                    System.exit(0);
                } else if ("Print words".equals(line)) {
                    printWords();
                } else {
                    bg.addWord(line);
                    System.out.println("You add word - " + line);
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    private void printWords() {
        for (IWord word : bg.getWords()) {
            System.out.println(word.getWord());
        }
    }

}
