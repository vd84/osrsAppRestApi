package com.douglashammarstam.plantAppRestAPI.Models;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Data
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;

    private String username;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "stats_id", referencedColumnName = "id")
    private Stats stats;



    private ArrayList<StatGoal> statGoals;

    public ArrayList<Quest> getQuests() {
        return quests;
    }

    public void setQuests(ArrayList<Quest> quests) {
        this.quests = quests;
    }

    private ArrayList<Quest> quests;

    public ArrayList<StatGoal> getStatGoals() {
        return statGoals;
    }

    public void setStatGoals(ArrayList<StatGoal> statGoals) {
        this.statGoals = statGoals;
    }

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


    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }
}

