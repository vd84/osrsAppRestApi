package com.douglashammarstam.plantAppRestAPI.Repos;
import com.douglashammarstam.plantAppRestAPI.Models.BucketList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BucketListRepo extends JpaRepository<BucketList, Long> {
}