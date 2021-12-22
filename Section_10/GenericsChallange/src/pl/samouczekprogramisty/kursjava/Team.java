package pl.samouczekprogramisty.kursjava;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {

    private String name;
    private int played;
    private int lost;
    private int won;
    private int tied;
    private ArrayList<T> members;

    public Team(String name) {
        this.name = name;
        this.played = 0;
        this.lost = 0;
        this.won = 0;
        this.tied = 0;
        this.members = new ArrayList<>();
    }

    @Override
    public int compareTo(Team<T> tTeam) {
        if(this.ranking() > tTeam.ranking()) {
            return -1;
        } else if(this.ranking() == tTeam.ranking()) {
            return 0;
        }
        return 1;
    }

    public String getName() {
        return this.name;
    }

    public boolean addPlayer(T player) {
        if(members.contains(player)) {
            return false;
        }
        members.add(player);
        return true;
    }

    public int numPlayer() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        this.played++;
        if(ourScore > theirScore) {
            this.won++;
        } else  if(ourScore == theirScore) {
            this.tied++;
        } else {
            this.lost++;
        }
        if(opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }


}
