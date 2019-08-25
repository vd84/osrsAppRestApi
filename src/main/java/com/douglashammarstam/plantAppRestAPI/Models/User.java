package com.douglashammarstam.plantAppRestAPI.Models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(name = "getAllUsers",
                                    procedureName = "getAllUsers",
                                    resultClasses = User.class)
})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;
    private String username;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private List<Plant> userPlants;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Plant> getUserPlants() {
        return userPlants;
    }

    public void setUserPlants(List<Plant> userPlants) {
        this.userPlants = userPlants;
    }
}

