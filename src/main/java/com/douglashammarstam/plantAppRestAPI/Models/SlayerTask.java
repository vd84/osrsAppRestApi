package com.douglashammarstam.plantAppRestAPI.Models;

public class SlayerTask {


    private String monster;
    private String quantity;

    public SlayerTask(String monster, String quantity) {
        this.monster = monster;
        this.quantity = quantity;
    }

    public String getMonster() {
        return monster;
    }

    public void setMonster(String monster) {
        this.monster = monster;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
