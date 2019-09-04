package com.douglashammarstam.plantAppRestAPI.Models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class PlantCaringRoutines {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plant_caring_id")
    private int id;
    private int waterFrequencyPerWeek;
    private int amountOfSunLight;
    private String tips;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "plant_caring_id", referencedColumnName = "plant_caring_id")
    private Plant plant;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWaterFrequencyPerWeek() {
        return waterFrequencyPerWeek;
    }

    public void setWaterFrequencyPerWeek(int waterFrequencyPerWeek) {
        this.waterFrequencyPerWeek = waterFrequencyPerWeek;
    }

    public int getAmountOfSunLight() {
        return amountOfSunLight;
    }

    public void setAmountOfSunLight(int amountOfSunLight) {
        this.amountOfSunLight = amountOfSunLight;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public Plant getPlant() {
        return plant;
    }

    public void setPlant(Plant plant) {
        this.plant = plant;
    }
}
