package com.fanleagueent.fanleague.domain.models.games;

import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 22.12.16.
 */

public class CurrentBetDataEntity {

    @SerializedName("gameweekEntity")
    private GameweekEntity gameweekEntity;

    @SerializedName("betEntity")
    private BetEntity betEntity;

    public CurrentBetDataEntity(GameweekEntity gameweekEntity, BetEntity betEntity) {
        this.gameweekEntity = gameweekEntity;
        this.betEntity = betEntity;
    }

    public GameweekEntity getGameweekEntity() {
        return gameweekEntity;
    }

    public void setGameweekEntity(GameweekEntity gameweekEntity) {
        this.gameweekEntity = gameweekEntity;
    }

    public BetEntity getBetEntity() {
        return betEntity;
    }

    public void setBetEntity(BetEntity betEntity) {
        this.betEntity = betEntity;
    }
}
