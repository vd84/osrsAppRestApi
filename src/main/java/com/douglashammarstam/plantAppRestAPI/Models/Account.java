package com.douglashammarstam.plantAppRestAPI.Models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(name = "getAllUsers",
                                    procedureName = "getAllUsers",
                                    resultClasses = Account.class),
        @NamedStoredProcedureQuery(name = "sproc_login",
                procedureName = "sproc_login",
                resultClasses = Account.class)
})
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;

    private String username;
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "stats_id", referencedColumnName = "id")
    private Stats stats;

    
    private List<Quest> quests;




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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }
}

