package com.bg.translator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Translator implements ITranslator {
    private final String TRANSLATOR_URL = "";
    private final String USER_AGENT = "Mozilla/5.0";
    @Override
    public String getTranslate(String word) {
        HttpURLConnection con = null;
        BufferedReader br = null;
        try {
            URL url = new URL(TRANSLATOR_URL);
            con = (HttpURLConnection) url.openConnection();

            con.setRequestMethod("GET");
            con.setRequestProperty("User-Agent", USER_AGENT);

            br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }

            return response.toString();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "No translate!";
    }

}
