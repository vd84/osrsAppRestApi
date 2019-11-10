package com.douglashammarstam.plantAppRestAPI.Models;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class OsrsMonster {

    @Id
    private int id;
    private String name;
    private boolean incomplete;
    private boolean members;
    private String releaseDate;
    private int combatLevel;
    private int size;
    private int hitPoints;
    private int maxHit;
    private String[] attackType;
    private int attackSpeed;
    private boolean aggresive;
    private boolean posionous;
    private boolean immunePosion;
    private boolean immuneVenom;
    private String[] weakness;
    private boolean slayerMonster;
    private int slayerLevel;
    private double slayerXp;
    private String[] slayerMasters;
    private String examine;
    private String wikiName;
    private String wikiUrl;
    private int atkLvl;
    private int strLvl;
    private int defLvl;
    private int mageLvl;
    private int rangedLvl;
    private int attackStab;
    private int attackSlash;
    private int attackCrush;
    private int attackMagic;
    private int attackRanged;
    private int defenceStab;
    private int defenceSlash;
    private int defenceCrush;
    private int defenceMagic;
    private int defenceRanged;
    private int atkAccuracy;
    private int meeleStr;
    private int rangedStr;
    private int mageDmg;
    private String[] drops;
    private boolean rareDropTable;



}
