package com.company.A;

import java.util.Random;

public class Game {
    private int goalCount;
    private int yellowCards;
    private int offsideCount;

    public synchronized void playFootball() {
        synchronized (this) {
            setGoalCount(new Random().nextInt(15));
        }
        synchronized (this) {
            setYellowCards(new Random().nextInt(15));
        }
        synchronized (this) {
            setOffsideCount(new Random().nextInt(15));
        }
    }

    public int getGoalCount() {
        return goalCount;
    }

    public void setGoalCount(int goalCount) {
        this.goalCount = goalCount;
    }

    public int getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(int yellowCards) {
        this.yellowCards = yellowCards;
    }

    public int getOffsideCount() {
        return offsideCount;
    }

    public void setOffsideCount(int offsideCount) {
        this.offsideCount = offsideCount;
    }

    @Override
    public String toString() {
        return String.format("goals: %s, yellow cards: %s, offsides: %s", goalCount, yellowCards, offsideCount);
    }
}
