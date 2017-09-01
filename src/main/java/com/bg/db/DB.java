package com.bg.db;

import java.io.*;

public class DB implements IDB {
    private final String FILENAME = "/home/kostegan/java_work/bg/src/main/resources/words.txt";

    @Override
    public void storeData(String str) {
        storeToFile(str);
    }

    @Override
    public String receiveData() {
        return null;
    }

    private String readFromFile() {
        BufferedReader br = null;
        FileReader fr = null;

        try {
            File file = new File(FILENAME);
            if (!file.exists()) {
                return "Base is empty";
            }
            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);

            String currentLine;
            StringBuilder stringBuilder = new StringBuilder();
            while ((currentLine = br.readLine()) != null) {
                stringBuilder.append(currentLine + "/n");
            }
            return stringBuilder.toString();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    private void storeToFile(String str) {
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            File file = new File(FILENAME);
            if (!file.exists()) {
                file.createNewFile();
            }

            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);

            bw.write(str);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }


}
