package com.douglashammarstam.plantAppRestAPI.Repos;



import com.douglashammarstam.plantAppRestAPI.Models.User;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import java.util.List;
import java.util.Optional;

public class UserRepoImpl implements UserRepositoryCustom {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<User> login(String name) {

        StoredProcedureQuery storedProcedureQuery =  em.createNamedStoredProcedureQuery("check_if_user_exists");

        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);

        storedProcedureQuery.setParameter(1, name);

        return storedProcedureQuery.getResultList();








    }
}
