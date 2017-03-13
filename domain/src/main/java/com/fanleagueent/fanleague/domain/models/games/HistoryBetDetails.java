package com.fanleagueent.fanleague.domain.models.games;

/**
 * Created by st1ch on 02.02.17.
 */

public class HistoryBetDetails {

  private HistoryBet historyBet;
  private Gameweek gameweek;

  public HistoryBetDetails(HistoryBet historyBet, Gameweek gameweek) {
    this.historyBet = historyBet;
    this.gameweek = gameweek;
  }

  public HistoryBet getHistoryBet() {
    return historyBet;
  }

  public void setHistoryBet(HistoryBet historyBet) {
    this.historyBet = historyBet;
  }

  public Gameweek getGameweek() {
    return gameweek;
  }

  public void setGameweek(Gameweek gameweek) {
    this.gameweek = gameweek;
  }

  @Override public String toString() {
    return "HistoryBetDetails{" +
        "historyBetEntity=" + historyBet +
        ", gameweekEntity=" + gameweek +
        '}';
  }
}
