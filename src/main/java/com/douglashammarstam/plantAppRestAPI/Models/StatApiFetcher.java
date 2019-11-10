package com.douglashammarstam.plantAppRestAPI.Models;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class StatApiFetcher {

    private final String HISCOREAPIURL = "https://secure.runescape.com/m=hiscore_oldschool/index_lite.ws?player=";

    private String statJson;

    public StatApiFetcher(String accountName) throws IOException {
        try {
            URL url = new URL(HISCOREAPIURL + accountName);

            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream())
            );
            String inputLine;
            StringBuilder content = new StringBuilder();
            while((inputLine = in.readLine()) != null){
                content.append(inputLine);

            }
            in.close();

            this.statJson = "" + content;

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }

    public String getHISCOREAPIURL() {
        return HISCOREAPIURL;
    }

    public String getStatJson() {
        return statJson;
    }

    public void setStatJson(String statJson) {
        this.statJson = statJson;
    }
}
