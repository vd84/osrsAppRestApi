package com.douglashammarstam.plantAppRestAPI.Services;

import com.douglashammarstam.plantAppRestAPI.Models.GrandExchangeHelper;
import com.douglashammarstam.plantAppRestAPI.Models.OsrsItem;
import com.douglashammarstam.plantAppRestAPI.Repos.OsrsitemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Service
@CrossOrigin(origins = "*")
@RestController
public class OsrsItemService {

    private GrandExchangeHelper grandExchangeHelper = new GrandExchangeHelper();


    @Autowired
    private OsrsitemRepository osrsitemRepository;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/addOsrsItems", method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<String> addItem(@RequestBody List<OsrsItem> items) {

        for (OsrsItem o: items){
            osrsitemRepository.save(o);
        }
        return new ResponseEntity<String>("Success", HttpStatus.OK);


    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/item/{itemName}/object", method = RequestMethod.GET, consumes = "application/json")
    public ResponseEntity<OsrsItem> getItem(@PathVariable String itemName) {


        OsrsItem osrsItem = osrsitemRepository.findByTitle(itemName);

        return new ResponseEntity<>(osrsItem, HttpStatus.OK);



}


    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/item/{itemName}/full", method = RequestMethod.GET)
    public ResponseEntity<String> getOneItem(@PathVariable String itemName) {


        String itemFetched  = getItemByName(itemName);

        if (itemFetched == null) {
            System.out.println("Problem reciveing item");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(itemFetched, HttpStatus.OK);


    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/item/{itemName}/img", method = RequestMethod.GET)
    public ResponseEntity<String> getOneItemImg(@PathVariable String itemName) {


        String imgUrl  = getItemByName(itemName);


        if (imgUrl == null) {
            System.out.println("Problem reciveing item");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(imgUrl, HttpStatus.OK);


    }

    private String getItemByName(String itemName){

        int id = osrsitemRepository.findByTitle(itemName).getId();

        return  grandExchangeHelper.getOneItemDetails(id);


    }


    public void addTodaysPricesForAllItems() {






    }








}
