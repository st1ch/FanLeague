package com.fanleagueent.fanleague.domain.models.games;

import com.fanleagueent.fanleague.data.entity.entities.user.UserEntity;
import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 29.12.16.
 */

public class CreateBetDataEntity {

    @SerializedName("userEntity")
    private UserEntity userEntity;

    @SerializedName("betEntity")
    private BetEntity betEntity;

    @SerializedName("gameweekEntity")
    private GameweekEntity gameweekEntity;

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public BetEntity getBetEntity() {
        return betEntity;
    }

    public void setBetEntity(BetEntity betEntity) {
        this.betEntity = betEntity;
    }

    public GameweekEntity getGameweekEntity() {
        return gameweekEntity;
    }

    public void setGameweekEntity(GameweekEntity gameweekEntity) {
        this.gameweekEntity = gameweekEntity;
    }
}
