package com.fanleagueent.fanleague.domain.models.games;

/**
 * Created by st1ch on 22.12.16.
 */

public class Score {

    private int homeTeam;
    private int awayTeam;

    public Score(int homeTeam, int awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public int getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(int homeTeam) {
        this.homeTeam = homeTeam;
    }

    public int getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(int awayTeam) {
        this.awayTeam = awayTeam;
    }

    @Override
    public String toString() {
        return "ScoreEntity{" +
                "homeTeam=" + homeTeam +
                ", awayTeam=" + awayTeam +
                '}';
    }
}
