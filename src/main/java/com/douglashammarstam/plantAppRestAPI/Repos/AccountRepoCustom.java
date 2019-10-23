package com.douglashammarstam.plantAppRestAPI.Repos;

import com.douglashammarstam.plantAppRestAPI.Models.Account;
import com.douglashammarstam.plantAppRestAPI.Models.OsrsItem;
import com.douglashammarstam.plantAppRestAPI.Models.Stats;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface AccountRepoCustom {

    @Query(value = "call sproc_login(:username_in)", nativeQuery = true)
    List<Account> login(@Param("username_in") String username);

    @Query(value = "SELECT * FROM account a WHERE a.username  = :osrs_username_in",
            nativeQuery = true
    )
    Account findUserByName(@Param("osrs_username_in") String osrs_username_in);

    @Query(value = "INSERT into stats(cook_lvl, agil_lvl, atk_lvl, const_lvl, craft_lvl, def_lvl, farm_lvl, fish_lvl, fletch_lvl, fm_lvl, herb_lvl, hp_lvl, hunt_lvl, mag_lvl, mining_lvl, over_all_lvl, pray_lvl, rc_lvl, rng_lvl, slay_lvl, smith_lvl, str_lvl, thiev_lvl, wc_lvl) values " +
            "(cook_lvl,agil_lvl,atk_lvl,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24)",

            nativeQuery = true
    )
    Stats addStats(@Param("cook_lvl") String in_cook_lvl, @Param("agil_lvl") String in_agil_lvl, @Param("atk_lvl") String in_atk_lvl);


}