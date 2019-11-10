package com.douglashammarstam.plantAppRestAPI.Models;

public class RecommendedGear {

    private OsrsItem helm;
    private OsrsItem weapon;
    private OsrsItem necklase;
    private OsrsItem shield;
    private OsrsItem cape;
    private OsrsItem body;
    private OsrsItem legs;
    private OsrsItem boots;
    private OsrsItem gloves;
    private OsrsItem ring;
    private OsrsItem quiver;

    public RecommendedGear(OsrsItem helm, OsrsItem weapon, OsrsItem necklase, OsrsItem shield, OsrsItem cape, OsrsItem body, OsrsItem legs, OsrsItem boots, OsrsItem gloves, OsrsItem ring, OsrsItem quiver) {
        this.helm = helm;
        this.weapon = weapon;
        this.necklase = necklase;
        this.shield = shield;
        this.cape = cape;
        this.body = body;
        this.legs = legs;
        this.boots = boots;
        this.gloves = gloves;
        this.ring = ring;
        this.quiver = quiver;
    }

    public OsrsItem getHelm() {
        return helm;
    }

    public void setHelm(OsrsItem helm) {
        this.helm = helm;
    }

    public OsrsItem getWeapon() {
        return weapon;
    }

    public void setWeapon(OsrsItem weapon) {
        this.weapon = weapon;
    }

    public OsrsItem getNecklase() {
        return necklase;
    }

    public void setNecklase(OsrsItem necklase) {
        this.necklase = necklase;
    }

    public OsrsItem getShield() {
        return shield;
    }

    public void setShield(OsrsItem shield) {
        this.shield = shield;
    }

    public OsrsItem getCape() {
        return cape;
    }

    public void setCape(OsrsItem cape) {
        this.cape = cape;
    }

    public OsrsItem getBody() {
        return body;
    }

    public void setBody(OsrsItem body) {
        this.body = body;
    }

    public OsrsItem getLegs() {
        return legs;
    }

    public void setLegs(OsrsItem legs) {
        this.legs = legs;
    }

    public OsrsItem getBoots() {
        return boots;
    }

    public void setBoots(OsrsItem boots) {
        this.boots = boots;
    }

    public OsrsItem getGloves() {
        return gloves;
    }

    public void setGloves(OsrsItem gloves) {
        this.gloves = gloves;
    }

    public OsrsItem getRing() {
        return ring;
    }

    public void setRing(OsrsItem ring) {
        this.ring = ring;
    }

    public OsrsItem getQuiver() {
        return quiver;
    }

    public void setQuiver(OsrsItem quiver) {
        this.quiver = quiver;
    }
}
