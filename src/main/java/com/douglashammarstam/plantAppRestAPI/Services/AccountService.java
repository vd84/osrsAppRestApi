package com.douglashammarstam.plantAppRestAPI.Services;

import com.douglashammarstam.plantAppRestAPI.Models.Account;
import com.douglashammarstam.plantAppRestAPI.Models.StatApiFetcher;
import com.douglashammarstam.plantAppRestAPI.Models.Stats;
import com.douglashammarstam.plantAppRestAPI.Repos.AccountRepo;
import com.douglashammarstam.plantAppRestAPI.Repos.StatsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@CrossOrigin(origins = "*")
@RestController
public class AccountService {

    @Autowired
    AccountRepo accountRepo;

    @Autowired
    StatsRepo statsRepo;


    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/user/{username}", method = RequestMethod.GET)
    public ResponseEntity<Account> getOneAccount(@PathVariable("username") String username) {


        Account account = accountRepo.findUserByName(username);

        if (account == null) {
            System.out.println("account is null");
        }

        System.out.println(account.getStats());


        return new ResponseEntity<>(account, HttpStatus.OK);


    }


    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ResponseEntity<Account> addAccount(@RequestBody Account account) throws IOException {


        if(account == null){
            System.out.println("Null Account AddAccount()");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        if(accountRepo.findUserByName(account.getUsername()) != null){
            System.out.println("Account already exists AddAccount()");
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }


        String accountName = account.getUsername();
        Stats stats = new Stats(accountName);
        account.setStats(stats);
        statsRepo.save(stats);
        accountRepo.save(account);
        System.out.println(account);
        System.out.println(account.getStats());
        return new ResponseEntity<>(account, HttpStatus.CREATED);

    }




}
