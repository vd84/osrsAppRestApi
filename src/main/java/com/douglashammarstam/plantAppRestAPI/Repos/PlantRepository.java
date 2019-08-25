package com.douglashammarstam.plantAppRestAPI.Repos;

import com.douglashammarstam.plantAppRestAPI.Models.Plant;
import org.springframework.data.repository.CrudRepository;

public interface PlantRepository extends CrudRepository<Plant, Integer>, PlantRepositoryCustom {
}
