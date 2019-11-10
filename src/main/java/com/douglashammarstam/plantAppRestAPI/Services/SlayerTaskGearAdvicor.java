package com.douglashammarstam.plantAppRestAPI.Services;


import com.douglashammarstam.plantAppRestAPI.Models.Account;
import com.douglashammarstam.plantAppRestAPI.Models.OsrsItem;
import com.douglashammarstam.plantAppRestAPI.Models.StatApiFetcher;
import com.douglashammarstam.plantAppRestAPI.Models.Stats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@Service
@CrossOrigin(origins = "*")
@RestController
public class SlayerTaskGearAdvicor {


    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/slayerGear/{userAccount}", method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<String> addItem(@PathVariable Account userAccount) throws IOException {




        return new ResponseEntity<>(null, HttpStatus.OK);

    }


}
