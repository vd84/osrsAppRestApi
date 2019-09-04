package com.douglashammarstam.plantAppRestAPI.Repos;

import com.douglashammarstam.plantAppRestAPI.Models.PlantCaringRoutines;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantCaringRepo extends CrudRepository<PlantCaringRoutines, Integer>, PlantCaringRepoCustom {
}
