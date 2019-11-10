package com.douglashammarstam.plantAppRestAPI.Services;

import com.douglashammarstam.plantAppRestAPI.Models.Account;
import com.douglashammarstam.plantAppRestAPI.Models.GrandExchangeHelper;
import com.douglashammarstam.plantAppRestAPI.Repos.OsrsItemrepositoryCustom;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.io.FileReader;
import java.io.IOException;


@Service
@CrossOrigin(origins = "*")
@RestController
public class GrandExchangeService {





    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/ge/all", method = RequestMethod.GET)
    public ResponseEntity<String> getAllItems() throws IOException {


        String returnString =  null;

        FileReader reader = new FileReader("/Users/douglashammarstam/Dropbox/plantAppRestAPI/src/main/resources/static/ALLITEMSJSON");


        JSONParser jsonParser = new JSONParser();
        try {
            returnString = jsonParser.parse(reader).toString();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(returnString);


        return new ResponseEntity<>(returnString, HttpStatus.OK);
    }












}
