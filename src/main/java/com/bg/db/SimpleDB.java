package com.bg.db;

import java.io.*;

public class SimpleDB implements IDB {
    private final String FILENAME = "C:\\java_work\\bg\\src\\main\\resources\\words.txt";

    @Override
    public void storeData(String str) {
        storeToFile(str);
    }

    @Override
    public String receiveData() {
        return readFromFile();
    }

    private String readFromFile() {
        BufferedReader br = null;
        FileReader fr = null;
        String str = "Base is empty";

        try {
            File file = new File(FILENAME);
            if (!file.exists()) {
                return str;
            }
            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);

            String currentLine;
            StringBuilder stringBuilder = new StringBuilder();
            while ((currentLine = br.readLine()) != null) {
                stringBuilder.append(currentLine);
            }
            str = stringBuilder.toString();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return str;
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
            bw.newLine();
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
