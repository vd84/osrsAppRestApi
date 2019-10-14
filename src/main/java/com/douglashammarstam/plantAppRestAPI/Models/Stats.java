package com.douglashammarstam.plantAppRestAPI.Models;

import lombok.Data;

import javax.persistence.*;
import java.io.IOException;
import java.lang.reflect.Field;

@Entity
@Data
public class Stats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int overAllLvl;
    private int atkLvl;
    private int strLvl;
    private int defLvl;
    private int hpLvl;
    private int rngLvl;
    private int magLvl;
    private int prayLvl;
    private int CookLvl;
    private int wcLvl;
    private int fletchLvl;
    private int fishLvl;
    private int fmLvl;
    private int craftLvl;
    private int smithLvl;
    private int miningLvl;
    private int herbLvl;
    private int agilLvl;
    private int thievLvl;
    private int slayLvl;
    private int farmLvl;
    private int rcLvl;
    private int huntLvl;
    private int constLvl;


    public Stats(int overAllLvl, int atkLvl, int strLvl, int defLvl, int hpLvl, int rngLvl, int magLvl, int prayLvl, int cookLvl, int wcLvl, int fletchLvl, int fishLvl, int fmLvl, int craftLvl, int smithLvl, int miningLvl, int herbLvl, int agilLvl, int thievLvl, int slayLvl, int farmLvl, int rcLvl, int huntLvl, int constLvl) {
        this.overAllLvl = overAllLvl;
        this.atkLvl = atkLvl;
        this.strLvl = strLvl;
        this.defLvl = defLvl;
        this.hpLvl = hpLvl;
        this.rngLvl = rngLvl;
        this.magLvl = magLvl;
        this.prayLvl = prayLvl;
        this.CookLvl = cookLvl;
        this.wcLvl = wcLvl;
        this.fletchLvl = fletchLvl;
        this.fishLvl = fishLvl;
        this.fmLvl = fmLvl;
        this.craftLvl = craftLvl;
        this.smithLvl = smithLvl;
        this.miningLvl = miningLvl;
        this.herbLvl = herbLvl;
        this.agilLvl = agilLvl;
        this.thievLvl = thievLvl;
        this.slayLvl = slayLvl;
        this.farmLvl = farmLvl;
        this.rcLvl = rcLvl;
        this.huntLvl = huntLvl;
        this.constLvl = constLvl;

    }

    public Stats(String username) {
        String statsJson = null;

        try {
            StatApiFetcher statApiFetcher = new StatApiFetcher(username);
            statsJson = statApiFetcher.getStatJson();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (statsJson == null) {
            System.out.println("Something went wrong with reading the stats");
            return;
        }

        //
        String[] stats = statsJson.split(",");

        Field[] fieldsForThisClass = this.getClass().getDeclaredFields();

        // 49 seems to work with provided json, to retrieve all the stats
        for (int i = 0; i < 49; i++) {
            {

                if (i % 2 != 0) {
                    try {
                        fieldsForThisClass[i/2 + 1].setInt(this, Integer.parseInt(stats[i]));

                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }


                }
            }


        }
        System.out.println(this.toString());



    }

    public Stats() {

    }

    public int getOverAllLvl() {
        return overAllLvl;
    }

    public void setOverAllLvl(int overAllLvl) {
        this.overAllLvl = overAllLvl;
    }

    public int getAtkLvl() {
        return atkLvl;
    }

    public void setAtkLvl(int atkLvl) {
        this.atkLvl = atkLvl;
    }

    public int getStrLvl() {
        return strLvl;
    }

    public void setStrLvl(int strLvl) {
        this.strLvl = strLvl;
    }

    public int getDefLvl() {
        return defLvl;
    }

    public void setDefLvl(int defLvl) {
        this.defLvl = defLvl;
    }

    public int getHpLvl() {
        return hpLvl;
    }

    public void setHpLvl(int hpLvl) {
        this.hpLvl = hpLvl;
    }

    public int getRngLvl() {
        return rngLvl;
    }

    public void setRngLvl(int rngLvl) {
        this.rngLvl = rngLvl;
    }

    public int getMagLvl() {
        return magLvl;
    }

    public void setMagLvl(int magLvl) {
        this.magLvl = magLvl;
    }

    public int getPrayLvl() {
        return prayLvl;
    }

    public void setPrayLvl(int prayLvl) {
        this.prayLvl = prayLvl;
    }

    public int getCookLvl() {
        return CookLvl;
    }

    public void setCookLvl(int cookLvl) {
        CookLvl = cookLvl;
    }

    public int getWcLvl() {
        return wcLvl;
    }

    public void setWcLvl(int wcLvl) {
        this.wcLvl = wcLvl;
    }

    public int getFletchLvl() {
        return fletchLvl;
    }

    public void setFletchLvl(int fletchLvl) {
        this.fletchLvl = fletchLvl;
    }

    public int getFishLvl() {
        return fishLvl;
    }

    public void setFishLvl(int fishLvl) {
        this.fishLvl = fishLvl;
    }

    public int getFmLvl() {
        return fmLvl;
    }

    public void setFmLvl(int fmLvl) {
        this.fmLvl = fmLvl;
    }

    public int getCraftLvl() {
        return craftLvl;
    }

    public void setCraftLvl(int craftLvl) {
        this.craftLvl = craftLvl;
    }

    public int getSmithLvl() {
        return smithLvl;
    }

    public void setSmithLvl(int smithLvl) {
        this.smithLvl = smithLvl;
    }

    public int getMiningLvl() {
        return miningLvl;
    }

    public void setMiningLvl(int miningLvl) {
        this.miningLvl = miningLvl;
    }

    public int getHerbLvl() {
        return herbLvl;
    }

    public void setHerbLvl(int herbLvl) {
        this.herbLvl = herbLvl;
    }

    public int getAgilLvl() {
        return agilLvl;
    }

    public void setAgilLvl(int agilLvl) {
        this.agilLvl = agilLvl;
    }

    public int getThievLvl() {
        return thievLvl;
    }

    public void setThievLvl(int thievLvl) {
        this.thievLvl = thievLvl;
    }

    public int getSlayLvl() {
        return slayLvl;
    }

    public void setSlayLvl(int slayLvl) {
        this.slayLvl = slayLvl;
    }

    public int getFarmLvl() {
        return farmLvl;
    }

    public void setFarmLvl(int farmLvl) {
        this.farmLvl = farmLvl;
    }

    public int getRcLvl() {
        return rcLvl;
    }

    public void setRcLvl(int rcLvl) {
        this.rcLvl = rcLvl;
    }

    public int getHuntLvl() {
        return huntLvl;
    }

    public void setHuntLvl(int huntLvl) {
        this.huntLvl = huntLvl;
    }

    public int getConstLvl() {
        return constLvl;
    }

    public void setConstLvl(int constLvl) {
        this.constLvl = constLvl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Stats{" +
                "id=" + id +
                ", overAllLvl=" + overAllLvl +
                ", atkLvl=" + atkLvl +
                ", strLvl=" + strLvl +
                ", defLvl=" + defLvl +
                ", hpLvl=" + hpLvl +
                ", rngLvl=" + rngLvl +
                ", magLvl=" + magLvl +
                ", prayLvl=" + prayLvl +
                ", CookLvl=" + CookLvl +
                ", wcLvl=" + wcLvl +
                ", fletchLvl=" + fletchLvl +
                ", fishLvl=" + fishLvl +
                ", fmLvl=" + fmLvl +
                ", craftLvl=" + craftLvl +
                ", smithLvl=" + smithLvl +
                ", miningLvl=" + miningLvl +
                ", herbLvl=" + herbLvl +
                ", agilLvl=" + agilLvl +
                ", thievLvl=" + thievLvl +
                ", slayLvl=" + slayLvl +
                ", farmLvl=" + farmLvl +
                ", rcLvl=" + rcLvl +
                ", huntLvl=" + huntLvl +
                ", constLvl=" + constLvl +
                '}';
    }
}
