package com.douglashammarstam.plantAppRestAPI.Repos;

import com.douglashammarstam.plantAppRestAPI.Models.Stats;
import org.springframework.data.repository.CrudRepository;

public interface StatsRepo extends CrudRepository<Stats, Integer>, StatsRepoCustom{
}
