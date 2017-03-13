package com.fanleagueent.fanleague.domain.models.games;

/**
 * Created by st1ch on 22.12.16.
 */

public class Result {

    private Score score;
    private boolean homeWins;
    private boolean awayWins;
    private boolean draw;

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public boolean isHomeWins() {
        return homeWins;
    }

    public void setHomeWins(boolean homeWins) {
        this.homeWins = homeWins;
    }

    public boolean isAwayWins() {
        return awayWins;
    }

    public void setAwayWins(boolean awayWins) {
        this.awayWins = awayWins;
    }

    public boolean isDraw() {
        return draw;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }

    @Override
    public String toString() {
        return "ResultEntity{" +
                "scoreEntity=" + score +
                ", homeWins=" + homeWins +
                ", awayWins=" + awayWins +
                ", draw=" + draw +
                '}';
    }
}
