package com.douglashammarstam.plantAppRestAPI.Models;

import com.douglashammarstam.plantAppRestAPI.Repos.OsrsMonsterRepo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class OsrsMonsterFetcher {

    private OsrsMonsterRepo osrsMonsterRepo;

    private final String URL = "https://www.osrsbox.com/osrsbox-db/monsters-complete.json";


    public OsrsMonsterFetcher() {
        try {
            URL url = new URL(URL);

            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream())
            );
            String inputLine;
            StringBuilder content = new StringBuilder();
            while((inputLine = in.readLine()) != null){
                content.append(inputLine);
                System.out.println(inputLine);

            }


            in.close();



        } catch (
                MalformedURLException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
