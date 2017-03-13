package com.fanleagueent.fanleague.domain.models.games;

/**
 * Created by st1ch on 22.12.16.
 */

public class CurrentBetData {

    private Gameweek gameweek;
    private Bet bet;

    public CurrentBetData(Gameweek gameweek, Bet bet) {
        this.gameweek = gameweek;
        this.bet = bet;
    }

    public Gameweek getGameweek() {
        return gameweek;
    }

    public void setGameweek(Gameweek gameweek) {
        this.gameweek = gameweek;
    }

    public Bet getBet() {
        return bet;
    }

    public void setBet(Bet bet) {
        this.bet = bet;
    }
}
