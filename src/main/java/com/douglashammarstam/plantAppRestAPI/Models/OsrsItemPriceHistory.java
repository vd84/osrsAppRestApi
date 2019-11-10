package com.douglashammarstam.plantAppRestAPI.Models;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class OsrsItemPriceHistory {




    @Id
    private int id;
    private String date;
    private int price;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "item_id", referencedColumnName = "id")
    private OsrsItem osrsItem;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public OsrsItem getOsrsItem() {
        return osrsItem;
    }

    public void setOsrsItem(OsrsItem osrsItem) {
        this.osrsItem = osrsItem;
    }
}
