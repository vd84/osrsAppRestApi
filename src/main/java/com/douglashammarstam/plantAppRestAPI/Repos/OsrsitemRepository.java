package com.douglashammarstam.plantAppRestAPI.Repos;

import com.douglashammarstam.plantAppRestAPI.Models.OsrsItem;
import org.springframework.data.repository.CrudRepository;

public interface OsrsitemRepository extends CrudRepository<OsrsItem, Integer>, OsrsItemrepositoryCustom {


}
