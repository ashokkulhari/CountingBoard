package com.cb.models;

import java.time.LocalDateTime;

public class Match {
    private final String homeClass;
    private final String awayClass;
    private int homeScore;
    private int awayScore;
    private final long startTime;

    public Match(String homeClass, String awayClass) {
        this.homeClass = homeClass;
        this.awayClass = awayClass;
        this.homeScore = 0;
        this.awayScore = 0;
        this.startTime = System.nanoTime();
    }

    public String getHomeClass() {
        return homeClass;
    }

    public String getAwayClass() {
        return awayClass;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public void updateScore(int homeScore, int awayScore) {
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }

    public Long getStartTime() {
        return startTime;
    }

    public int getTotalScore() {
        return homeScore + awayScore;
    }

    @Override
    public String toString() {
        return homeClass + " " + homeScore + " – " + awayScore + " " + awayClass;
    }
}
