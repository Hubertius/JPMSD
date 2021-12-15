package pl.samouczekprogramisty.kursjava;

import java.util.*;

public class Monster implements ISaveable {
    // write code here
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return this.name;
    }

    public int getHitPoints() {
        return this.hitPoints;
    }

    public int getStrength() {
        return this.strength;
    }

    @Override
    public List<String> write() {
        ArrayList<String> listToWrite = new ArrayList<>();
        listToWrite.add("" + this.name);
        listToWrite.add("" + this.hitPoints);
        listToWrite.add("" + this.strength);
        return listToWrite;
    }

    @Override
    public void read(List<String> listToRead) {
        if(listToRead == null || listToRead.size() == 0) {
            return;
        }
        this.name = listToRead.get(0);
        this.hitPoints = Integer.parseInt(listToRead.get(1));
        this.strength = Integer.parseInt(listToRead.get(2));
    }

    @Override
    public String toString() {
        return "Monster{name=\'" + this.name + "\', hitPoints=" + this.hitPoints + ", strength=" + this.strength +"}";
    }
}