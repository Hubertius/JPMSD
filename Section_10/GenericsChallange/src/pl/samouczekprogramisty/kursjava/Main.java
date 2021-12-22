package pl.samouczekprogramisty.kursjava;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FootballPlayer joe = new FootballPlayer("Joe");
        FootballPlayer josh = new FootballPlayer("Josh");
        BaseballPlayer jeremy = new BaseballPlayer("Jeremy");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        adelaideCrows.addPlayer(josh);

        System.out.println(adelaideCrows.numPlayer());

        Team<FootballPlayer> carrots = new Team<>("Carrots");
        Team<FootballPlayer> bears = new Team<>("Bears");

        bears.matchResult(carrots, 1 ,2);
        carrots.matchResult(adelaideCrows, 2, 1);

        System.out.println("Rankings: ");
        System.out.println("Name: " + adelaideCrows.getName() + ", ranking: " + adelaideCrows.ranking());
        System.out.println("Name: " + bears.getName() + ", ranking: " + bears.ranking());
        System.out.println("Name: " + carrots.getName() + ", ranking: " + carrots.ranking());

        System.out.println();
        System.out.println();
        Leaugue<Team<FootballPlayer>> footballLeaugue = new Leaugue<>("NFL");
        footballLeaugue.add(adelaideCrows);
        footballLeaugue.add(bears);
        footballLeaugue.add(carrots);

        footballLeaugue.showLeaugue();


    }
}
