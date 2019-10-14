package com.douglashammarstam.plantAppRestAPI.Services;

import com.douglashammarstam.plantAppRestAPI.Models.Account;
import com.douglashammarstam.plantAppRestAPI.Models.Stats;
import com.douglashammarstam.plantAppRestAPI.Repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@CrossOrigin(origins = "*")
@RestController
public class AccountService {

    @Autowired
    UserRepository userRepository;



    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public ResponseEntity<Account> getOneAccount(@PathVariable("id") int id) {



        if(!userRepository.findById(id).isPresent()){
            System.out.println("No account found");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        Account account = userRepository.findById(id).get();

        return new ResponseEntity<>(account, HttpStatus.OK);




    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ResponseEntity<List<Account>> addAccount(@RequestBody Account account) {

        Optional<Account> userOptional = userRepository.findById(account.getId());

        if (userOptional.isPresent()) {
            System.out.println("Account already exists");
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        } else {
            account.setStats(new Stats(account.getUsername()));
            userRepository.save(account);
            return new ResponseEntity<>(HttpStatus.CREATED);

        }

    }



    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/user/login/{username}", method = RequestMethod.GET)
    public ResponseEntity<List<Account>> login(@PathVariable("username") String username) {

        System.out.println(username);


        Iterable<Account> users = userRepository.login(username);

        List<Account> target = new ArrayList<>();
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
