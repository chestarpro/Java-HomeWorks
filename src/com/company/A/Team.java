package com.company.A;

public class Team extends Thread {
    private String teamName;
    private volatile Game game;

    public Team(){}

    public Team(String name, Game game) {
        this.teamName = name;
        this.game = game;
    }

    @Override
    public void run() {
       game.playFootball();
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String name) {
        this.teamName = name;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public String toString() {
        return  teamName + " - " + game + "\n";
    }
}
