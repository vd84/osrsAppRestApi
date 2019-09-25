package com.douglashammarstam.plantAppRestAPI.Services;

import com.douglashammarstam.plantAppRestAPI.Models.Plant;
import com.douglashammarstam.plantAppRestAPI.Models.User;
import com.douglashammarstam.plantAppRestAPI.Repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@CrossOrigin(origins = "*")
@RestController
public class UserService {

    @Autowired
    UserRepository userRepository;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ResponseEntity<List<User>> getAllUsers() {

        Iterable<User> users = userRepository.findAll();

        List<User> target = new ArrayList<>();
        users.forEach(target::add);
        return new ResponseEntity<>(target, HttpStatus.OK);
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ResponseEntity<List<User>> addUser(@RequestBody User user) {

        Optional<User> userOptional = userRepository.findById(user.getId());

        if (userOptional.isPresent()) {
            System.out.println("User already exists");
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        } else {
            userRepository.save(user);
            return new ResponseEntity<>(HttpStatus.CREATED);

        }

    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/user/login/{username}", method = RequestMethod.GET)
    public ResponseEntity<List<User>> loginUser(@PathVariable("username") String username) {

        System.out.println(username);


        Iterable<User> users = userRepository.login(username);

        List<User> target = new ArrayList<>();
        users.forEach(target::add);

        if (target.isEmpty()) {
            System.out.println("user does not exists");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        } else {
            System.out.println("user founds");
            return new ResponseEntity<>(target, HttpStatus.OK);

        }

    }


}
