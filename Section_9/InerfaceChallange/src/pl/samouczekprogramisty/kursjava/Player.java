package pl.samouczekprogramisty.kursjava;

import java.util.*;
public class Player implements ISaveable {
    // write code here
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getWeapon() {
        return this.weapon;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getHitPoints() {
        return this.hitPoints;
    }

    public void setStrength(int strength) {
        this.strength  = strength;
    }

    public int getStrength() {
        return this.strength;
    }

    @Override
    public List write() {
        ArrayList listToWrite = new ArrayList<>();
        listToWrite.add("" + this.name);
        listToWrite.add("" + this.hitPoints);
        listToWrite.add("" + this.strength);
        listToWrite.add("" + this.weapon);
        return listToWrite;
    }

    @Override
    public void read(List<String> ls) {
        if(ls == null || ls.size() == 0) {
            return;
        }
        this.hitPoints = Integer.parseInt(ls.get(1));
        this.strength = Integer.parseInt(ls.get(2));;
        this.name = ls.get(0);
        this.weapon = ls.get(3);
    }

    @Override
    public String toString() {
        return "Player{name=\'" + this.name + "\', hitPoints=" + this.hitPoints + ", strength=" + this.strength + ", weapon=\'"
                + this.weapon + "\'}";
    }


}