package com.fanleagueent.fanleague.domain.models.games;

import com.fanleagueent.fanleague.domain.models.user.User;

/**
 * Created by st1ch on 29.12.16.
 */

public class CreateBetData {

    private User userEntity;
    private Bet bet;
    private Gameweek gameweek;

    public User getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(User userEntity) {
        this.userEntity = userEntity;
    }

    public Bet getBet() {
        return bet;
    }

    public void setBet(Bet bet) {
        this.bet = bet;
    }

    public Gameweek getGameweek() {
        return gameweek;
    }

    public void setGameweek(Gameweek gameweek) {
        this.gameweek = gameweek;
    }
}
