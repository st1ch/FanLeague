package com.fanleagueent.fanleague.data.entity.entities.games;

import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 22.12.16.
 */

public class ResultEntity {

    @SerializedName("score")
    private ScoreEntity scoreEntity;

    @SerializedName("home_wins")
    private boolean homeWins;

    @SerializedName("away_wins")
    private boolean awayWins;

    @SerializedName("draw")
    private boolean draw;

    public ScoreEntity getScoreEntity() {
        return scoreEntity;
    }

    public void setScoreEntity(ScoreEntity scoreEntity) {
        this.scoreEntity = scoreEntity;
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
                "scoreEntity=" + scoreEntity +
                ", homeWins=" + homeWins +
                ", awayWins=" + awayWins +
                ", draw=" + draw +
                '}';
    }
}
