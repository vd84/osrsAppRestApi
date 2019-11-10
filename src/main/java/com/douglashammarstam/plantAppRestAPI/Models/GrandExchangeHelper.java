package com.douglashammarstam.plantAppRestAPI.Models;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;


public class GrandExchangeHelper {

    private final String GRAND_EXCHANGE_URL = "http://services.runescape.com/m=itemdb_oldschool/api/catalogue/detail.json?item=";


    public GrandExchangeHelper() {

    }

    public String getOneItemDetails(int itemId){
        System.out.println(itemId);

        String itemInformation = "";

        try {
            URL url = new URL(GRAND_EXCHANGE_URL + itemId);

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
            itemInformation = ""+content;


            in.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

        if(itemInformation.equals(""))
            System.out.println("Problem retrieving item");

        System.out.println(itemInformation);

        return itemInformation;


    }



    public int getCurrentPriceForOneItem(int itemId){


        String[] itemDetails = getOneItemDetails(itemId).split(",");
        String s = (itemDetails[8].split(":")[1].split("}")[0]);

        System.out.println(s);
        return Integer.parseInt(s);

    }


}
