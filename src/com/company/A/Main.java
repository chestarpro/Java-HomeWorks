package com.company.A;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	    Team barcelona = new Team("Barcelona", new Game());
	    Team realMadrid = new Team("Real Madrid", new Game());
	    Statistics statistics = new Statistics(barcelona, realMadrid);

	    barcelona.setPriority(10);
	    realMadrid.setPriority(10);
	    statistics.setPriority(1);

	    barcelona.start();
	    realMadrid.start();
	    statistics.start();
    }
}
