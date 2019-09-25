package com.douglashammarstam.plantAppRestAPI.Services;


import com.douglashammarstam.plantAppRestAPI.Models.Plant;
import com.douglashammarstam.plantAppRestAPI.Models.User;
import com.douglashammarstam.plantAppRestAPI.Repos.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RestController
@CrossOrigin("*")
public class PlantService {


    @Autowired
    PlantRepository plantRepository;

    @RequestMapping(value = "/plant", method = RequestMethod.GET)
    public ResponseEntity<List<Plant>> getAllPlants(){


        Iterable<Plant> plants = plantRepository.findAll();

        List<Plant> target = new ArrayList<>();
        plants.forEach(target::add);

        return new ResponseEntity<>(target, HttpStatus.OK);


    }


    @RequestMapping(value = "/plant/increment/{id}", method = RequestMethod.PUT)
    public ResponseEntity<List<Plant>> incrementSpecificPlantLikes(@RequestBody Plant plant, @PathVariable Integer id){

        Optional<Plant> plantOptional = plantRepository.findById(id);


        if(!plantOptional.isPresent()){
            System.out.println("Plant doesnt exist");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else{
            plant.incrementLikes();
            plantRepository.save(plant);
            return new ResponseEntity<>(HttpStatus.OK);


        }


    }

    @RequestMapping(value = "/plant", method = RequestMethod.POST)
    public ResponseEntity<Plant> addPlant(@RequestBody Plant plant){

        Optional<Plant> plantOptional = plantRepository.findById(plant.getId());

        if(plantOptional.isPresent()){
            System.out.println("plant already exists");
            return new ResponseEntity<Plant>(plant, HttpStatus.CONFLICT);
        } else{
            plantRepository.save(plant);
            return new ResponseEntity<Plant>(plant, HttpStatus.CREATED);

        }




    }

    @RequestMapping(value = "/plant/{id}", method = RequestMethod.GET)
    public ResponseEntity<List<Plant>> getSpecificUsersPlants(@PathVariable int id){


        Iterable<Plant> plants = plantRepository.findPlantsWithSpecificUserId(id);


        List<Plant> target = new ArrayList<>();
        plants.forEach(target::add);

        if (target.isEmpty()) {
            System.out.println("Does not not have any plants");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        } else {
            System.out.println("plants found");
            return new ResponseEntity<>(target, HttpStatus.OK);

        }




    }


}
