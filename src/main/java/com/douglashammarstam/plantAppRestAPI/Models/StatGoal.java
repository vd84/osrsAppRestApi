package com.douglashammarstam.plantAppRestAPI.Models;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class StatGoal {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String typeOfStat;
    private int goalStat;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeOfStat() {
        return typeOfStat;
    }

    public void setTypeOfStat(String typeOfStat) {
        this.typeOfStat = typeOfStat;
    }

    public int getGoalStat() {
        return goalStat;
    }

    public void setGoalStat(int goalStat) {
        this.goalStat = goalStat;
    }
}
