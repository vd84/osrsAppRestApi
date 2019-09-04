package com.douglashammarstam.plantAppRestAPI.Services;


import com.douglashammarstam.plantAppRestAPI.Models.Plant;
import com.douglashammarstam.plantAppRestAPI.Models.PlantCaringRoutines;
import com.douglashammarstam.plantAppRestAPI.Repos.PlantCaringRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@CrossOrigin("*")
@RestController
public class PlantCaringService {


    @Autowired
    PlantCaringRepo plantCaringRepo;

    @RequestMapping(value = "/plantcaring", method = RequestMethod.GET)
    public ResponseEntity<List<PlantCaringRoutines>> getAllPlantCaring(){


        Iterable<PlantCaringRoutines> plantCaringRoutines = plantCaringRepo.findAll();

        List<PlantCaringRoutines> target = new ArrayList<>();
        plantCaringRoutines.forEach(target::add);

        return new ResponseEntity<>(target, HttpStatus.OK);


    }

    @RequestMapping(value = "/plantcaring", method = RequestMethod.POST)
    public ResponseEntity<PlantCaringRoutines> addPlantCaring(@RequestBody PlantCaringRoutines plantCaringRoutines){

        Optional<PlantCaringRoutines> plantOptional = plantCaringRepo.findById(plantCaringRoutines.getId());

        if(plantOptional.isPresent()){
            System.out.println("plant already exists");
            return new ResponseEntity<PlantCaringRoutines>(plantCaringRoutines, HttpStatus.CONFLICT);
        } else{
            plantCaringRepo.save(plantCaringRoutines);
            return new ResponseEntity<PlantCaringRoutines>(plantCaringRoutines, HttpStatus.CREATED);

        }




    }




}
