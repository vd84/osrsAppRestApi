package com.douglashammarstam.plantAppRestAPI.Repos;



import com.douglashammarstam.plantAppRestAPI.Models.User;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import java.util.List;

public class UserRepoImpl implements UserRepositoryCustom {

    @PersistenceContext
    private EntityManager em;




}
