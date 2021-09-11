package com.company.A;

public class Statistics extends Thread {
    private volatile Team team1;
    private volatile Team team2;

    public Statistics(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    @Override
    public void run() {
        getStatistics();
    }

    public synchronized void getStatistics() {
        synchronized (this) {
            System.out.println(team1 + " \n" + team2);
        }
        synchronized (this) {
           if(team1.getGame().getGoalCount() > team2.getGame().getGoalCount()) {
               System.out.println(team1.getTeamName() + " победила!");
           } else if(team1.getGame().getGoalCount() == team2.getGame().getGoalCount()) {
               System.out.println("Ничья!");
           } else System.out.println(team2.getTeamName() + " победила!");
       }
    }
}
