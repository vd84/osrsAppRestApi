package com.douglashammarstam.plantAppRestAPI.Repos;

import com.douglashammarstam.plantAppRestAPI.Models.Plant;
import com.douglashammarstam.plantAppRestAPI.Models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface PlantRepositoryCustom {


    @Query(value = "call sproc_get_plants_with_specific_userId(:id_in)", nativeQuery = true)
    List<Plant> findPlantsWithSpecificUserId(@Param("id_in") int id);

}
