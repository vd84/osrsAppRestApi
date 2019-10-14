package com.douglashammarstam.plantAppRestAPI.Repos;

import com.douglashammarstam.plantAppRestAPI.Models.Account;
import org.springframework.data.repository.CrudRepository;



public interface UserRepository extends CrudRepository<Account, Integer>, UserRepositoryCustom {

}

