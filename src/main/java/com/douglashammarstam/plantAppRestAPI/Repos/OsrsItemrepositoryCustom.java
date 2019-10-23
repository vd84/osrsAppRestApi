package com.douglashammarstam.plantAppRestAPI.Repos;

import com.douglashammarstam.plantAppRestAPI.Models.OsrsItem;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OsrsItemrepositoryCustom {

    @Query(value = "SELECT * FROM osrs_item item WHERE item.name  = :osrs_item_in",
            nativeQuery=true
    )
    public OsrsItem findByTitle(@Param("osrs_item_in")String osrs_item_in);
}
