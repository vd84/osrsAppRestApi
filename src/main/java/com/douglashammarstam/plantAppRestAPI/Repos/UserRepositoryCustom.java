package com.douglashammarstam.plantAppRestAPI.Repos;

import com.douglashammarstam.plantAppRestAPI.Models.Account;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface UserRepositoryCustom {

    @Query(value = "call sproc_login(:username_in)", nativeQuery = true)
    List<Account> login(@Param("username_in") String username);

}