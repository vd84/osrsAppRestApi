package com.douglashammarstam.plantAppRestAPI.Services;


import com.douglashammarstam.plantAppRestAPI.Models.OsrsItem;
import com.douglashammarstam.plantAppRestAPI.Models.OsrsMonster;
import com.douglashammarstam.plantAppRestAPI.Repos.OsrsMonsterRepo;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@CrossOrigin(origins = "*")
@RestController
public class OsrsMonsterService {


    @Autowired
    OsrsMonsterRepo osrsMonsterRepo;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/addOsrsMonsters", method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<String> addItem(@RequestBody String body) {


        return null;
    }
}
