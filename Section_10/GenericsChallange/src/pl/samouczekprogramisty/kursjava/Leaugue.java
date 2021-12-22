package pl.samouczekprogramisty.kursjava;

import java.util.ArrayList;
import java.util.Collections;

public class Leaugue<T extends Team> {
    private String name;
    private ArrayList<T> leaugue = new ArrayList<>();

    public Leaugue(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean add(T team) {
        if(team == null) {
            return false;
        }
        if(this.leaugue.contains(team)) {
            System.out.println("Leaugue aldready contains this team!");
            return false;
        }
        this.leaugue.add(team);
        return true;
    }

    public void showLeaugue() {
        Collections.sort(this.leaugue);
        for(T team: this.leaugue) {
            System.out.println("Name of team: " + team.getName() + ", ranking: " + team.ranking());
        }
    }

}
