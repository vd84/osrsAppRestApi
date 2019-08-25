package com.douglashammarstam.plantAppRestAPI.Repos;

import com.douglashammarstam.plantAppRestAPI.Models.User;
import org.springframework.data.repository.CrudRepository;



public interface UserRepository extends CrudRepository<User, Integer>, UserRepositoryCustom {

}

